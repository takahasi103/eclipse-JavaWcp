
public class While {

	public static void main(String[] args) {
		int number = 100;
		// while文
        while (number < 50) {
            number *= 2;
            System.out.println("While01 = " + number);
        }
        
        // do-while文
        do {
            number *= 2;
            System.out.println("DoWhile01 = " + number);
        } while (number < 50);
	}

}
