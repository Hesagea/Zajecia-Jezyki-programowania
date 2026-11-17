package Zajecia_2.Zad2;
import java.util.Scanner;


public class Zad1_2 {
    private static int count;
    public static void main(String[] args) {
        run();
    }
    public static void run() {
        Scanner scammer = new Scanner(System.in);
        System.out.println("Ile liczb wygenerować?");
        count = scammer.nextInt();

        LosowanieLiczb losuj = new LosowanieLiczb();
        int tablica[] = new int[count];
        System.out.println("tworzenie tablicy");
        for(int i=0; i<count; i++) {
            tablica[i] = losuj.getNumber();
            System.out.print(tablica[i] + " ");
        }

        ManagingLists manager = new ManagingLists();
        manager.addNumbers(tablica);
        manager.przeszukiwanieIndex();
        manager.przeszukiwanieContains(tablica);
        manager.removeNumbers();
    }
    public int getCount() {
        return count;
    }
}
