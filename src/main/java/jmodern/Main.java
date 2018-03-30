package jmodern;

import com.google.common.base.Strings;

public class Main {
    public static void main(String[] args) {
        System.out.println(triple("Hello, World!"));
        System.out.println("My name is " + System.getProperty("jmodern.name"));
        System.out.println("this is to check user name");
    }

    static String triple(String s) {
        return Strings.repeat(s, 3);
    }
}
