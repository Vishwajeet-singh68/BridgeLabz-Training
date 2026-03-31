package LinkedList.RoundRobinScheduler;

public class RoundRobinScheduler {

    private Process head;
    private int timeQuantum;

    public RoundRobinScheduler(int timeQuantum) {
        head = null;
        this.timeQuantum = timeQuantum;
    }

    // Add at end
    public void addAtEnd(int processId, int burstTime, int priority) {
        Process newNode = new Process(processId, burstTime, priority);
        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            Process last = head;
            while (last.next != head) {
                last = last.next;
            }
            last.next = newNode;
            newNode.next = head;
        }
    }

    // Remove by process ID
    public void removeByProcessId(int processId) {
        if (head == null) return;
        Process current = head, prev = null;
        do {
            if (current.processId == processId) {
                if (current == head && current.next == head) {
                    head = null;
                } else if (current == head) {
                    Process last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = current.next;
                }
                return;
            }
            prev = current;
            current = current.next;
        } while (current != head);
        System.out.println("Process ID not found");
    }

    // Simulate round-robin
    public void simulateRoundRobin() {
        if (head == null) return;
        Process current = head;
        int totalWaitingTime = 0;
        int totalTurnaroundTime = 0;
        int completed = 0;
        int currentTime = 0;
        int[] waitingTimes = new int[10]; // Assuming max 10 processes
        int[] turnaroundTimes = new int[10];
        do {
            if (current.burstTime > 0) {
                int executionTime = Math.min(timeQuantum, current.burstTime);
                current.burstTime -= executionTime;
                currentTime += executionTime;
                if (current.burstTime == 0) {
                    turnaroundTimes[current.processId - 1] = currentTime;
                    waitingTimes[current.processId - 1] = turnaroundTimes[current.processId - 1] - executionTime;
                    completed++;
                }
                System.out.println("Process " + current.processId + " executed for " + executionTime + " units");
            }
            current = current.next;
        } while (completed < countProcesses());
        for (int i = 0; i < 10; i++) {
            totalWaitingTime += waitingTimes[i];
            totalTurnaroundTime += turnaroundTimes[i];
        }
        System.out.println("Average Waiting Time: " + (double) totalWaitingTime / countProcesses());
        System.out.println("Average Turnaround Time: " + (double) totalTurnaroundTime / countProcesses());
    }

    // Display all processes
    public void displayAll() {
        if (head == null) return;
        Process current = head;
        do {
            System.out.println(current.processId + ", " + current.burstTime + ", " + current.priority);
            current = current.next;
        } while (current != head);
    }

    // Count processes
    private int countProcesses() {
        if (head == null) return 0;
        int count = 0;
        Process current = head;
        do {
            count++;
            current = current.next;
        } while (current != head);
        return count;
    }
}
