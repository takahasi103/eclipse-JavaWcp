package exception;

import java.sql.SQLException;

public class Chapter12 {
	
	public static void main(String[] args) {
		try {
			int array[] = { 1, 3, 5 };
			Chapter12.validIndex(array, 2);
			Chapter12.validIndex(array, 3);

			System.out.println("validIndexの呼び出し終了");
		} catch (IllegalArgumentException e) {
			System.out.println("IllegalArgumentExceptionが発生しました");
			e.printStackTrace();
		}

		// tryを記述
		// ・throwSQLExceptionメソッドを呼び出す
		// catchを記述
		// ・SQLExceptionをキャッチして、メッセージとスタックトレースを出力
		// ・"throwSQLExceptionの呼び出し終了"のメッセージを出力
		try {
			Chapter12.throwSQLException();
		} catch (SQLException e) {
			System.out.println("SQLExceptionが発生しました");
			e.printStackTrace();
		} finally {
			System.out.println("throwSQLExceptionの呼び出し終了");
		}

		System.out.println("mainメソッド終了");

	}
	
	// validIndexメソッドを作成
	// ・indexがarrayのサイズの範囲内なら、インデックスの要素を出力
	// ・サイズの範囲外なら、IllegalArgumentExceptionをスロー
	public static void validIndex(int[] array, int index) {
		if (array.length <= index) {
			throw new IllegalArgumentException(index + " はサイズの範囲外です");
		}
		System.out.println("インデックス " + index + " の要素は " + array[index] + " です");
	}

	public static void throwSQLException() throws SQLException {
		// SQLExceptionは、通常、SQLでエラーの場合に発生する例外
		throw new SQLException("SQLエラーです");
	}

}

/*
実行結果
	インデックス 2 の要素は 5 です
	IllegalArgumentExceptionが発生しました
	java.lang.IllegalArgumentException: 3 はサイズの範囲外です
		at practice.Chapter12.validIndex(Chapter12.java:xxxx)
		at practice.Chapter12.main(Chapter12.java:xxxx)
	SQLExceptionが発生しました
	java.sql.SQLException: SQLエラーです
		at practice.Chapter12.throwSQLException(Chapter12.java:xxxx)
		at practice.Chapter12.main(Chapter12.java:xxxx)
	throwSQLExceptionの呼び出し終了
	mainメソッド終了
*/
