package lambda_expression;

public class Chapter28 {
	
	public static void main(String[] args) throws Exception {
		Func1 f1 = x -> x % 2 == 1;
		Func2 f2 = (male, name) -> {
			if (male) {
				return "Mr." + name;
			} else {
				return "Ms." + name;
			}
		};
		System.out.println(f1.isOdd(15));
		System.out.println(f2.addNamePrefix(true, "Smith"));
	}

}
