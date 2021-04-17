package pl.lublin.wsei.java.lab1.mylib;

import java.util.Random;
import pl.lublin.wsei.java.lab1.mylib.StringFun;

public class StrongPasswordGenerator {

    private final String LOWER = "abcdefghijklmnopqrstuwxyz";
    private final String UPPER = LOWER.toUpperCase();
    private final String DIGITS = "1234567890";

    private String alphabet = "";

    private int dlugosc;
    private boolean maleLitery;
    private boolean duzeLitery;
    private boolean cyfry;
    private boolean znakiSpecjalne;
    private String dozwoloneZnakiSpecjalne;

    public StrongPasswordGenerator(){
        this(8, true, true, true, true, "!?@#$%^.");
    }

    public StrongPasswordGenerator(int dlugosc, boolean maleLitery, boolean duzeLitery, boolean cyfry){
        this.dlugosc = dlugosc;
        this.maleLitery = maleLitery;
        this.duzeLitery = duzeLitery;
        this.cyfry = cyfry;
        this.znakiSpecjalne = false;
        updateAlphabet();
    }

    public StrongPasswordGenerator(int dlugosc, boolean maleLitery, boolean duzeLitery, boolean cyfry,
                                   boolean znakiSpecjalne, String dozwoloneZnakiSpecjalne){
        this.dlugosc = dlugosc;
        this.maleLitery = maleLitery;
        this.duzeLitery = duzeLitery;
        this.cyfry = cyfry;
        this.znakiSpecjalne = znakiSpecjalne;
        this.dozwoloneZnakiSpecjalne = dozwoloneZnakiSpecjalne;
        updateAlphabet();
    }

    private void updateAlphabet(){
        if (maleLitery) alphabet += LOWER;
        if (duzeLitery) alphabet += UPPER;
        if (cyfry) alphabet += DIGITS;
        if (znakiSpecjalne) alphabet += dozwoloneZnakiSpecjalne;
    }

    public String generate(){
        String res = "";
        Random rand = new Random();

        if (maleLitery) res += LOWER.charAt(rand.nextInt(LOWER.length()));
        if (duzeLitery) res += UPPER.charAt(rand.nextInt(UPPER.length()));
        if (cyfry) res += DIGITS.charAt(rand.nextInt(DIGITS.length()));
        if (znakiSpecjalne) res += dozwoloneZnakiSpecjalne.charAt(rand.nextInt(dozwoloneZnakiSpecjalne.length()));

        int resLength = res.length();
        for (int i = 0; i < dlugosc - resLength; i++){
            res += alphabet.charAt(rand.nextInt(alphabet.length()));
        }

        return StringFun.shuffle(res);
    }
}
