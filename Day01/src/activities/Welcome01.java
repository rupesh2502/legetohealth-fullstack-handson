package activities;

public class Welcome01 {
	public static void main(String[] args) {
		String welcomeMsg = sayHello("Rupesh");
		System.out.println(welcomeMsg);
	}

	public static String sayHello(String name) {
		return "Hello " + name + " Welcome to Java";
	}
}
