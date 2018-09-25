package prob2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Main {
	public static <T> T secondSmallest(List<T> list) {
		if (list.size() <= 1)
			return null;
		Supplier<Stream<T>> sup = () -> list.stream().distinct().sorted();
		if (sup.get().count() == 1)
			return null;
		T re = sup.get().skip(1).findFirst().get();
		return re;
	}

	public static void main(String[] args) {
		List<Integer> ints = Arrays.asList(1, 2, 2, 3, 3, 4);
		System.out.println("List: " + ints);
		Integer intSecondSmallest = secondSmallest(ints);
		System.out.println("Second smallest in list: " + intSecondSmallest);
		List<Double> doubles = Arrays.asList(2.0, 2.0, 3.0, 3.0, 4.0);
		System.out.println("List: " + doubles);
		double dbSecondSmallest = secondSmallest(doubles);
		System.out.println("Second smallest in list: " + dbSecondSmallest);
	}
}
