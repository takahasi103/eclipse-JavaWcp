
public class For {

	public static void main(String[] args) {
		for (int number = 1; number <= 5; number++) {
            System.out.println("For01 = " + number);
        }
		
		// 拡張for文
		int[] array = { 1, 2, 3, 4, 5 };
        for (int number : array) {
            System.out.println("For02 = " + number);
        }
	}

}
