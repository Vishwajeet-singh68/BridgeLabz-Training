package LinkedList.RoundRobinScheduler;

public class Main {
    public static void main(String[] args) {
        RoundRobinScheduler scheduler = new RoundRobinScheduler(2);
        scheduler.addAtEnd(1, 10, 3);
        scheduler.addAtEnd(2, 5, 1);
        scheduler.addAtEnd(3, 8, 2);
        System.out.println("Initial processes:");
        scheduler.displayAll();
        scheduler.simulateRoundRobin();
        scheduler.removeByProcessId(2);
        System.out.println("After deletion:");
        scheduler.displayAll();
    }
}
