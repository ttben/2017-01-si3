package fr.unice.polytech.si3.january._2017.boilerplate.mvnExecPlugin;

/**
 * Hello world!
 *
 * package name clarification:
 * If any of the resulting package name components start with a digit,
 * or any other character that is not allowed as an initial character of an identifier,
 * have an underscore prefixed to the component.
 * In JLS 6.1 Declarations: https://docs.oracle.com/javase/specs/jls/se7/html/jls-6.html#jls-6.1
 */
public class App {
    public static void main(String[] args) {
        /*
            To get the command line arguments from the maven exec plugin,
            just run 'mvn exec:java -Dexec.args="arg1 arg2 arg3" '
         */
        System.out.println("Hello World! - You entered these arguments:");
        for (String s : args) {
            System.out.printf("%s ", s);
        }

        System.out.println("Impressive HU??");
    }
}

