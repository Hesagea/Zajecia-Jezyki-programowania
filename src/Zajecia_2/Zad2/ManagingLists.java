package Zajecia_2.Zad2;

import Zajecia_2.Zad1.TimeCounting;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ManagingLists {
    private List<Integer> arrayList = new ArrayList<>();
    private List<Integer> linkedList = new LinkedList<>();

    public void addNumbers(int[] numbers){
        TimeCounting timer = new TimeCounting();

        timer.start();
        for (int liczba : numbers) {
            arrayList.add(liczba);
        }
        timer.stop();
        long arrayTime = timer.getResumeTime();;

        timer.start();
        for (int liczba : numbers) {
            linkedList.add(liczba);
        }
        timer.stop();
        long linkedTime = timer.getResumeTime();

        System.out.println("\n--- CZAS DODAWANIA ---");
        System.out.println("ArrayList: " + arrayTime);
        System.out.println("LinkedList: " + linkedTime);
    }

    public void przeszukiwanieIndex() {
        TimeCounting timer = new TimeCounting();
        Zad1_2 zad12 = new Zad1_2();
        int middle = zad12.getCount()/2;

        timer.start();
        arrayList.get(middle);
        timer.stop();
        long arrayTime = timer.getResumeTime();

        timer.start();
        linkedList.get(middle);
        timer.stop();
        long linkedTime = timer.getResumeTime();

        System.out.println("\n--- CZAS PRZESZUKANIA INDEX ---");
        System.out.println("Srodkowe: " + middle);
        System.out.println("ArrayList: " + arrayTime);
        System.out.println("LinkedList: " + linkedTime);
    }

    public void przeszukiwanieContains(int[] numbers) {
        TimeCounting timer = new TimeCounting();
        Zad1_2 zad12 = new Zad1_2();
        int middle = numbers[zad12.getCount()/2 - 1];

        timer.start();
        arrayList.contains(middle);
        timer.stop();
        long arrayTime = timer.getResumeTime();

        timer.start();
        linkedList.contains(middle);
        timer.stop();
        long linkedTime = timer.getResumeTime();

        System.out.println("\n--- CZAS PRZESZUKANIA PRZEZ CONTAINS ---");
        System.out.println("Srodkowe: " + middle);
        System.out.println("ArrayList: " + arrayTime);
        System.out.println("LinkedList: " + linkedTime);
    }


    public void removeNumbers(){
        TimeCounting timer = new TimeCounting();
        Zad1_2 zad12 = new Zad1_2();

        timer.start();
        for (int i=0; i< zad12.getCount();i++) {
            arrayList.remove(0);
        }
        timer.stop();
        long arrayTime = timer.getResumeTime();

        timer.start();
        for (int i=0; i< zad12.getCount();i++) {
            linkedList.remove(0);
        }
        timer.stop();
        long linkedTime = timer.getResumeTime();

        System.out.println("\n--- CZAS USUWANIA ---");
        System.out.println("ArrayList: " + arrayTime);
        System.out.println("LinkedList: " + linkedTime);
    }
}
