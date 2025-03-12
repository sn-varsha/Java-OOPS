package oops.collections;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class StreamMap {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(4,5,7,3,2,6);
		
//		Function<Integer, Integer> fun = new Function<Integer, Integer>(){
//			public Integer apply(Integer n) {
//				return n*2;
//			}
//		};
		
		Function<Integer, Integer> fun = n -> n*2;
		
		int result = nums.stream()
                .filter(n -> n%2==0)
                .map(fun)
                .reduce(0, (c,e)->c+e);

        System.out.println(result);

	}

}
