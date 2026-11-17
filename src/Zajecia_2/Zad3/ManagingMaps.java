package Zajecia_2.Zad3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ManagingMaps {
    private final Map<String, String> hashMap = new HashMap<>();
    private final Map<String, String> treeMap = new TreeMap<>();

    public void addWord(String word, String definition) {
        hashMap.put(word, definition);
        treeMap.put(word, definition);
    }

    public void apllyWords() {
        boolean running = true;
        Scanner scanner = new Scanner(System.in);
        while (running) {
            System.out.print("Podaj słowo :");
            String slowo = scanner.nextLine();
            System.out.print("Podaj definicje: ");
            addWord(slowo, scanner.nextLine());
            System.out.println("Podajesz kolejne słowo (tak to 1, reszta fałsz): ");
            int zmienna = scanner.nextInt();
            String coś = scanner.nextLine();
            if(zmienna!=1) {
                running = false;
            }
        }
    }

    public void display() {
        System.out.println("\n--- WYŚWIETLANIE MAP ---");
        System.out.println("HashMap:");
        for (Map.Entry<String, String> wpis : hashMap.entrySet()) {
            System.out.println(wpis.getKey() + " -> " + wpis.getValue());
        }
        System.out.println("TreeMap:");
        for (Map.Entry<String, String> wpis : treeMap.entrySet()) {
            System.out.println(wpis.getKey() + " -> " + wpis.getValue());
        }
    }


}
