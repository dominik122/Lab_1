package pl.lublin.wsei.java.lab1;

import java.io.PrintStream;
import java.util.Random;

public class Main {
    /**
     * Funkcja main naszej klasy
     *
     * @param args argumenty funkcji main
     */
    public static void main(String[] args) {
        int[] arr = new int[30];
        Random rand = new Random();

        for (int i = 0; i < 30; i++) {
            arr[i] = rand.nextInt();
        }

        int mx = Integer.MIN_VALUE;
        int mn = Integer.MAX_VALUE;
        long avg = 0;
        for (int l : arr) {
            System.out.println(l);
            if (l > mx) mx = l;
            if (l < mn) mn = l;
            avg += l;
        }
        System.out.printf("MIN = %d, MAX = %d, AVG = %f", mn, mx, (float) avg / arr.length);
    }
}
