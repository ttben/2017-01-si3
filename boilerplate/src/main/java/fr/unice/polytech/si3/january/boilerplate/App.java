package fr.unice.polytech.si3.january.boilerplate;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        /*
            To get the command line arguments from the maven exec plugin,
            just run 'mvn exec:java -Dexec.args="arg1 arg2 arg3" '
         */
        System.out.println("Hello World!");
        for (String s : args) {
            System.out.println(s);
        }
    }
}
