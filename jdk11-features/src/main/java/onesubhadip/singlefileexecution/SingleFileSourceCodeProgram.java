package onesubhadip.singlefileexecution;

import java.util.stream.IntStream;

/**
 * https://openjdk.java.net/jeps/330
 *
 * launch this from terminal:
 * java SingleFileSourceCodeProgram.java 5
 * or
 * java --source 11 SingleFileSourceCodeProgram.java 6
 */
public class SingleFileSourceCodeProgram {
    public static void main(String[] args) {
        System.out.println(factorial(Integer.parseInt(args[0])));
    }

    private static int factorial(int number) {
        return IntStream.rangeClosed(1, number).reduce(1, (x, y) -> x * y);
    }
}
