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
            System.out.print("Podaj liczbe: ");
            int a = inp.nextInt();
            if (a == 0) break;

            System.out.printf("dec=%s\nbin=%s\nhex=%s \n".toUpperCase(),
                    a,
                    leftPad(Integer.toBinaryString(a), '0', 4),
                    leftPad(Integer.toHexString(a), '0', 4));
        } while (true);
    }

    public static String leftPad(String aText, char aChar, int aWidth){
        String result = aText;
        for (int i = 0; i < aWidth; i += 1) {
            result = aChar + result;
        }

        return result;
    }
}
