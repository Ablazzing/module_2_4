package org.javaacademy.lesson4;

import java.util.Objects;

public class Child extends Object {
    private String firstName;
    private String lastName;
    private int yearBirth;

    public Child(String firstName, String lastName, int yearBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearBirth = yearBirth;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (!(obj instanceof Child)) {
//            return false;
//        }
//        Child anotherChild = (Child) obj;
//        return this.firstName.equals(anotherChild.firstName)
//                && this.lastName.equals(anotherChild.lastName)
//                && this.dateBirth.equals(anotherChild.dateBirth);
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Child child = (Child) o;
        return yearBirth == child.yearBirth
               && Objects.equals(firstName, child.firstName)
               && Objects.equals(lastName, child.lastName);
    }

    @Override
    public int hashCode() {
        return yearBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    @Override
    public String toString() {
        return "Child{" +
               "firstName='" + firstName + '\'' +
               ", lastName='" + lastName + '\'' +
               ", yearBirth=" + yearBirth +
               '}';
    }
}
