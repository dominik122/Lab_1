package pl.lublin.wsei.java.lab1.mylib;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StringFun {
    public static String anarchize(String str) {
        String res = "";

        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                res += Character.toLowerCase(str.charAt(i));
            } else {
                res += Character.toUpperCase(str.charAt(i));
            }
        }
        return res;
    }

    public static String camelize(String str) {
        String res = "";

        String[] tokens = StringUtils.split(str, ' ');
        res += tokens[0].toLowerCase();
        for (int i = 1; i < tokens.length; i++) {
            res += StringUtils.capitalize(tokens[i].toLowerCase());
        }
        return res;
    }

    public static String decamelizeV1(String str) {
        String res = "";

        char[] tokens = str.toCharArray();
        res += Character.toUpperCase(tokens[0]);
        for (int i = 1; i < tokens.length; i++) {
            if (Character.isUpperCase(tokens[i])) {
                res += " " + tokens[i];
            } else {
                res += tokens[i];
            }
        }

        return res;
    }

    public static String decamelizeV2(String str) {
        String res = "";

        int beg = 1; // wartosc ustawiona jako 1 poniewaz pierwszy znak dodajemy przed wejsciem w petle
        res += Character.toUpperCase(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                res += str.substring(beg, i) + " ";
                beg = i;
            }
        }
        res += str.substring(beg); // ostanie słowo konczy sie mala litera wiec dodamy je po za petla
        return res;
    }

    public static String lazyDecamelize(String str) {
        String[] tokens = StringUtils.splitByCharacterTypeCamelCase(str);
        String res = "";

        for (String token : tokens) {
            if (token.equals(tokens[0])) {
                res += StringUtils.capitalize(token);
            } else {
                res += " " + token;
            }
        }
        return res;
    }

    public static boolean isPalindrome(String str) {
        String specialCharactersString = "!@#$%&*()'+,-./:;<=>?[]^_`' \"{|} ";

        for (int i = 0; i < str.length(); i++) {
            int reverseIdx = str.length() - i - 1;

            int check1 = specialCharactersString.indexOf(str.charAt(i));
            int check2 = specialCharactersString.indexOf(str.charAt(reverseIdx));

            if (check1 != -1 || check2 != -1) continue;
            else {
                if (Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(str.charAt(reverseIdx))) {
                    return false;

                }
            }
        }
        return true;
    }

    public static String shuffle(String str){
        List<Character> characters = new ArrayList<>();
        Random rand = new Random();
        String res = "";

        for (char c: str.toCharArray()) characters.add(c);


        for (int i = 0; i < str.length(); i++){
            char pop = characters.remove(rand.nextInt(characters.size()));

            res += pop;
        }
       return res;
    }
}