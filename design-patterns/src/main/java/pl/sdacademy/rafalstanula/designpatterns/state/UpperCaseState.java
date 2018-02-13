package pl.sdacademy.rafalstanula.designpatterns.state;

public class UpperCaseState implements State {
    private int i = 0;

    @Override
    public void print(StateMachine stateMachine, String text) {
        System.out.println(text.toUpperCase());

        if(i < 2) {
            ++i;
        } else {
            stateMachine.setState(new LowerCaseState());
        }
    }
}
