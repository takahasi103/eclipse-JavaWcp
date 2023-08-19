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
		
		// 要素の存在チェック
		// ある要素がSetに含まれるか確認するには containsメソッドを使います。
		// 存在チェック (trueを返す)
		System.out.println(set1.contains("スイカ"));
		// 存在チェック (falseを返す)
		System.out.println(set1.contains("なし"));
		
	}
}
