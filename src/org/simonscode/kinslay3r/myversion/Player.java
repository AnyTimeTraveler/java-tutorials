package org.simonscode.kinslay3r.myversion;

public class Player {
    private String name;
    private double height;

    public Player(String name, double height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }
}
