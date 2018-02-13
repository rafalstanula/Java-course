package pl.sdacademy.rafalstanula.designpatterns;

public class Person {
    private String name;
    private String surname;
    private String id;
    private Address address;
    private int height;
    private boolean adult;

    private Person(Builder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
        this.id = builder.id;
        this.address = builder.address;
        this.height = builder.height;
        this.adult = builder.adult;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getId() {
        return id;
    }

    public Address getAddress() {
        return address;
    }

    public int getHeight() {
        return height;
    }

    public boolean isAdult() {
        return adult;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id='" + id + '\'' +
                ", address='" + address + '\'' +
                ", height=" + height +
                ", adult=" + adult +
                '}';
    }


    public static final class Builder {
        private String name;
        private String surname;
        private String id;
        private Address address;
        private int height;
        private boolean adult;

        private Builder() {
        }

        public Person build() {
            return new Person(this);
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder address(Address address) {
            this.address = address;
            return this;
        }

        public Builder height(int height) {
            this.height = height;
            return this;
        }

        public Builder adult(boolean adult) {
            this.adult = adult;
            return this;
        }
    }
}
