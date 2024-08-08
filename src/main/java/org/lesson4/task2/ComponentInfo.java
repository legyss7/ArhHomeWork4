package org.lesson4.task2;

/**
 * Информация о детали
 */
public class ComponentInfo {

    private int id;
    private String description;

    public ComponentInfo(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return String.format("#%d - %s", id, description);
    }
}

