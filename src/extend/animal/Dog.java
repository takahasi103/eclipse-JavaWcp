package extend.animal;

public class Dog extends Animal {
	public Dog() {
		this.name = "犬";
	}

	// 抽象メソッドを上書きして処理を記述
	public void cry() {
		System.out.println(this.name + "が吠えました。ワン！ワン！");
	}
}
