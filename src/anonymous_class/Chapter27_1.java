package anonymous_class;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Chapter27_1 {

	public static void main(String[] args) {
//		問題1
//		インターフェースを実装し、次のリストの要素がアルファベット順になるようソートしてみましょう。
		List<String> animals = Arrays.asList("dog", "cat", "fox", "elephant");
		
		System.out.println("ソート前" + animals);
		
		Collections.sort(animals, new Comparator<String>() {
			@Override
			public int compare(String x, String y) {
				// 数値が小さい順に並べる
				return x.compareTo(y);
			}
		});
		
		System.out.println("ソート後" + animals);

	}

}
