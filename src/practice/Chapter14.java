package practice;

public class Chapter14 {

	public static void main(String[] args) {
		NoCapsuleTask task = new NoCapsuleTask("牛乳を買う", 20211021);
		System.out.println("タスク内容は" + task.content + "です。");
		System.out.println("期限は" + task.date + "です。");
		System.out.println("状態は" + task.status + "です");
		task.status = "完了";
		System.out.println("状態は" + task.status + "になりました。");

	}

}
