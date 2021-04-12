package pl.lublin.wsei.java.lab1;

import pl.lublin.wsei.java.lab1.mylib.Account;


public class Main {
    /**
     * Funkcja main naszej klasy
     *
     * @param args argumenty funkcji main
     */
    public static void main(String[] args) {
        Account ac = new Account();
        ac.setName("dominik Wegiel");
        System.out.println(ac.getName());
    }
}
