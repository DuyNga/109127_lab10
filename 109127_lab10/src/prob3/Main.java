package prob3;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static <T extends Number> double sum(List<T> list) {
		double result = 0.0;
		for (T a : list) {
			result += a.doubleValue();
		}
		return result;
	}

	public static void main(String[] args) {
		List<Integer> ints = Arrays.asList(1, 2, 2, 3, 3, 4);
		System.out.println("List: " + ints);
		double intSum = sum(ints);
		System.out.println("Sum of the list: " + intSum);
		List<Double> doubles = Arrays.asList(2.0, 2.0, 3.0, 3.0, 4.0);
		System.out.println("List: " + doubles);
		double dbSum = sum(doubles);
		System.out.println("Sum of the list: " + dbSum);
	}

}
