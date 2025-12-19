import java.util.*;
public class AmarAkbarAnthony {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter ages of Amar, Akbar,  Anthony respectively:");
        int amarAge = in.nextInt();
        int akbarAge = in.nextInt();
        int anthonyAge = in.nextInt();
        System.out.print("Enter heights of Amar, Akbar,  Anthony respectively:");
        int amarHeight = in.nextInt();
        int akbarHeight = in.nextInt();
        int anthonyHeight = in.nextInt();
        if(amarAge < akbarAge && amarAge < anthonyAge){
            System.out.println("Amar is the youngest.");
        }else if(akbarAge < anthonyAge){
            System.out.println("Akbar is the youngest.");
        }else{
            System.out.println("Anthony is the youngest.");
        }
        if(amarHeight > akbarHeight && amarHeight > anthonyHeight){
            System.out.println("Amar is the tallest.");
        }else if(akbarHeight > anthonyHeight){
            System.out.println("Akbar is the tallest.");
        }else{
            System.out.println("Anthony is the tallest.");
        }
    }
}