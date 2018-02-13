package pl.sdacademy.rafalstanula.designpatterns.prototype;

public class MyObject extends BaseObject {
    private boolean flag;

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public MyObject(String name, boolean flag) {
        super(name);
        this.flag = flag;
    }

    @Override
    public BaseObject clone() {
        return new MyObject(getName(), flag);
    }

    @Override
    public String toString() {
        return "MyObject{" +
                "flag=" + flag +
                '}';
    }
}
