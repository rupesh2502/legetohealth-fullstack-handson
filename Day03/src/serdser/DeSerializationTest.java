package serdser;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("data.ser");
		@SuppressWarnings("resource")
		ObjectInputStream ois=new ObjectInputStream(fis);
        User user= (User) ois.readObject();
        System.out.println(user.getId()+" "+user.getName()+" "+user.getAge());
	}

}
