package test;

import java.io.Serializable;

public class User implements Serializable {

    private String name = "xxx...";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {

        this.name = name;
    }
}
