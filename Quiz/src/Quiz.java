import java.util.List;
import java.util.Scanner;

public class Quiz {

    private QuestionsPool questionsPool;
    private Scanner scanner;
    private int result;
    private String userAnswer;


    public Quiz(QuestionsPool questionsPool) {
        this.questionsPool = questionsPool;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        List<Question> questionList = questionsPool.getQuestionsList();
        String nextChance = "tak";

        while (nextChance.equals("tak")) {
            for (Question q : questionList) {
                System.out.println(q.getNr() + ". " + q.getContent());
                System.out.println("A: " + q.getA().getContent());
                System.out.println("B: " + q.getB().getContent());
                System.out.println("C: " + q.getC().getContent());

                userAnswer = scanner.nextLine();

                if (userAnswer.toLowerCase().equals(q.getCorrectAnswer())) {
                    result++;
                }
            }
            System.out.println("Twój wynik to: " + result + "/" + questionList.size());
            System.out.println("Czy chcesz spróbować ponownie? TAK/NIE");
            nextChance = scanner.nextLine().toLowerCase();
        }
    }
}
