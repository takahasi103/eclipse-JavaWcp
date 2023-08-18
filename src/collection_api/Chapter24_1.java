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
    }
}
