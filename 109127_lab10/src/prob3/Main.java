package prob3;

import java.util.List;

public class Main {
public static <T extends Number> double  sum (List<T> list) {
	double result =0.0;
	for(T a:list) {
		result += a.doubleValue();
	}
	return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
