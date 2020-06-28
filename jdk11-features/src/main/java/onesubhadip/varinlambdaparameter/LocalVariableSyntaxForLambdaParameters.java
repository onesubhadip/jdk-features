package onesubhadip.varinlambdaparameter;

import java.util.List;
import java.util.stream.Collectors;

/**
 * https://openjdk.java.net/jeps/323
 *
 * For uniformity with local variables, we wish to allow 'var' for the formal parameters of an implicitly typed lambda expression:
 *
 * (var x, var y) -> x.process(y)   // implicit typed lambda expression
 * One benefit of uniformity is that modifiers, notably annotations, can be applied to local variables and lambda formals without losing brevity:
 *
 * @Nonnull var x = new Foo();
 * (@Nonnull var x, @Nullable var y) -> x.process(y)
 */
public class LocalVariableSyntaxForLambdaParameters {

    public static void main(String[] args) {

        List<String> vowels = List.of("a", "e", "i", "o", "u");

        vowels.forEach(System.out::print);

        List<String> vowelsUpperCase = vowels.stream()
                .map((var vowelLower) -> vowelLower.toUpperCase()) //use of var as type of lambda parameter
                .collect(Collectors.toList());

        vowelsUpperCase.forEach(System.out::print);

    }
}
