package pl.sdacademy.rafalstanula.designpatterns.prototype;

public class Main {
    public static void main(String[] args) {
        BaseObject[] tab = new BaseObject[]{
            new BaseObject("Test"),
            new CustomObject("Test2", 5),
            new MyObject("Test3", true)
        };

        BaseObject[] copy = copy(tab);

        tab[0].setName("New");
        ((CustomObject)tab[1]).setNumber(10);

        for(int i = 0; i < tab.length;++i) {
            System.out.println(tab[i]);
        }
        System.out.println();
        for(int i = 0; i < tab.length;++i) {
            System.out.println(copy[i]);
        }
    }

    private static BaseObject[] copy(BaseObject[] tab) {
        BaseObject[] newTab = new BaseObject[tab.length];

        for(int i = 0; i < tab.length;++i) {
            newTab[i] = tab[i].clone();
        }

        return newTab;
    }
}
