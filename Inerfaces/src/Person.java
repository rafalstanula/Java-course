public class Person implements Comparable<Person> {

    private int age;
    private String firstName;
    private String lastName;

    public Person( String firstName, String lastName, int age) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public int compareTo(Person person) {
        if(this.firstName.compareTo(person.firstName) > 0){
            return 1;
        }
        if(this.firstName.compareTo(person.firstName) < 0){
            return -1;
        }
        else {
            if (this.lastName.compareTo(person.lastName) > 0) {
                return 1;
            }
            if (this.lastName.compareTo(person.lastName) < 0) {

                return -1;
            }
            else{
                return 0;
            }
        }
    }

    @Override
    public String toString() {
        return firstName + " " + lastName +", lat: "+ age;
    }
}
