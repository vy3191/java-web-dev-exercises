package org.launchcode.java.practice.chapter7;

import java.util.Objects;

public class Account {
    private static int nextId = 1;
    private int id;

    private String firstName;
    private String lastName;

    public Account(String aFirstName, String aLastName) {
        this();
        this.firstName = aFirstName;
        this.lastName = aLastName;
    }

    public String getDisplayName() {
        return this.firstName+" "+this.lastName;
    }

    public Account() {
        this.id = this.nextId;
        this.nextId++;
    }

    public int getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return this.lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return id == account.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return this.lastName + ","+this.firstName;
    }


}
