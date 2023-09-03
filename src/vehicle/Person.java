package vehicle;

public class Person {
	private String firstName;
	private String middleName;
	private String lastName;
	private int age;
	private int endurance = 1000;
	private int wallet;
	
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
	
	public void buy(Vehicle vehicle) {
		vehicle.setOwner(this);
	}
	
	public int getEndurance() {
		return this.endurance;
	}
	
	public void setEndurance(int endurance) {
		this.endurance = endurance;
	}
	
	public void charge(int litre) {
		System.out.println(litre + "ml水分を補給します");
		if (litre <= 0) {
			System.out.println("補給できません");
		} else if (litre + this.endurance >= 1000) {
			System.out.println("体力が満タンになりました");
			this.endurance = 1000;
		} else {
			this.endurance += litre;
		}
		System.out.println("持久力:" + this.endurance);
	}
	
	public int getWallet() {
		return this.wallet;
	}
	
	public void setWallet(int wallet) {
		this.wallet = wallet;
	}
	

}
