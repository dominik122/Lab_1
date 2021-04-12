package pl.lublin.wsei.java.lab1.mylib;

import org.apache.commons.lang3.StringUtils;

public class Account {
    private String name;

    private static String ukrAlphabet = "абвгдеєжзиіїйклмнопрстуфхцчшщьюя";
    private static String translitRepl[] = {"a","b","v","g","d","e","je","zh","z","y","i","ji", "j",
            "k","l","m","n","o","p","r","s","t","u","f","h","c",
            "ch","sh","shh","'","ju","ja"};

    public void setName(String s){
        name = capitalize(s);
    }
    public String getName(){
        return name;
    }

    public static String capitalize(String s){
        String[] tokens = StringUtils.split(s);

        for (int i = 0; i < tokens.length; i++){
            tokens[i] = StringUtils.capitalize(tokens[i]);
        }

        return StringUtils.join(tokens, ' ');
    }

    public static String translit(String arg){
        arg = arg.toLowerCase();

        String translit = "";
        for(int i = 0; i < arg.length(); i++){
            int idx = StringUtils.indexOf(ukrAlphabet, arg.charAt(i));
            if (idx == -1) {
                translit += arg.charAt(i);
            } else {
                translit += translitRepl[idx];
            }
        }
        return translit;
    }
}
