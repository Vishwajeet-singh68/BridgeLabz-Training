
public class Course {
    static String instituteName="BridgeLabz";

    String courseName;
    int courseDuration; 
    double courseFee;

    Course(String courseName, int courseDuration, double courseFee){
        this.courseName = courseName;
        this.courseDuration = courseDuration;
        this.courseFee = courseFee;
    }

    public void displayCourseDetails(){
        System.out.println("Institute Name: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Duration: " + courseDuration + " months");
        System.out.println("Course Fee: $" + courseFee);
        System.out.println("-----------------------------");
    }
    public static void updateInstituteName(String newName){
        instituteName=newName;
    }
    public static void main(String[] args) {
        Course course1 = new Course("Java Programming", 6, 500.00);
        Course course2 = new Course("Web Development", 4, 400.00);

        course1.displayCourseDetails();
        course2.displayCourseDetails();

        Course.updateInstituteName("Tech Academy");

        Course course3 = new Course("Data Science", 8, 800.00);
        course3.displayCourseDetails();
    }
}
