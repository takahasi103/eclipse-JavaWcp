package inner_class_sample;

public class Main {

	public static void main(String[] args) {
		Human human = new Human();
		Human.HumanLeg leg = human.new HumanLeg();
		leg.kick();

	}

}
