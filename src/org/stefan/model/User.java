package org.stefan.model;

public class User {
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    @Override
    public String toString() {
        return "User [name=" + name + "]";
    }

}
