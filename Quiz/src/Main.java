import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Main {

    public static void main(String args[]) {

        try {
            File file = new File("C:\\Users\\Caldoris\\IdeaProjects\\Quiz\\file.xml");
            JAXBContext context = JAXBContext.newInstance(QuestionsPool.class);

            Unmarshaller unmarshaller = context.createUnmarshaller();
            QuestionsPool questionsPool = (QuestionsPool) unmarshaller.unmarshal(file);

            Quiz quiz = new Quiz(questionsPool);
            quiz.start();

        } catch (JAXBException exception) {
            System.out.println("It doesn't work");
            exception.printStackTrace();
        }
    }
}