package practice.chapter19;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Chapter19_Ex2 {
	public static void main(String[] args) {
		// ファイルを開き、loadメソッドでプロパティを読み込む
		try (FileReader fr = new FileReader("C:\\pleiades\\workspace\\personal.properties")) {
			Properties p = new Properties();
			p.load(fr);

			// 各設定内容を出力

			// 例外処理を記述
			// printStackTraceで例外を出力
		} catch (・・・) {
			・・・
		}
	}
}

