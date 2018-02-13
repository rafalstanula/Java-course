package pl.sdacademy.rafalstanula.designpatterns;

public class Address {
    private String street;
    private String city;

    private Address(Builder builder) {
        this.street = builder.street;
        this.city = builder.city;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String street;
        private String city;

        public Builder street(String street) {
            this.street = street;

            return this;
        }

        public Builder city(String city) {
            this.city = city;

            return this;
        }

        public Address build() {
            return new Address(this);
        }
    }
}
