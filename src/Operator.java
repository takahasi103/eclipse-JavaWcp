
public class Operator {

	public static void main(String[] args) {
		int a = 15;
		int b;
		b = a + 3;  // c = 18
		b = a - 5;  // c = 10
		b = a * 2;  // c = 20
		b = a / 6;  // c = 2
		b = a % 4;  // c = 3
		
		// インクリメント・デクリメント演算子
		int c;
		c = 10;
		c++;  //  a = 11 インクリメント
		c = 10;
		c--;  // a = 9 デクリメント
		
		// 前置と後置
		int d;
		int g;
		d = 20;
		// 前置
		g = ++d; // d をインクリメントした後に、d が g に代入される
		System.out.println("d:" + d);
		System.out.println("g:" + g);
		// 後置
		g = d++;
		System.out.println("d:" + d);
		System.out.println("g:" + g);
		
	}

}
