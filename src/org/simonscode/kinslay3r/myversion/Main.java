package org.simonscode.kinslay3r.myversion;

public class Main {
    public static void main(String[] args) {

        // Create an array of the players that you can iterate through, using loops
        Player[] players = new Player[]{
                new Player("kingslay3r", 1.80),
                new Player("Simon", 1.75),
                new Player("lhz", 1.78)
        };

        // Initialize your outputs, so you don't get NullPointerException,
        // when comparing with the tallest player
        Player tallest = players[0];
        boolean allEqual = true;

        // Now, I create a loop that goes through the array of players and
        // checks if the each player is taller than the currently tallest player.
        // This has the following advantages:
        //  - it's easier to read
        //  - it doesn't matter how many players you add
        //  - adding other comparison is easy
        for (Player player : players) {

            // check if the currently selected player is taller than the currently tallest player
            if (player.getHeight() > tallest.getHeight()) {
                tallest = player;
            }

            // even if they are not taller, they might be smaller,
            // so we still need to check if they are not equal
            if (player.getHeight() != tallest.getHeight()) {
                allEqual = false;
            }
        }


        // then we print the results
        if (allEqual) {
            System.out.println("All the football players have the same ");
        } else {
            System.out.println(tallest.getName() + "is the tallest.");
        }
    }
}
