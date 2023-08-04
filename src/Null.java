import java.util.Arrays;

public class Null {

	public static void main(String[] args) {
		String string1;
		// ”あいう”の文字数を出力
		string1 = "あいう";
		System.out.println(string1 + "の文字数：" + string1.length());
		// ””（空文字）の文字数を出力
		string1 = "";
		System.out.println(string1 + "の文字数：" + string1.length());
		/* nullの変数を参照するとNullPointerExceptionのエラー
		string1 = null;
		System.out.println(string1 + "の文字数：" + string1.length());
		*/
		
		int[] array1 = new int[3];  // 配列の宣言と生成
		array1[0] = 60;  // インデックス番号「0」を指定して１番目の要素にデータを代入
		array1[2] = 20;  // ２番目の要素より先に３番目の要素にデータを代入
		array1[1] = 20;  // ３番目と同じ値を２番目の要素に代入
		int int2 = array1[2];  // インデックス番号「2」を指定して３番目の要素を取得

		int array2[] = null;  // []は変数名の後ろでも可
		System.out.println(int2);
		
		// Arrays.toStringメソッドを使用して配列を文字列に変換
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		
		// 宣言と初期化を同時にするとき
		int[] array3 = new int[] { 10, 20, 50 };
		int[] array4 = { 10, 20, 50 };
		
		System.out.println(Arrays.toString(array3));
		// 配列は .length と付けることで、配列の要素数を取得
		System.out.println(array3.length);
		System.out.println(Arrays.toString(array4));
	}

}
