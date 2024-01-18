import java.util.TreeSet;
public class comp_to 
{
	public static void main(String[] args) 
	{
		TreeSet <Integer> t = new TreeSet<>(new MyComparator());
		
		t.add(10);
		System.out.println(t);
		t.add(9);
		System.out.println(t);
		t.add(99);
		System.out.println(t);
		t.add(15);
		System.out.println(t);
		t.add(100);
		System.out.println(t);
		t.add(1);
		System.out.println(t);
		
		
	}

}
