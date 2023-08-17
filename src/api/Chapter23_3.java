package api;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Chapter23_3 {
	public static void main(String[] args) throws Exception {
		// 現在日時の取得
		LocalDateTime localDateTime = LocalDateTime.now();
		// 文字列へ変換
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		System.out.println(dateTimeFormatter.format(localDateTime));
	}

}
