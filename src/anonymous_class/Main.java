package anonymous_class;

public class Main {

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.hello());
		
		// 無名クラスの使い方
		// ()のあとに{}を追加
		A aa = new A() {
			// {}の中にメソッドを追加します。

			// クラスAのhelloメソッドをオーバーライドします。
			@Override
			public String hello() {
				// "Hello B!"を返します。
				return "Hello B!";
			}
		};
		System.out.println(aa.hello());
		
	}

}
