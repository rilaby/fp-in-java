import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;


public class App 
{
    public static void main( String[] args )
    {
        List<String> names = Arrays.asList("Anna", "Bobby", "Steve");

        final Function<String, Predicate<String>> startsWithLetter = letter -> name -> name.startsWith(letter);
        
        Long num = names.stream()
            .filter(startsWithLetter.apply("A"))
            .count();

        System.out.println(num);
    }
}