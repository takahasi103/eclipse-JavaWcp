package anonymous_class;

public class Chapter27_2 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Thread t = new Thread(new Runnable() {
				@Override
				public void run() {
					System.out.println("無名クラスのテスト");
				}
			});
			t.start();
		}

	}

}
