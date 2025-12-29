package LinkedList.TaskScheduler;

public class Main {
    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();
        scheduler.addAtBeginning(1, "Task1", 3, "2025-07-04");
        scheduler.addAtEnd(2, "Task2", 1, "2025-07-05");
        scheduler.addAtPosition(2, 3, "Task3", 2, "2025-07-06");
        System.out.println("All tasks:");
        scheduler.displayAll();
        scheduler.viewCurrentAndMove();
        scheduler.searchByPriority(2);
        scheduler.removeByTaskId(2);
        System.out.println("After deletion:");
        scheduler.displayAll();
    }
}
