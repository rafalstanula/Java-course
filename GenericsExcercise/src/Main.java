public class Main {

    public static void main(String[] args) {
        MySet<String> myMap = new MySet<>();
        System.out.println(myMap.add("Rafał"));
        myMap.add("Karol");
        myMap.add("Piotr");
        myMap.add("Jan");

        System.out.println(myMap.contain(4));
    }
}
