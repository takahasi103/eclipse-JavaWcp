package lambda_expression;

public interface C {
	public String hello();
    public static String hi() { // 抽象メソッドは1つしかないので、関数型インターフェース
        return "Hi!";
    }
}
