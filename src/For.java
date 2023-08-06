
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
        
        // break文
        for (int count = 0; count < 5; count++) {
            if (count == 2) {
                break; // countが2の場合、for文を終了
            }
            System.out.println("Break01 = " + count);
        }
        
        // continue文
        for (int count = 0; count < 5; count++) {
            if (count == 2) {
            continue; // countが2の場合、この後の処理をスキップ
        }
            System.out.println("Continue01 = " + count);
        }
	}

}
