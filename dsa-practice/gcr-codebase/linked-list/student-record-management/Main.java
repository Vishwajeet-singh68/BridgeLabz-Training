package LinkedList.StudentRecordManagement;

public class Main {
    public static void main(String[] args) {
        StudentLinkedList list = new StudentLinkedList();

        list.addFirst(101, "Vishwajeet", 21, 'A');
        list.add(102, "Amit", 22, 'B');
        list.addAt(2, 103, "Rahul", 20, 'A');

        System.out.println("All Students:");
        list.displayAll();

        System.out.println("\nSearching Roll No 102:");
        list.searchByRollNumber(102);

        System.out.println("\nUpdating Grade:");
        list.updateByRollNumber(102, 'A');

        System.out.println("\nAfter Deletion:");
        list.deleteByRollNumber(101);
        list.displayAll();
    }
}
