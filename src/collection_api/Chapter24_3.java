package collection_api;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Chapter24_3 {
	public static void main(String[] args) {
		// HashSetを生成する場合
		Set<String> set1 = new HashSet<String>();

		// LinkedHashSetを生成する場合
		Set<Integer> set2 = new LinkedHashSet<Integer>();
		
		System.out.println("set1 " + set1);
		System.out.println("set2 " + set2);
		
		// 要素の追加
		// 要素を追加するにはaddメソッドを使います。
		set1.add("スイカ");
		set1.add("メロン");
		System.out.println("set1 " + set1);
		
	}
}
