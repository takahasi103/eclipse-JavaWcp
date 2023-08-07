package classmethod.human;

/* 
   名称	         指定方法	        アクセスを許可する範囲
   private	     private	    自身のクラスのみ
   package      （何も書かない）	自身と、自分と同じパッケージに属するクラス
   private	    （何も書かない）	自身と、自分と同じパッケージに属するクラス
   protected	 protected	    自身と、自分と同じパッケージに属するクラス、および自分を継承したクラス
   public	     public	        すべてのクラス
 */

public class Human05 {
	// メンバー変数
	private String name; // インスタンス変数
	private int age; // インスタンス変数

	public Human05() {
		name = "山田";
		age = 20;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}
