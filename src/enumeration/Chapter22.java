package enumeration;

import java.util.Scanner;

//	確認問題
//	列挙型「DayOfWeek」を「Sun, Mon, Tue, Wed, Thu, Fri, Sat」と定義してください。
//	
//	キーボードからの入力で曜日名を受け取り、該当するenumインスタンスを取得して、
//	曜日の日本語名を出力してください。

public class Chapter22 {

	public static void main(String[] args) {
		System.out.print("曜日を入力して下さい：");
		String input = new Scanner(System.in).nextLine();
	    // 以下に処理を記述
	    DayOfWeek week = DayOfWeek.valueOf(input);
		switch (week) {
		case Sun:
			System.out.println("日曜日です");
			break;
		case Mon:
			System.out.println("月曜日です");
			break;
		case Tue:
			System.out.println("火曜日です");
			break;
		case Wed:
			System.out.println("水曜日です");
			break;
		case Thu:
			System.out.println("木曜日です");
			break;
		case Fri:
			System.out.println("金曜日です");
			break;
		case Sat:
			System.out.println("土曜日です");
			break;
		}
	}

}
