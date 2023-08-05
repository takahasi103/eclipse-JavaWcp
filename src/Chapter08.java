
public class Chapter08 {

	public static void main(String[] args) {
	/*
	 問題1
	 距離を表すint型の変数を定義し、任意の値で初期化する
	 距離が5以下の場合は "とても近いです" を出力する
	 距離が5より大きく10以下の場合は "近いです" を出力する
	 距離が10より大きく15以下の場合は "遠いです" を出力する
	 距離が15より大きい場合は "とても遠いです" を出力する
	*/
	
		int distance = 11;
		if (distance <= 5) {
			System.out.println("とても近いです");
		} else if (distance <= 10) {
			System.out.println("近いです");
		} else if (distance <= 15) {
			System.out.println("遠いです");
		} else {
			System.out.println("とても遠いです");
		}
		
	/*
	 問題2
	 曜日を表すString型の変数を定義し、 英単語で初期化する
	 英単語に該当する日本語で曜日を出力する
	 曜日以外の単語の場合は "曜日ではありません" を出力する
	*/
		
		String week = "Monday";
		switch (week) {
		case "Sunday":
			System.out.println("日曜日");
			break;
		case "Monday":
			System.out.println("月曜日");
			break;
		case "Tuesday":
			System.out.println("火曜日");
			break;
		case "Wednesday":
			System.out.println("水曜日");
			break;
		case "Thursday":
			System.out.println("木曜日");
			break;
		case "Firday":
			System.out.println("金曜日");
			break;
		case "Staurday":
			System.out.println("土曜日");
			break;
		default:
			System.out.println("曜日ではありません");
		}
	}

}
