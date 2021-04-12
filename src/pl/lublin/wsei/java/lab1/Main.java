package pl.lublin.wsei.java.lab1;

import java.util.Scanner;

public class Main {
    /**
     * Funkcja main naszej klasy
     * @param args argumenty funkcji main
     */
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        // int a, b;
        do{
            System.out.print("Podaj piierwsza liczbe: ");
            int a = inp.nextInt();
            if (a == 0) break;
            System.out.print("Podaj druga liczbe: ");
            int b = inp.nextInt();
            if (b == 0) break;
            System.out.printf("%d + %d = %d %n", a, b, a + b);
        } while (true);
    }
}
