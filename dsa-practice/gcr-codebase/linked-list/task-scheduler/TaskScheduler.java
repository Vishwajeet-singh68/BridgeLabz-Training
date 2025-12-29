package LinkedList.TaskScheduler;

public class TaskScheduler {
    private Task head;

    public TaskScheduler() {
        head = null;
    }

    // Add at beginning
    public void addAtBeginning(int taskId, String taskName, int priority, String dueDate) {
        Task newNode = new Task(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            Task last = head;
            while (last.next != head) {
                last = last.next;
            }
            newNode.next = head;
            last.next = newNode;
            head = newNode;
        }
    }

    // Add at end
    public void addAtEnd(int taskId, String taskName, int priority, String dueDate) {
        Task newNode = new Task(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            Task last = head;
            while (last.next != head) {
                last = last.next;
            }
            last.next = newNode;
            newNode.next = head;
        }
    }

    // Add at position
    public void addAtPosition(int position, int taskId, String taskName, int priority, String dueDate) {
        if (position < 1) {
            System.out.println("Invalid position");
            return;
        }
        if (position == 1) {
            addAtBeginning(taskId, taskName, priority, dueDate);
            return;
        }
        Task newNode = new Task(taskId, taskName, priority, dueDate);
        Task current = head;
        for (int i = 1; i < position - 1 && current.next != head; i++) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    // Remove by task ID
    public void removeByTaskId(int taskId) {
        if (head == null) return;
        Task current = head, prev = null;
        do {
            if (current.taskId == taskId) {
                if (current == head && current.next == head) {
                    head = null;
                } else if (current == head) {
                    Task last = head;
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
        System.out.println("Task ID not found");
    }

    // View current and move to next
    public void viewCurrentAndMove() {
        if (head == null) {
            System.out.println("No tasks");
            return;
        }
        System.out.println("Current task: " + head.taskId + ", " + head.taskName + ", " + head.priority + ", " + head.dueDate);
        head = head.next;
    }

    // Display all tasks
    public void displayAll() {
        if (head == null) return;
        Task current = head;
        do {
            System.out.println(current.taskId + ", " + current.taskName + ", " + current.priority + ", " + current.dueDate);
            current = current.next;
        } while (current != head);
    }

    // Search by priority
    public void searchByPriority(int priority) {
        if (head == null) return;
        Task current = head;
        do {
            if (current.priority == priority) {
                System.out.println(current.taskId + ", " + current.taskName + ", " + current.priority + ", " + current.dueDate);
            }
            current = current.next;
        } while (current != head);
    }
}
