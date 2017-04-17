package com.company;
import java.util.Scanner;

public class Game {
    public void runRPG() {
        // Prints the intro and the initial choice to continue
        System.out.println("You awaken in the darkness with a throbbing pain in your neck.  Your skin feels cold and your senses heightened sharply.\n" +
                "But in this pitch blackness and deadening quiet you cannot see or hear anything.  As you rise to your feet you hear a voice speak to you.\n" +
                "\n" +
                "\"Arise, childe.  A great privilege has been given to you.  The dark gift, eternal life, has been made yours.\n" +
                "You are now reborn a creature of the night.  But such gifts have a price.  You are bound to us now, as servant to its master.\n" +
                "And you will serve us forever until we release you.  Show us now that the dark gift was not misplaced.  Do as we command.\"\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you submit to their demands?");
        String submission = scanner.next();

        switch (submission) {
            case "Yes":
                System.out.println("The voice grunts approvingly from its hidden perch.\n" + "\"A wise decision, childe. You show promise in your obedience.\"" +
                "\n"+
                "There is a grating sound from behind as a single sliver of light slices through the void.  Only a sliver, and hardly enough to illuminate the\n" +
                "chamber in which you stand.");
                break;
            case "No":
                System.out.println("\"Folly! Such insolence. Perhaps we were mistaken in choosing such an arrogant and disobedient childe.\n" +
                        "We shall dispatch you like the other failures.\"" +
                        "\n" +
                        "What comes next is the sensation of a cold clammy claw reaching out and clasping your throat. Its vice-like grip is quick and efficient.\n" +
                        "The last sound you hear is the snapping of your own neck.");
                return;
        }

        System.out.println("Do you approach the light?");
        String approachLight = scanner.next();

        switch(approachLight) {
            case "Yes":
                System.out.println("\"So eager, but you move when no order has been given.  Stay and listen.");
                break;
            case "No":
                break;
        }

    }
}
