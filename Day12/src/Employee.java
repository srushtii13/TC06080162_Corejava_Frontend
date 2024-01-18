import java.util.TreeSet;
public class Employee 
{
	private int id;
	private String name;
	
	
	Employee(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public int getId() {return id;}
	public String getName() {return name;}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	public static void main(String[] args) 
	{
		Employee e1 = new Employee(1,"Omkar");
		Employee e2 = new Employee(5,"Rahul");
		Employee e3 = new Employee(31,"Aditya");
		Employee e4 = new Employee(4,"Sachin");
		
		Employee [] arr = {e1,e2,e3,e4};
		
		TreeSet <Employee> x1 = new TreeSet<>(new Id_comp());
		for(Employee p:arr)
			x1.add(p);
		
		System.out.println(x1);
		
		TreeSet <Employee> x2 = new TreeSet<>(new Id_comp().reversed());
		for(Employee p:arr)
			x2.add(p);
		
		System.out.println(x2);
		
		TreeSet <Employee> x3 = new TreeSet<>(new Name_comp());
		for(Employee p:arr)
			x3.add(p);
		
		System.out.println(x3);
		
		TreeSet <Employee> x4 = new TreeSet<>(new Name_comp().reversed());
		for(Employee p:arr)
			x4.add(p);
		
		System.out.println(x4);
		
		
		
		
			
		
		
		
	}

}
