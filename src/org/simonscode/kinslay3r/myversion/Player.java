package org.simonscode.kinslay3r.myversion;

public class Player {
    // I made the fields final, since I am not expecting either of them to change and
    // if they should have to change, the compiler will not allow me to and
    // therefore make me recheck the usages of the field
    private final String name;

    // I just simplified the height to a double,
    // representing the height in meters
    private final double height;

    // Take the values for the fields in the constructor
    // I added the 'final's here, since the arguments are read-only and should allow compiler optimisation
    // This is not required, though
    public Player(final String name, final double height) {
        this.name = name;
        this.height = height;
    }

    // Since the values of name and height are unlikely to change,
    // I only allow them to be set in the constructor and leave out setters

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }
}
