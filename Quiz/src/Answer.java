import javax.xml.bind.annotation.XmlAttribute;

public class Answer {

    private String content;

    public Answer() {
    }

    public Answer(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @XmlAttribute
    public void setContent(String content) {
        this.content = content;
    }

}
