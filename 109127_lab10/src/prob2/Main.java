package prob2;

import java.util.List;
import java.util.stream.Stream;

public class Main {
	public static <T> T secondSmallest(List<T> list) {
		if (list.size() <= 1)
			return null;
		Stream<T> str = list.stream().distinct().sorted();
		if (str.count() == 1)
			return null;

		return str.skip(1).findFirst().get();
	}
	
	public static void main(String[] args) {
		
	}
}
