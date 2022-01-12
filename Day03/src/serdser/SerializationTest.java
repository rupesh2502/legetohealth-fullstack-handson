package serdser;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationTest {

	public static void main(String[] args) throws IOException {
		User user = new User(101, "rupesh", 50);
		FileOutputStream fos = new FileOutputStream("data.serv");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(user);
		
		oos.flush();
		oos.close();
		fos.close();
	}

}
