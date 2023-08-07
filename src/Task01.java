
public class Task01 {

	public static void main(String[] args) {
//		課題
//		1から100までの数値をループで処理する
//		3で割り切れる数値の場合、「Fizz」と表示する
//		5で割り切れる数値の場合、「Buzz」と表示する
//		3と5の両方で割り切れる数値の場合、「FizzBuzz」と表示する
//		それ以外の数値は、その数値をそのまま表示する
		
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}

	}

}
