package LinkedList.StudentRecordManagement;

public class StudentLinkedList {
    Student head;

    void add(int rollNumber, String name, int age, char grade){
        Student newNode=new Student(rollNumber, name, age, grade);
        if(head == null){
            head=newNode;
            return;
        }

        Student temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }

    void addFirst(int rollNumber, String name, int age, char grade){
        Student newNode=new Student(rollNumber, name, age, grade);
        newNode.next=head;
        head=newNode;
    }

    void addAt(int pos, int rollNumber, String name, int age, char grade){
        if(pos==1) {
            addFirst(rollNumber, name, age, grade);
            return;
        }

        Student newNode=new Student(rollNumber, name, age, grade);
        Student temp=head;
        for(int i=1;i<pos-1 && temp!=null;i++){
            temp=temp.next;
        }

        if(temp==null){
            System.out.println("Invalid position");
            return;
        }

        newNode.next=temp.next;
        temp.next=newNode;
    }

    void searchByRollNumber(int rollNumber){
        Student temp=head;
        while(temp!=null) {
            if (temp.rollNumber == rollNumber){
                System.out.println("Roll Number:"+temp.rollNumber);
                System.out.println("Name:"+temp.name);
                System.out.println("Age:"+temp.age);
                System.out.println("Grade:"+temp.grade+"\n--------------------");
                return;
            }
            temp=temp.next;
        }
        System.out.println("No Student Found!");
    }

    void updateByRollNumber(int rollNumber, char grade){
        Student temp=head;
        while(temp!=null) {
            if (temp.rollNumber == rollNumber){
                temp.grade=grade;
                return;
            }
            temp=temp.next;
        }
        System.out.println("No Student Found!");
    }

    void deleteByRollNumber(int rollNumber){
        if(head==null){
            System.out.println("No Student found");
            return;
        }
        if(head.rollNumber==rollNumber){
            head=head.next;
            return;
        }

        Student curr=head.next, prev=head;
        while(curr!=null) {
            if (curr.rollNumber == rollNumber){
                prev.next=curr.next;
                return;
            }
            prev=curr;
            curr=curr.next;
        }
        System.out.println("No Student Found!");
    }

    void displayAll(){
        Student temp=head;
        while(temp!=null){
            System.out.println("Roll Number:"+temp.rollNumber);
            System.out.println("Name:"+temp.name);
            System.out.println("Age:"+temp.age);
            System.out.println("Grade:"+temp.grade+"\n-------------------");
            temp=temp.next;
        }
    }
}
