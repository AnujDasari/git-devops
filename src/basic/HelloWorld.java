package basic;

public class HelloWorld {

	public static void main(String[] args) {
		HelloWorld obj = new HelloWorld();
		obj.welcomeMessage();

		int sum = obj.addNumbers(5, 4);
		System.out.println("The sum of the 2 numbers is: " + sum);
	}

	public void welcomeMessage() {
		System.out.println("Hi All... Welcome to Devops certification program!");
	}

	public int addNumbers(int a, int b) {
		int sum = a + b;
		return sum;
	}
}
