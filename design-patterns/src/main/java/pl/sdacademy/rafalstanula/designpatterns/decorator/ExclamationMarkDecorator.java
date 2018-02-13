package pl.sdacademy.rafalstanula.designpatterns.decorator;

public class ExclamationMarkDecorator implements Motto {
    private Motto motto;

    public ExclamationMarkDecorator(Motto motto) {
        this.motto = motto;
    }

    @Override
    public String getMotto() {
        return motto.getMotto() + "!";
    }
}
