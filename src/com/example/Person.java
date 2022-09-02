package com.example;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person() {
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (this.age <= 0 && this.age >= 100) {
            this.age = 0;
        }else{
            this.age = age;
        }
    }

    public boolean isTeen() {
        if (this.age > 12 && this.age < 20) {
            return true;
        }
        return false;
    }

    public String getFullName() {
        if (this.firstName.isEmpty() && this.lastName.isEmpty()) {
            return "";
        }
        if (this.lastName.isEmpty()) {
            return this.firstName;
        }
        if (this.firstName.isEmpty()) {
            return this.lastName;
        }
        return this.firstName + " " +this.lastName;
    }
}
