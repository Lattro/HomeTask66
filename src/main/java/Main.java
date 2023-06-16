import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main
{
    public static void main(String[] args)
    {
        Integer[] arrayInteger = {1,2,3,4,5,6,7,8,9,10};
        Double[] arrayDouble = {1.0,2.0,3.3,4.4,5.5,6.6};
        String[] arrayString ={"123","456","789"};

        Sum<Integer> integerSum = new Sum<>(arrayInteger);
        Sum<Double> doubleSum = new Sum<>(arrayDouble);
        //Sum<String> stringSum = new Sum<String>(arrayString);
       // stringSum.getSum();
        integerSum.getSum();
        doubleSum.getSum();
    }
}
