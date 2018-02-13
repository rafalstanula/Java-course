import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	Person [] people = new Person[7];

	people[0] = new Person("Jan", "Kowalski", 45);
	people[1] = new Person("Jan", "Nowak", 25);
	people[2] = new Person("Dominik", "Iksiński", 49);
	people[3] = new Person("Piotr", "Kowalczyk", 55);
	people[4] = new Person("Sebastian", "Małysz", 95);
	people[5] = new Person("Sebastian", "Adamowski", 84);
	people[6] = new Person("Sebastian", "Kubica", 85);

        Arrays.sort(people);

        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }
    }


}
