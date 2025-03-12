package oops.collections;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalClass {

	public static void main(String[] args) {
//		List<String> names = Arrays.asList("Navin", "Laxmi", "Kiran", "John");
		List<String> names = Arrays.asList("Navin", "Lakshmi", "Kiran", "John");
		
		Optional<String> name= names.stream()
				.filter(str -> str.contains("x"))
				.findFirst();
		
//		String name= names.stream()
//				.filter(str -> str.contains("x"))
//				.findFirst()
//				.orElse("not found");
		
//		System.out.println(name.get());
		System.out.println(name.orElse("Not Found"));
//		System.out.println(name);
		
	}

}
