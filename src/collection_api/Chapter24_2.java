package collection_api;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Chapter24_2 {

	public static void main(String[] args) {
		// HashMapを生成する場合(キーがInteger、値がString)
		Map<Integer, String> map1 = new HashMap<Integer, String>();

		// TreeMapを生成する場合(キー、値共にString)
		Map<String, String> map2 = new TreeMap<String, String>();

		// 要素の追加
		// 要素を追加するにはputメソッドを使います
		map1.put(0, "ぶどう");
		map1.put(3, "もも");
		System.out.println(map1);
		
		// 登録済みのキーで追加すると上書きされる
		map1.put(0, "マスカット");
		System.out.println(map1);
	}

}
