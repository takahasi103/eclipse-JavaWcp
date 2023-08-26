package vehicle;

public class Person {
	private String firstName;
	private String middleName;
	private String lastName;
	private int age;
	private int endurance = 100;
	
	Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	Person(String firstName, String middleName, String lastName, int age) {
		this(firstName, lastName, age);
		this.middleName = middleName;
	}
	
	public String fullName() {
		if (middleName == null) {
			return this.firstName + " " + this.lastName;
		} else {
			return this.firstName + " " + this.middleName + " " + this.lastName;
		}
	}
	
	public void printData() {
		System.out.println("名前は" + this.fullName() + "です");
		System.out.println("年齢は" + this.age + "歳です");
	}
	

}
