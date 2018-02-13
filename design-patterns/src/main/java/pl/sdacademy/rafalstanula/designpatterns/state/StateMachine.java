package pl.sdacademy.rafalstanula.designpatterns.state;

public class StateMachine {
    private State state = new LowerCaseState();

    public void setState(State state) {
        this.state = state;
    }

    public void print(String text) {
        state.print(this, text);
    }
}
