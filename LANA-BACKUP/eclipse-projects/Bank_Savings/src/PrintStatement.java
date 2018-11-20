
public class PrintStatement {
String Name;
int Age;

public PrintStatement(String name, int age) {
	super();
	Name = name;
	Age = age;
	
}
public void validate()
{
	if
	(Age<18) 
	{
		
		System.out.println("Sorry not eligible to open the Bank Account");
		System.exit(0);
	}
	else
		System.out.println("Proceed to next filed");
	
}

}