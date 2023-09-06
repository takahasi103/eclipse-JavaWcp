package unittest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

//自動生成した場合アクセス修飾子はデフォルトだが、publicでも問題ない
//テストクラスの名前は自由だが、xxxTestやTestxxxといった命名規則にすることが多い
class CalculatorTest {
//	 テストメソッドの目印としてTestアノテーションを付ける
//	@Test
//	void test() {
//		 org.junit.jupiter.api.Assertions.failメソッドは、必ずテストを失敗させるメソッド。
//       まだ自動で追加しただけなので、テストメソッドが未実装であることを示している
//		fail("まだ実装されていません");
//	}
	
	 @Test
//	  org.junit.jupiter.api.DisplayNameアノテーションで、テスト結果表示画面に使う文言を設定できる
//	  DisplayNameアノテーションなしの場合は、テストメソッド名が表示される
	 @DisplayName("2の二乗は4になる")
	 void testSquare2() {

//	   1. テスト対象クラスのセットアップとして、インスタンス化や必要に応じて初期値のセットなどを行う
	  Calculator calc = new Calculator();

//	   2. テスト対象メソッド（今回はsquareメソッド）を実行し、結果を取得する
	  int result = calc.square(2);

//	   3. 実行結果の実測値と期待値の検証（アサーション）を行う
//	   ここでは実測値（result）が期待結果（4）と一致するかどうかを検証
	  assertEquals(result, 4);
	 }
	 
	 @Test
	 @DisplayName("4の平方根は2になる")
	 void testRoot4() {
//	   1. テスト対象クラスのセットアップ
	  Calculator calc = new Calculator();
//	   2. テスト対象メソッド（今回はrootメソッド）を実行し、結果を取得する
	  double result = calc.root(4.0);
//	   3. 実行結果の実測値と期待値の検証（アサーション）
	  assertEquals(result, 2.0);
	 }
	 
	 @Test
	 @DisplayName("-1の平方根は例外が発生する")
	 void testRootException() {
//	   1. テスト対象クラスのセットアップ
	  Calculator calc = new Calculator();
//	   2. テスト対象メソッドの実行と、3. 実行結果の検証を1行で行う
//	   org.junit.jupiter.api.Assertions.assertThrowsメソッドを使用する
	  assertThrows(IllegalArgumentException.class, () -> calc.root(-1));
	 }
	

}
