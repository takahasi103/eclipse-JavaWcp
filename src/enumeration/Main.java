package enumeration;

public class Main {

	public static void main(String[] args) {
		System.out.println(Dessert.APPLE);
		System.out.println(Dessert.ICE_CREAM);
		System.out.println(Dessert.CAKE);
		
		Dessert2.APPLE.advertise(); // 「まっかなりんごが100円！」と出力
		Dessert2.ICE_CREAM.advertise(); // 「夏にぴったりアイスクリームが200円！」と出力
		Dessert2.CAKE.advertise(); // 「皆大好き甘いケーキが300円！」と出力
	}

}
