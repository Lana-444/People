package org.example;

import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String address;
    protected boolean hasAge;
    protected boolean hasAddress;


    public Person(String name, String surname, String address) {
        this.name = name;
        this.surname = surname;
        this.hasAge = false;
        this.hasAddress = false;

    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder builder = new PersonBuilder();
        builder.setSurname(surname);
        builder.setAddress(this.address);
        return builder;
    }

    public boolean hasAge() {
        return hasAge;
    }

    public boolean hasAddress() {
        return hasAddress;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public OptionalInt getAge() {
        return OptionalInt.of(age);
    }

    public void setAge(int age) {
        this.age = age;
        this.hasAge = true;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
        this.hasAddress = true;
    }

    public void happyBirthday() {
        if (hasAge) {
            this.age++;
        }
    }

    @Override
    public String toString() {
        return "Person:" +
                " Имя:" + name + "," +
                " Фамилия:" + surname + "," +
                " Возраст:" + age + "," +
                " Город:" + address + ".";

    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((address == null) ? 0 : address.hashCode());
        result = prime * result + age;
        return result;
    }

}

