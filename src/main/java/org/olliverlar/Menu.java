package org.olliverlar;

import java.util.Objects;
import java.util.Scanner; // Importing scanner class

public class Menu {
        public static void menu() {
            Scanner selector = new Scanner(System.in);
            boolean exit = false;

            while (!exit) {
                // Menu options
                System.out.println("Elpriser");
                System.out.println("========");
                System.out.println("1. Inmatning");
                System.out.println("2. Min, Max och Medel");
                System.out.println("3. Sortera");
                System.out.println("4. Bästa Laddningstid (4h)");
                System.out.println("e. Avsluta");
                String selectedOption = selector.nextLine();

                switch (selectedOption) {
                    case "e", "E" -> {
                        System.out.println("Programet Avslutades");
                        exit = true;
                    }
                    case "1" -> {
                        Input.input();
                    }
                    case "2" -> {
                        MinMax.minMax();
                    }
                    case "3" -> {
                        Sort.sort();
                    }
                    case "4" -> {
                        BestCharge.bestCharge();
                    }
                    default -> {
                        System.out.println("Ogiltigt val försök igen!");
                        menu();
                    }
                }
            }
        }
            }



