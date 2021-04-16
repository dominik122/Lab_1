package pl.lublin.wsei.java.lab1;

import pl.lublin.wsei.java.lab1.mylib.StringFun;

public class DecamelizeTest {
    public static void main(String[] args){
        System.out.println(StringFun.decamelizeV1("toJestJakisTekst"));
        System.out.println(StringFun.decamelizeV2("toJestJakisTekst"));
        System.out.println(StringFun.lazyDecamelize("toJestJakisTekst"));
    }
}
