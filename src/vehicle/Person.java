package vehicle;

public class Person {
	private String firstName;
	private String middleName;
	private String lastName;
	private int age;
	
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
	

}
