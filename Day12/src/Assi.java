import java.util.TreeSet;

public class Assi 
{
	public static void main(String[] args) 
	{
		TreeSet <String> x = new TreeSet<>();
		
		String [] arr = {"Omkar","Atharva","Rahul","Pranav"};
		for(String i:arr)
			x.add(i);
			
		System.out.println(x);
		
		
		TreeSet <String> x1 = new TreeSet<>(new MyComp1());
		
		String [] arr1 = {"Omkar","Atharva","Rahul","Pranav"};
		for(String i:arr1)
			x1.add(i);
			
		System.out.println(x1);	
	}
}
