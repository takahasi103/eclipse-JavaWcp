package api;
//	確認問題
//	コンソールに、実行した月のカレンダーを出力してください。
//	カレンダーには曜日も出力し、土曜日で改行を入れてください。
//	
//	実行例（2021年10月に実行）
//	
//	1(金) 2(土)
//	3(日) 4(月) 5(火) 6(水) 7(木) 8(金) 9(土)
//	10(日) 11(月) 12(火) 13(水) 14(木) 15(金) 16(土)
//	17(日) 18(月) 19(火) 20(水) 21(木) 22(金) 23(土)
//	24(日) 25(月) 26(火) 27(水) 28(木) 29(金) 30(土)
//	31(日)

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Chapter23_Ex1 {
	public static void main(String[] args) throws Exception {
		// 当日のインスタンスからwithDayOfMonthでその月の1日のインスタンスを得る
		LocalDate d = LocalDate.now().withDayOfMonth(1);

		// lengthOfMonthでその月の最後の日が取得できる
		final int lastDay = d.lengthOfMonth();
		for (int i = 1; i <= lastDay; i++) {
			// 曜日を取得
			DayOfWeek w = d.getDayOfWeek();
			// 曜日の文字列表現を取得
			String wstr = w.getDisplayName(TextStyle.SHORT, Locale.getDefault());
			System.out.print(d.getDayOfMonth() + "(" + wstr + ") ");
			// 土曜日かどうかを判定
			if (w == DayOfWeek.SATURDAY) {
				System.out.println();
			}

			d = d.plusDays(1);
		}
	}
}
