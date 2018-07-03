package com.epam.cdp.olha;

import com.epam.tat.module4.Calculator;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println(Math.sin(Math.toRadians(30)) / Math.cos(Math.toRadians(30)));
        System.out.println(1 / Math.tan(Math.toRadians(30)));
        System.out.println(new Calculator().tg(30));
        System.out.println(new Calculator().tg(Math.toRadians(30)));
    }
}
