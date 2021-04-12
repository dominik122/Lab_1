package pl.lublin.wsei.java.lab1;

import pl.lublin.wsei.java.lab1.mylib.Account;


public class Main {
    /**
     * Funkcja main naszej klasy
     *
     * @param args argumenty funkcji main
     */
    public static void main(String[] args) {
        String str = Account.translit("Щитай щ Явие!");
        System.out.println(str);
    }
}
