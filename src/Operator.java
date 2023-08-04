
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
		
		// 代入演算子
		int h = 10;
		System.out.println(h += 5); // h+5の結果を代入
		System.out.println(h -= 3); // h-3の結果を代入
		System.out.println(h *= 2); // h*2の結果を代入
		System.out.println(h /= 3); // h/3の結果を代入
		System.out.println(h %= 2); //　h%2の結果を代入
		
		// 関係（比較）演算子
		int i = 5;
		boolean j;
		j = i < 5; // i が 5 より小さい場合に true
		System.out.println(j);
		
		j = i <= 5; // i が 5 より小さいか等しい場合に true
		System.out.println(j);
		
		j = i > 8; // i が 8 より大きい場合に true
		System.out.println(j);
		
		j = i >= 3; // i が 3 より大きいか等しい場合に true
		System.out.println(j);
		
		j = i == 5; // i と 5 が等しい場合に true
		System.out.println(j);
		
		j = i != 5; // i と 5 が等しくない場合に true
		System.out.println(j);
		
		// 論理演算子
		boolean k = true;
		boolean l = false;
		boolean m;
		
		m = k && true; // 両方が true の場合に true
		System.out.println(m);
		
		m = l || k; // 	どちらかが true の場合に true
		System.out.println(m);
		
		m = !l; // 	l が false の場合に true
		System.out.println(m);
	}

}
