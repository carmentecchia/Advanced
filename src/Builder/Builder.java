package Builder;

public class Builder {
    String firstName;
    String lastName;
    int age;
    String address;

    public Builder setFirstName (String firstName){
        this.firstName = firstName;
        return this;
    }

    public Builder setLastName (String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Builder setAge (int age) {
        this.age = age;
        return this;
    }

    public Builder setAddress (String address) {
        this.address = address;
        return this;
    }

    public Person build(){
        return new Person(firstName,lastName,age,address);
    }
}
