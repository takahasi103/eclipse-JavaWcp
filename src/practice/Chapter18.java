package practice;

import java.util.Scanner;

public class Chapter18 {

	public static void main(String[] args) {
	/* 確認問題01
		キーボードから入力した文字列を結合し、
		「exit」と入力するまで繰り返して最後に出力するプログラムを記述して下さい。
	*/
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		while (true) { // 無限ループ
			String line = sc.nextLine(); // 1行読み込み
			if (line.equals("exit")) { // 「exit」と等しい場合
				break; // breakしてループを抜ける
			}
			sb.append(line); // StringBuilderへ追加
		}
		System.out.println(sb.toString());
		sc.close(); // 最後はクローズする
	
	
	/* 確認問題02
		1から100までの整数をカンマで連結した以下のような文字列sを生成し、
		出力するコードを作成してください。
		
		実行結果
		1,2,3,4,5,6,7,...98,99,100
	*/
		// 1から100までの値StringBufferに格納する
		StringBuffer sb2 = new StringBuffer();
		for (int i = 1; i <= 100; i++) {
			sb2.append(i).append(",");
		}
		// 最後のカンマを除去
		sb2.deleteCharAt(sb2.length() - 1);

		// カンマ区切りの文字列を出力
		String data = new String(sb2);
		System.out.println(data);

		// 文字列をカンマで分割する
		String[] dataArray = data.split(",");
		for (String d : dataArray) {
			System.out.println(d);
		}
		
		
	/* 確認問題03
		以下の正規表現を考えてみましょう。実際にプログラムで
		Stringクラスのmatches()メソッドを使って正常にマッチするか確認してください。
		
		・郵便番号（3桁の数字 ハイフォン 4桁の数字）
		・携帯電話の番号（070 or 080 or 090 ハイフォン 4桁の数字 ハイフォン 4桁の数字）
		・時刻（24時間表記）
	*/

	}

}
