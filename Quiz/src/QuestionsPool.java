import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "questions")
public class QuestionsPool {

    private List<Question> questionsList;

    public List<Question> getQuestionsList() {
        return questionsList;
    }

    @XmlElement(name = "question")
    public void setQuestionsList(List<Question> questionsList) {
        this.questionsList = questionsList;
    }
}
