
public class Variable {

	public static void main(String[] args) {
		// 変数の宣言
		int num1;
		String str1;
		
		// 変数の初期化
		num1 = 10;
		str1 = "Hellor World!";
		
		// 基本的に 変数の宣言と初期化を同時に行う
		int num2 = 100;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(str1);
		
		// 再代入
		num1 = 20;
		System.out.println(num1);
		str1 = "Hellor Java";
		System.out.println(str1);
		
		/*
		 定数
		 定数名は全て大文字
		 複合語の場合は単語の区切りをアンダースコア(_)にして記述
		*/
		final int MIN_NUMBER = 1;
		System.out.println(MIN_NUMBER);
	}

}
