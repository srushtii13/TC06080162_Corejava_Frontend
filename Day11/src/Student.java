import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Cloneable,Serializable
{
	private int rollNo;
	private String name;
	private  transient float fees; // transient
	
	@Override
	public String toString() 
	{
		return "Student [rollNo=" + rollNo + ", name=" + name + ", fees=" + fees + "]";
	}
	public Student()
	{
		
	}

	public Student(int rollNo, String name, float fees) 
	{
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.fees = fees;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	public static void main(String[] args) throws CloneNotSupportedException,IOException, ClassNotFoundException
	{
		
		/*
		Student x = new Student(1000,"Omkar",13500.0f);
		ObjectOutputStream oi = new ObjectOutputStream(new FileOutputStream("f:\\abc.txt"));
		oi.writeObject(x);
		System.out.println("Success");	
		oi.close();
		*/
		
		
		
		ObjectInputStream oi = new ObjectInputStream(new FileInputStream("f:\\abc.txt"));
		Student x = (Student) oi.readObject();
		System.out.println(x);
		
		
	}
	
	
}
