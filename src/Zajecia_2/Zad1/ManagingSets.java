package Zajecia_2.Zad1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ManagingSets {
    private Set<String> hashSet = new HashSet<>();
    private Set<String> treeSet = new TreeSet<>();

    public void addWords(String[] slowa){
        TimeCounting timer = new TimeCounting();

        timer.start();
        for (String slowo : slowa) {
            hashSet.add(slowo);
        }
        //Collections.addAll(hashSet, slowa);
        timer.stop();
        long hashTime = timer.getResumeTime();;

        timer.start();
        for (String slowo : slowa) {
            treeSet.add(slowo);
        }
        timer.stop();
        long treeTime = timer.getResumeTime();

        System.out.println("\n--- CZAS DODAWANIA ---");
        System.out.println("HashSet: " + hashTime);
        System.out.println("TreeSet: " + treeTime);
    }

    public void displaySet(String[] slowa) {
        System.out.println("--- WYSWIETLENIE KOLEKCJI ---");
        System.out.println("HashSet:");
        for (String slowo : hashSet) {
            System.out.println(slowo + " ");
        }

        System.out.println("TreeSet:");
        for (String slowo : treeSet) {
            System.out.println(slowo + " ");
        }
    }

    public void removeWords(String[] slowa){
        TimeCounting timer = new TimeCounting();

        timer.start();
        for (String slowo : slowa) {
            hashSet.remove(slowo);
        }
        timer.stop();
        long hashTime = timer.getResumeTime();;

        timer.start();
        for (String slowo : slowa) {
            treeSet.remove(slowo);
        }
        timer.stop();
        long treeTime = timer.getResumeTime();

        System.out.println("\n--- CZAS USUWANIA ---");
        System.out.println("HashSet: " + hashTime);
        System.out.println("TreeSet: " + treeTime);
    }

    /* inna możliwość wykonania
    public long removeWords2(Set<String> mySet, String[] slowa){
        TimeCounting timer = new TimeCounting();

        timer.start();
        for (String slowo : slowa) {
            mySet.remove(slowo);
        }
        timer.stop();

        return timer.getResumeTime();
    }
    */

}
