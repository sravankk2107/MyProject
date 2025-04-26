package java8;

import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestMain {

	public static void main(String[] args) {
		
		Predicate<Integer> p= i-> i%2==0;
		System.out.println(Stream.of(1,2,3,4).filter(p).collect(Collectors.toList()));

	}

}
