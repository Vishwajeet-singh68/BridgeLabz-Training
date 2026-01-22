package dsapractice.examproctor;
import java.util.*;

public class ExamProctorSystem {
    private Stack<Integer> navigationStack;
    private Map<Integer, String> answersMap;
    private Map<Integer, String> correctAnswersMap;

    public ExamProctorSystem(Map<Integer, String> correctAnswers) {
        this.navigationStack = new Stack<>();
        this.answersMap = new HashMap<>();
        this.correctAnswersMap = correctAnswers;
    }

    public void navigateToQuestion(int questionID) {
        navigationStack.push(questionID);
        System.out.println("Navigated to question: " + questionID);
    }

    public void answerQuestion(int questionID, String answer) {
        answersMap.put(questionID, answer);
        System.out.println("Answered question " + questionID + " with: " + answer);
    }

    public int calculateScore() {
        int score = 0;
        for (Map.Entry<Integer, String> entry : correctAnswersMap.entrySet()) {
            int questionID = entry.getKey();
            String correctAnswer = entry.getValue();
            String studentAnswer = answersMap.get(questionID);
            if (correctAnswer.equals(studentAnswer)) {
                score++;
            }
        }
        return score;
    }
}
