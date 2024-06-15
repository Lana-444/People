package org.example;

public class PersonBuilder {

    private String name;
    private String surname;
    private int age ;
    private String address;
    private boolean hasAge;


    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        this.hasAge = true;
        return this;
    }


    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        Person person = new Person(name, surname, address);
        if (age > 0) {
            person.setAge(age);
        }
        if (address != null) {
            person.setAddress(address);
        }
        return person;
    }
}
