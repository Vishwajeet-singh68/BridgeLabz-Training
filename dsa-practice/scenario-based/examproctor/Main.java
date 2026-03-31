package dsapractice.examproctor;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Map<Integer, String> correctAnswers = new HashMap<>();
        correctAnswers.put(1, "A");
        correctAnswers.put(2, "B");
        correctAnswers.put(3, "C");

        ExamProctorSystem examProctor = new ExamProctorSystem(correctAnswers);
        Scanner scanner = new Scanner(System.in);

        examProctor.navigateToQuestion(1);
        System.out.print("Enter answer for question 1: ");
        String answer1 = scanner.nextLine();
        examProctor.answerQuestion(1, answer1);

        examProctor.navigateToQuestion(2);
        System.out.print("Enter answer for question 2: ");
        String answer2 = scanner.nextLine();
        examProctor.answerQuestion(2, answer2);

        examProctor.navigateToQuestion(3);
        System.out.print("Enter answer for question 3: ");
        String answer3 = scanner.nextLine();
        examProctor.answerQuestion(3, answer3);

        int score = examProctor.calculateScore();
        System.out.println("Final Score: " + score + "/" + correctAnswers.size());
	}
}
