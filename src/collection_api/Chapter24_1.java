package collection_api;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Chapter24_1 {
	public static void main(String[] args) {
        // ArrayListを生成する場合
        List<String> list1 = new ArrayList<String>();

        // LinkedListを生成する場合
        List<Integer> list2 = new LinkedList<Integer>();

        // 要素を追加する
        list1.add("りんご");
        list1.add("みかん");

        // 位置を指定して要素を追加する
        list1.add(1, "バナナ");

        // 表示してみる
        System.out.println(list1); // ["りんご", "バナナ", "みかん"]
        
        // 要素を取得する
        String item = list1.get(0);
        System.out.println(item);
        
        // 要素の存在チェック
        // ある要素がリストに含まれるか確認するには containsメソッドを使います。
        // 戻り値はbooleanです。
        // 存在チェック (trueを返す)
        System.out.println(list1.contains("バナナ"));

        // 存在チェック (falseを返す)
        System.out.println(list1.contains("なし"));
        
        // 要素数の取得
        // コレクションの要素数の合計を取得するには、 sizeメソッドを使います。
        System.out.println(list1.size());
        
        // 要素の削除
        // 要素を削除するにはremoveメソッドを使います。
        // 要素を削除する (要素が文字列の場合、文字列として同じであれば削除されます)
        System.out.println(list1.remove("バナナ")); // 戻り値はtrue
        System.out.println(list1.remove("なし")); // 何もしない、戻り値はfalse
        System.out.println(list1);
        
        // 位置を指定して要素を削除する
        System.out.println(list1.remove(0)); //戻り値は"りんご"
        // System.out.println(list1.remove(5)); // コレクションの要素数より大きい位置を指定すると実行時エラー
        System.out.println(list1);
    }
}
