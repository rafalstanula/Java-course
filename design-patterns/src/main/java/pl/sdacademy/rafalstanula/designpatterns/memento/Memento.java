package pl.sdacademy.rafalstanula.designpatterns.memento;

import java.util.Stack;

public class Memento {
    Stack<MementoData> stack = new Stack<>();

    private MementoData data = new MementoData("", 0);

    public void set(String string, int number) {
        stack.push(data);
        this.data = new MementoData(string, number);
    }

    public void undo() {
        this.data = stack.pop();
    }

    @Override
    public String toString() {
        return data.string + " " + data.number;
    }

    private static class MementoData {
        public String string = "";
        public int number = 0;

        public MementoData(String string, int number) {
            this.string = string;
            this.number = number;
        }
    }
}
