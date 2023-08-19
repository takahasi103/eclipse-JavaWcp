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
		
		// 要素数の取得
		// コレクションの要素数の合計を取得するには、 sizeメソッドを使います。
		System.out.println("set1 " + set1.size());
		System.out.println("set2 " + set2.size());
		
		// 要素の削除
		// 要素を削除するにはremoveメソッドを使います。
		// 要素を削除する (要素が文字列の場合、文字列として同じであれば削除されます)
		set1.remove("スイカ"); // 戻り値はtrue
		set1.remove("なし"); // 何もしない、戻り値はfalse
		System.out.println("set1 " + set1);
		
		
	}
}
