package sample;

import java.util.ArrayList;

public class Sample {
	public static void main(String[] args) {
//		1問目 - 1〜10の数字の偶数のみを大きい順に上から縦に並ぶように表示させる
		for (int i = 10; 0 < i; i--) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		
//		2問目 - 1〜10までの偶数が何個あるのか、偶数の合計は幾つになるかを表示させる問題
		int count = 0;
		int total = 0;
		for (int n = 1; n <= 10; n++) {
			if (n % 2 == 0) {
				count++;
				total += n;
			}
		}
		System.out.println("個数 " + count);
		System.out.println("合計 " + total);
		
//		3問目 - 1〜10までの整数をカンマ区切りで横並びで表示（10にはカンマをつけない）させる問題
		for (int number = 1; number <= 10; number++) {
			System.out.print(number);
			if (number < 10) {
				System.out.print(",");
			}
		}
		
		System.out.println();
		
//		4問目 - 要素数20の配列を宣言し、要素に0から5ずつ加算して代入させる。[0]~[10]の値の奇数のみカンマ区切りで、[11]~[19]の値は偶数をカンマ区切りで表示させる問題
		int[] numbers = new int[20];
		for (int x = 0; x < 20; x++) {
			numbers[x] = (x + 1) * 5;
		}
		
		for (int a = 0; a < 20; a++) {
			System.out.print(numbers[a] + " ");
		}
		
		System.out.println();
		
//		for (int a = 0; a <= 10; a++) {
//			if (numbers[a] % 2 != 0) {
//				System.out.print(numbers[a] + ",");
//			}
//		}
//		
//		for (int b = 11; b < 20; b++) {
//			if (numbers[b] % 2 == 0) {
//				System.out.print(numbers[b] + ",");
//			}
//		}
		
		for (int c = 0; c < 20; c++) {
			if ((c <= 10 && numbers[c] % 2 != 0) || (c > 10 && numbers[c] % 2 == 0)) {
				System.out.print(numbers[c]);
				if (c < (numbers.length - 1)) {
					System.out.print(",");
				}
			}
		}
		System.out.println();
		
		 ArrayList<Integer> array = new ArrayList<Integer>();
		 for (int y = 0; y < 20; y++) {
			 array.add((y + 1) * 5);
		 }
		 
		 System.out.println(array);
		 
		 for (int n = 0; n < 20; n++) {
			 if ((n <= 10 && array.get(n) % 2 != 0) || (n > 10 && array.get(n) % 2 == 0)) {
				 System.out.print(array.get(n));
				 if (n < (array.size() - 1)) {
					 System.out.print(",");
				 }
			 }
		 }
	}
}