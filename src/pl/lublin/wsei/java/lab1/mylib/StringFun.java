package pl.lublin.wsei.java.lab1.mylib;

import org.apache.commons.lang3.StringUtils;

public class StringFun {
    public static String anarchize(String str){
        String res = "";

        for (int i = 0; i < str.length(); i++){
            if (Character.isUpperCase(str.charAt(i))){
                res += Character.toLowerCase(str.charAt(i));
            } else {
                res += Character.toUpperCase(str.charAt(i));
            }
        }
        return res;
    }

    public static String camelize(String str){
        String res = "";

        String[] tokens = StringUtils.split(str, ' ');
        res += tokens[0].toLowerCase();
        for (int i = 1; i < tokens.length; i++){
            res += StringUtils.capitalize(tokens[i].toLowerCase());
        }
        return res;
    }
}
