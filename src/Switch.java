
public class Switch {
	// 列挙型
		enum Vals {
			EXCELLENT,
			GOOD,
			POOR,
		};

	public static void main(String[] args) {
		int val = 2;
		switch (val) {
		case 3:
			System.out.println("よくできました！");
			break;
		case 2:
			System.out.println("ふつうでした！");
			break;
		default:
			System.out.println("がんばろう！");
		}
		
		Vals val2 = Vals.EXCELLENT;
		switch (val2) {
		case EXCELLENT:
			System.out.println("よくできました！");
			break;
		case GOOD:
			System.out.println("ふつうでした！");
			break;
		default:
			System.out.println("がんばろう！");
		}
	}

}
