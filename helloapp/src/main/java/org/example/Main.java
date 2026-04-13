package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String result = (args.length == 0)
                ? "World"
                : String.join(", ", args);

        System.out.println("Hello, " + result + "!");
    }
}