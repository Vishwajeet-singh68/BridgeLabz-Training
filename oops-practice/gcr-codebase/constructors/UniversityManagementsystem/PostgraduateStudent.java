public class PostgraduateStudent extends Student {
    public PostgraduateStudent(int rollNumber, String name, float CGPA) {
        super(rollNumber, name, CGPA);
    }

    public void displayDetails() {
        System.out.println("Postgraduate Student Details:");
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + super.getCGPA());
    }
    public static void main(String[] args) {
        PostgraduateStudent pgStudent = new PostgraduateStudent(102, "Alice Smith", 3.8f);
        pgStudent.displayDetails();
    }
}
    
