package org.simonscode.kinslay3r.original;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("kingslay3r", new Height(1.80));
        Player player2 = new Player("Simon", new Height(1.75));
        Player player3 = new Player("lhz", new Height(1.78));


        if (player1.height.getHeight() > player2.height.getHeight() && player1.height.getHeight() > player3.height.getHeight()) {
            System.out.println(player1.getName() + "is the tallest.");
        } else if (player2.height.getHeight() > player1.height.getHeight() && player2.height.getHeight() > player3.height.getHeight()) {
            System.out.println(player1.getName() + "is the tallest.");
        } else if (player3.height.getHeight() > player1.height.getHeight() && player3.height.getHeight() > player2.height.getHeight()) {
            System.out.println(player1.getName() + "is the tallest.");
        } else {
            System.out.println("All the football players have the same height.");
        }
    }
}
