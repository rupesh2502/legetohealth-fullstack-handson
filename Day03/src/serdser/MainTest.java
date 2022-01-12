package serdser;

import java.util.Scanner;

public class MainTest {
	static User[] data = new User[3];

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		User user1 = new User(101, "Ajit", 23);
		User user2 = new User(102, "Amit", 24);
		User user3 = new User(103, "Ashish", 25);
		data[0] = user1;
		data[1] = user2;
		data[2] = user3;
		System.out.println("Enter UserId");
		int userId = sc.nextInt();
		searchUser(userId);
	}

	public static void searchUser(int id) {
		boolean found = false;
		try {
			for (int i = 0; i < data.length; i++) {
				if (id == data[i].getId()) {
					System.out.println("User Found!! User Id: " + data[i].getId() + " User Name: " + data[i].getName() + " User Age: "
							+ data[i].getAge());
					found = true;
				}
			}
			if (!found)
				throw new UserNotFoundException("User with Specific Id not Found",
						new Throwable("USERNOTFOUNDEXCEPTION"));

		} catch (UserNotFoundException e) {
			System.out.println("User with Specific Id not Found");
			e.printStackTrace();
		}

	}

}
