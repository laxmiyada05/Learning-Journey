package com.utils;

public class Util {
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }
}
module com.greetings {
    requires com.utils;
}
package com.greetings;
import com.utils.Util;
public class Main {
    public static void main(String[] args) {
        Util.greet("Java Modules");
    }
}
