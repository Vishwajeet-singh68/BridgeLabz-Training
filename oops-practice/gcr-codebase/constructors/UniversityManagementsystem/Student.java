public class Student {
    public int rollNumber;
    protected String name;
    private float CGPA;
    
    public Student(int rollNumber, String name, float CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public float getCGPA() {
        return CGPA;
    }
}
