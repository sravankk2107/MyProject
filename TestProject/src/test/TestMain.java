package test;

import java.util.function.Function;

public class TestMain {

	public static void main(String[] args) {
		
		Function<String, String> f= s-> s.toUpperCase();
		System.out.println(f.apply("Sravan"));

	}

}
