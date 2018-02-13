package pl.sdacademy.rafalstanula.designpatterns.state;

public class LowerCaseState implements State {
    @Override
    public void print(StateMachine stateMachine, String text) {
        System.out.println(text.toLowerCase());

        stateMachine.setState(new UpperCaseState());
    }
}
