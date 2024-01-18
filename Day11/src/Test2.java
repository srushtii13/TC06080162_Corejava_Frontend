
public class Test2 implements Cloneable
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
		Student s = new Student(1102,"Omkar",10000.0f);
		Student s1 =(Student) s.clone();
		System.out.println(s1);
		
	}

}
