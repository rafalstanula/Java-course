package pl.sdacademy.rafalstanula.designpatterns.prototype;

public class CustomObject extends BaseObject {
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public CustomObject(String name, int number) {
        super(name);
        this.number = number;
    }

    @Override
    public BaseObject clone() {
        return new CustomObject(getName(), number);
    }

    @Override
    public String toString() {
        return "CustomObject{" +
                "number=" + number +
                '}';
    }
}
