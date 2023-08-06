
public class Chapter09 {

	public static void main(String[] args) {
		/* 問題1
		   以下のようなかけ算の九九表を表示するプログラムを作成
		　 1*1=1 1*2=2 1*3=3 1*4=4 1*5=5 1*6=6 1*7=7 1*8=8 1*9=9
		   2*1=2 2*2=4 2*3=6 2*4=8 2*5=10 2*6=12 2*7=14 2*8=16 2*9=18
		   3*1=3 3*2=6 3*3=9 3*4=12 3*5=15 3*6=18 3*7=21 3*8=24 3*9=27
		   4*1=4 4*2=8 4*3=12 4*4=16 4*5=20 4*6=24 4*7=28 4*8=32 4*9=36
		   5*1=5 5*2=10 5*3=15 5*4=20 5*5=25 5*6=30 5*7=35 5*8=40 5*9=45
		   6*1=6 6*2=12 6*3=18 6*4=24 6*5=30 6*6=36 6*7=42 6*8=48 6*9=54
		   7*1=7 7*2=14 7*3=21 7*4=28 7*5=35 7*6=42 7*7=49 7*8=56 7*9=63
		   8*1=8 8*2=16 8*3=24 8*4=32 8*5=40 8*6=48 8*7=56 8*8=64 8*9=72
		   9*1=9 9*2=18 9*3=27 9*4=36 9*5=45 9*6=54 9*7=63 9*8=72 9*9=81
		*/
		
		for (int n = 1; n <= 9; n++) {
			int product1 = n * 1;
			int product2 = n * 2;
			int product3 = n * 3;
			int product4 = n * 4;
			int product5 = n * 5;
			int product6 = n * 6;
			int product7 = n * 7;
			int product8 = n * 8;
			int product9 = n * 9;
			System.out.println(n + "*1=" + product1 + " " + n + "*2=" + product2 + " " + n + "*3=" + product3
								+ " " + n + "*4=" + product4 + " " + n + "*5=" + product5 + " " + n + "*6=" + product6
								+ " " + n + "*7=" + product7 + " " + n + "*8=" + product8 + " " + n + "*9=" + product9);
		}
		
		System.out.println("");
		
		for (int i = 1; i <= 9; i++) {
			int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
			for (int n : array) {
				String product = i + "*" + n + "=" + i * n + " ";
				System.out.print(product);
			}
			System.out.println("");
		}
		
		System.out.println("");
		
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i + "*" + j + "=" + i*j + " ");
			}
			System.out.println("");
		}

	}

}
