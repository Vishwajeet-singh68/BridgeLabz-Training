package Generics.resumescreening;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Resume<SoftwareEngineer> resume1 = new Resume<>(new SoftwareEngineer());
        Resume<DataScientist> resume2 = new Resume<>(new DataScientist());
        Resume<ProductManager> resume3 = new Resume<>(new ProductManager());

        resume1.processResume();
        resume2.processResume();
        resume3.processResume();

        List<JobRole> jobRoles = new ArrayList<>();
        jobRoles.add(new SoftwareEngineer());
        jobRoles.add(new DataScientist());
        jobRoles.add(new ProductManager());

        System.out.println("Batch Screening:");
        Resume.screenResumes(jobRoles);
    }
}
