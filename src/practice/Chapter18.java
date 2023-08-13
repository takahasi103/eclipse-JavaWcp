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
		String zip = "\\d{3}-\\d{4}";// 郵便番号の正規表現
		String zip1 = "100-0001"; // 東京駅の郵便番号
		String zip2 = "1000-001"; // 誤った郵便番号
		System.out.println(zip1 + "=" + zip1.matches(zip));
		System.out.println(zip2 + "=" + zip2.matches(zip));

		String tel = "0[789]0-\\d{4}-\\d{4}"; // 携帯電話番号の正規表現
		String tel1 = "090-1111-2222"; // 正しいフォーマットの電話番号
		String tel2 = "090-111-12222"; // 誤ったフォーマットの電話番号
		String tel3 = "050-1111-2222"; // 誤った値の電話番号
		System.out.println(tel1 + "=" + tel1.matches(tel));
		System.out.println(tel2 + "=" + tel2.matches(tel));
		System.out.println(tel3 + "=" + tel3.matches(tel));

		String time = "([01]\\d|2[0123]):[0-5]\\d"; // 時刻（24時間表記）の正規表現
		String time1 = "23:59"; // 正しいフォーマットの時刻
		String time2 = "23-59"; // 誤ったフォーマットの電話番号
		String time3 = "24:00"; // 誤った値の電話番号
		System.out.println(time1 + "=" + time1.matches(time));
		System.out.println(time2 + "=" + time2.matches(time));
		System.out.println(time3 + "=" + time3.matches(time));
	}

}
