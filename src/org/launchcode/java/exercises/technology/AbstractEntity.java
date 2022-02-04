package org.launchcode.java.exercises.technology;

public abstract  class AbstractEntity {
    private int id;
    private static int nextId = 1;

    public AbstractEntity() {
        id = nextId;
        nextId++;
    }

    public int getId() {
        return this.id;
    }
}
