package LinkedList.MovieManagementSystem;

public class MovieDoublyLinkedList {
    Movie head, tail;

    void add(String title, String director, int yearOfRelease, float rating){
        Movie newNode=new Movie(title, director, yearOfRelease, rating);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.prev=tail;
        tail.next=newNode;
        tail=newNode;
    }

    void addFirst(String title, String director, int yearOfRelease, float rating){
        Movie newNode=new Movie(title, director, yearOfRelease, rating);
        if(head == null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }

    void addAt(int pos, String title, String director, int yearOfRelease, float rating){
        if(pos==1) {
            addFirst(title, director, yearOfRelease, rating);
            return;
        }
        Movie newNode=new Movie(title, director, yearOfRelease, rating);
        Movie temp=head;
        for(int i=1;i<pos-1 && temp!=null;i++){
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("Invalid Position");
            return;
        }

        if(temp.next==null){
            temp.next=newNode;
            newNode.prev=temp;
            tail=newNode;
            return;
        }

        Movie next=temp.next;
        temp.next=newNode;
        newNode.prev=temp;
        newNode.next=next;
        next.prev=newNode;
    }

    void removeMovieByTitle(String title){
        if(head==null){
            System.out.println("No match found");
            return;
        }
        if(head.title.equalsIgnoreCase(title)){
            head=head.next;
            if(head!=null)
                head.prev=null;
            else
                tail=null;
            return;
        }

        Movie temp=head;
        while(temp.next!=null){
            if(temp.next.title.equalsIgnoreCase(title)){
                Movie delete=temp.next, next=delete.next;
                if(next==null) {
                    temp.next = null;
                    tail=temp;
                }

                else {
                    temp.next = next;
                    next.prev=temp;
                }
                return;
            }
            temp=temp.next;
        }
        System.out.println("No Match Found");
    }

    void updateRatingByTitle(String title, float rating){
        Movie temp=head;
        while(temp!=null){
            if(temp.title.equalsIgnoreCase(title)){
                temp.rating = rating;
                return;
            }
            temp=temp.next;
        }
        System.out.println("No match found");
    }

    void searchMovieByDirectorOrRating(String director, float rating){
        Movie temp=head;
        boolean notFound = true;
        while(temp!=null){
            if(temp.director.equalsIgnoreCase(director) || temp.rating==rating){
                System.out.println(temp.title);
                System.out.println(temp.director);
                System.out.println(temp.rating);
                System.out.println(temp.yearOfRelease);
                notFound = false;
            }
            temp=temp.next;
        }
        if(notFound)
            System.out.println("No Mathc Found");
    }

    void display(){
        Movie temp=head;
        while(temp!=null){
            System.out.println(temp.title);
            System.out.println(temp.director);
            System.out.println(temp.rating);
            System.out.println(temp.yearOfRelease);
            System.out.println("--------------------");
            temp=temp.next;
        }
    }

    void displayInReverseOrder(){
        Movie temp=tail;
        while(temp!=null){
            System.out.println(temp.title);
            System.out.println(temp.director);
            System.out.println(temp.rating);
            System.out.println(temp.yearOfRelease);
            System.out.println("--------------------");
            temp=temp.prev;
        }
    }
}
