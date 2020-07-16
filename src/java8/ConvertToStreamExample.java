package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class ConvertToStreamExample {

    // Generate Streams from Arrays using .stream or Stream.of
    public static void streamFromArray(){
        String[] languages = {"Java", "C#", "C++", "PHP", "Javascript"};

        //Get Stream using the Arrays.stream
        Stream<String> testStream1 = Arrays.stream(languages);
        testStream1.forEach(x -> System.out.println(x));

        //Get Stream using the Stram.of
        Stream<String> testStream2 = Stream.of(languages);
        testStream2.forEach(x -> System.out.println(x));
    }

    //Generate Streams from Collections
    public static void streamFromCollection(){
        List<String> items = new ArrayList<>();
        items.add("Java");
        items.add("C#");
        items.add("C++");
        items.add("PHP");
        items.add("Javascript");

        //items.stream().forEach(items -> System.out.println(items));
    }

    //Generate Stream using Stream.generate()
    public static void streamUsingGenerate(){
        Stream<String> stream = Stream.generate(() -> "gpcoder").limit(3);
        String[] testStrArr = stream.toArray(String[]::new);
        System.out.println(Arrays.toString(testStrArr));
    }

    //Generate Streams using Stream.iterate()
    public static void streamUsingIterate(){
        Stream<Long> iterateNumber = Stream.iterate(1L,n -> n + 1).limit(5);
        iterateNumber.forEach(System.out::print);
    }

    //Generate Stream from APIs like
    public static void streamUsingregex(){
        String str = "Welcome,to,gpcoder";
        Pattern.compile(",").splitAsStream(str).forEach(System.out::print);
    }

}
