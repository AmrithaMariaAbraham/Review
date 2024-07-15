package abstraction;
public class ClassA extends AbstractClass
{
	public static void main(String[] args)
	{
		ClassA obj=new ClassA();
		obj.show();
		obj.dispaly();
	}
	@Override
	public void dispaly() 
	{
		System.out.println("Overrided display method");		
	}
}
