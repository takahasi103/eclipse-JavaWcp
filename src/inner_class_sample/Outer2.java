package inner_class_sample;

public class Outer2 {
	// 外部クラスに定義したフィールドgreeting
	private String greeting = "こんにちは";

	public class Inner {

		public String hello() {
      // 内部クラスInnerから、外部クラスOuterのフィールドgreetingを参照
			return greeting;
		}
	}
	
	// staticなフィールドgreeting
//	private static String greeting = "こんにちは";

	// staticな内部クラスInner
//	public static class Inner {

//		public String hello() {
		// 外部クラスOuterのフィールドgreetingはstaticなので、参照可能
//			return greeting;
//		}
//	}
}
