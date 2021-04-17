package pl.lublin.wsei.java.lab1;

import pl.lublin.wsei.java.lab1.mylib.StrongPasswordGenerator;

public class StrongPasswordTest {
    public static void main(String[] args){
        String pass = new StrongPasswordGenerator(8, true, true,
                true, true, "!?@#$%^.").generate();
        System.out.println(pass);
        String pass2 = new StrongPasswordGenerator(4, false, true,
                false, true, "!?@#$%^.").generate();
        System.out.println(pass2);
    }
}
