package org.simonscode.kinslay3r.original;

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
