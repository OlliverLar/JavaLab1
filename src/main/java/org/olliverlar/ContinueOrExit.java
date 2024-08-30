package org.olliverlar;

import java.util.Scanner; // Importing scanner class

public class ContinueOrExit {
    public static void continueOrExit() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tryck på enter för att gå tillbaka till menyn");

        scanner.nextLine();
        Menu.menu();

    }
}
