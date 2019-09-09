package org.simonscode.kinslay3r;

public class Player {
    private String name;
    public Height height;

    public Player(String name, Height height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }
}
