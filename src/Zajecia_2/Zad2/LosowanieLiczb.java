package Zajecia_2.Zad2;

import java.util.Random;

public class LosowanieLiczb {
    public int getNumber() {
        Random random = new Random();
        // losuje liczbę z zakresu 0 do 99 999;
        return random.nextInt(100000);
    }

}
