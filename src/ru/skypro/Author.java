package ru.skypro;

import java.util.Objects;

public class Author {
    String firstName;
    String secondName;

    public Author(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }
    public String getFirstName() {
        return this.firstName;
    }

    public String getSecondName() {
        return this.secondName;
    }

    public String toString() {
        return this.firstName + " " + this.secondName;
    }
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (this.getClass() != other.getClass() || other.getClass() == null) {
            return false;
        }
        Author b2 = (Author) other;
        return (firstName.equals(b2.firstName) && secondName.equals(b2.secondName));
    }
    public int hashCode() {
        return Objects.hash(firstName, secondName);
    }
}


