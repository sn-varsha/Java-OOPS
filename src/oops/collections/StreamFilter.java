package oops.collections;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamFilter {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(4,5,7,3,2,6);
	
		Predicate<Integer> p = new Predicate<Integer>() {
			public boolean test(Integer n) {
//				if(n%2==0)
//					return true;
//				else
//					return false;
				return n%2==0;
				
			}
			
		};
//		Predicate<Integer> p= n-> n%2==0;
		
		int result = nums.stream()
                         .filter(p)
                         .map(n -> n*2)
                         .reduce(0, (c,e)->c+e);
		
		System.out.println(result);

	}

}
