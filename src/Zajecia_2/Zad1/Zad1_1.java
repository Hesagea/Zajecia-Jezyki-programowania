package Zajecia_2.Zad1;

import java.util.Scanner;

/*
Zaimplementuj program, który przyjmuje od użytkownika ciąg słów i przechowuje je w zbiorze
typu HashSet i TreeSet. Następnie wyświetl różnice między HashSet a TreeSet w kontekście
kolejności słów. Porównaj również czas dodawania i usuwania elementów w obu zbiorach.
 */

// Przykladowe elementy: zebra ala kot pies www
// String[] args

public class Zad1_1 {
    public static void main(String[] args) {
        run();
    }
    public static void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj ciag slow: ");
        String tekst = scanner.nextLine();

        // .split - dzieli słowo na części a \\s+ daje, że to będzie osobno bez spacji lub spacjach
        String slowa[] = tekst.split("\\s+");

        ManagingSets mag = new ManagingSets();
        mag.addWords(slowa);
        mag.displaySet(slowa);
        mag.removeWords(slowa);

    }


}
