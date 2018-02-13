package pl.sdacademy.rafalstanula.designpatterns.prototype;

public class BaseObject implements Cloneable{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BaseObject(String name) {
        this.name = name;
    }

    public BaseObject clone() {
        return new BaseObject(name);
    }

    @Override
    public String toString() {
        return "BaseObject{" +
                "name='" + name + '\'' +
                '}';
    }
}
