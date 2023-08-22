package lambda_expression;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// 並び替え対象のリスト
		List<Integer> numbers = Arrays.asList(1, -8, 4, 2);

		Collections.sort(
		    numbers,
		    (Integer x, Integer y) -> {
		      return Integer.compare(x, y);
		    });

		System.out.println(numbers);
	}

}
