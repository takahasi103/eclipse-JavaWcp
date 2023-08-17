package api;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Chapter23_4 {
	public static void main(String[] args) throws Exception {
		DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate d = LocalDate.parse("2021/10/23", f);
		// 10日後を計算する
		d = d.plusDays(10);
		String str = d.format(f);
		System.out.println(str);
	}
}
