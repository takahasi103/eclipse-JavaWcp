package lambda_expression;

//インターフェースB
@FunctionalInterface
public interface B {
 public String hello();
// public String goodbye();  // 抽象メソッドが2つあるので、コンパイルエラー
}
