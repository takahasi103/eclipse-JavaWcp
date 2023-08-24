package vehicle;

public class Main {

	public static void main(String[] args) {
		Car car1 = new Car("自動車", "赤");
		car1.printData();
		
		System.out.println();
		
		Bicycle bicycle1 = new Bicycle("自転車", "青");
		bicycle1.printData();
		
		System.out.println();
		
		System.out.println(car1.getName());
		car1.run(20);
		car1.printData();
		
		System.out.println();
		
		System.out.println(bicycle1.getName());
		bicycle1.run(10);
		bicycle1.printData();

	}

}
