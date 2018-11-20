
public class Print {

	String Name;
	int age;
	
	Print(){
		
	}
	public Print(String name, int age) {
		Name = name;
		this.age = age;
	}
	
	public void valid()
	{
		if
		(age<18) {
			
			System.out.println("Sorry not eligible to open the Bank Account");
			System.exit(0);
		}
		else
			System.out.println("Proceed to next filed");
		
		
	}
	public void display() {
		System.out.println("Name: "+Name+"\nAge: "+age);
		
	}
	
}
