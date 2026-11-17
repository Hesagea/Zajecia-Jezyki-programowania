package Zajecia_2;

import Zajecia_2.Zad1.Zad1_1;
import Zajecia_2.Zad2.Zad1_2;
import Zajecia_2.Zad3.Zad1_3;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n--- LABORATORIUM 2: KOLEKCJE W JAVIE ---");
            System.out.println("Zbiory (HashSet vs TreeSet) - 1 ");
            System.out.println("Listy (ArrayLst vs LinkedList) - 2 ");
            System.out.println("Mapy (HashMap vs TreeMap) - 3");
            System.out.println("Exit - 0");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    Zad1_1.run();
                    break;
                case "2":
                    Zad1_2.run();
                    break;
                case "3":
                    Zad1_3.run();
                    break;
                case "0":
                    running = false;
                    System.out.println("Program się zamyka...");
                    break;
                default:
                    System.out.println("Wrong, please repeat");
            }
        }
        scanner.close();
    }
}
