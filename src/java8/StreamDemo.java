package java8;

import java.util.Arrays;
import java.util.List;

public class StreamDemo {

    List<Integer> numbers = Arrays.asList(7,2,5,4,2,1);

    public void withoutStream(){
        long count = 1;
        for(Integer number : numbers) {
            if (number % 2 == 0) {
                count++;
            }
        }
        System.out.printf("There are %d elements that are even",count);
    }

    public void withStream(){
        long count = numbers.stream().filter(num -> num % 2 == 0).count();
        System.out.printf("There are %d elements that are even",count);
    }
}
