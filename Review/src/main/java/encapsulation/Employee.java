package encapsulation;
public class Employee
{
private String name;
private int salary;
public void setter(int salary,String name)
{
	this.salary=salary;
	this.name=name;
}
public void getter()
{
	System.out.println("Salary:"+salary);
	System.out.println("Name:"+name);
}
}
