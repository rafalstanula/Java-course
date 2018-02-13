import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "question")
public class Question {

    private int nr;
    private String content;
    private Answer A;
    private Answer B;
    private Answer C;
    private String correctAnswer;

    public Question() {
    }

    public Question(int nr, String content, Answer A, Answer B, Answer C, String correctAnswer) {
        this.nr = nr;
        this.content = content;
        this.A = A;
        this.B = B;
        this.C = C;
        this.correctAnswer = correctAnswer;
    }

    public int getNr() {
        return nr;
    }

    @XmlAttribute
    public void setNr(int nr) {
        this.nr = nr;
    }

    public String getContent() {
        return content;
    }

    @XmlAttribute
    public void setContent(String content) {
        this.content = content;
    }

    public Answer getA() {
        return A;
    }

    @XmlElement
    public void setA(Answer A) {
        this.A = A;
    }

    public Answer getB() {
        return B;
    }

    @XmlElement
    public void setB(Answer B) {
        this.B = B;
    }

    public Answer getC() {
        return C;
    }

    @XmlElement
    public void setC(Answer C) {
        this.C = C;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    @XmlAttribute
    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}
