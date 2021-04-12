package pl.lublin.wsei.java.lab1.mylib;

import org.apache.commons.lang3.StringUtils;

public class Account {
    private String name;

    public void setName(String s){
        String[] tokens = StringUtils.split(s);

        for (int i = 0; i < tokens.length; i++){
            tokens[i] = StringUtils.capitalize(tokens[i]);
        }

        name = StringUtils.join(tokens, ' ');
    }
    public String getName(){
        return name;
    }
}
