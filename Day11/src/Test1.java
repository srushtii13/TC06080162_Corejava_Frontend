import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.*;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test1
{
	public static void main(String[] args) throws Exception
	{
		Student x = new Student(1000,"Omkar",13500);
		ObjectOutputStream oi = new ObjectOutputStream(new FileOutputStream("f://abc.txt"));
		oi.writeObject(x);
		System.out.println("Success");		
	}

}
