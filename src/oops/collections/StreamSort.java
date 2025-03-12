package oops.collections;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamSort {

	public static void main(String[] args) {
	    List<Integer> nums = Arrays.asList(4,5,7,3,2,6);
			
        Function<Integer, Integer> fun = n -> n*2;
		
		Stream<Integer> sortedValues = nums.stream()
                .filter(n -> n%2==0)
                .map(fun)
                .sorted();

        sortedValues.forEach(n -> System.out.println(n));

	
	}

}
