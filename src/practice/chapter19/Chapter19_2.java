package practice.chapter19;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Chapter19_2 {
	public static void main(String[] args) {

		// try-with-resourcesを使用
		try (FileReader fr = new FileReader("C:\\pleiades\\workspace\\test.txt")) {
			int c;
			while ((c = fr.read()) != -1) {
				System.out.print(c);
			}
		} catch (FileNotFoundException e) {
			System.out.println("ファイルがありませんでした");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("エラーです");
			e.printStackTrace();
		}
	}
}
