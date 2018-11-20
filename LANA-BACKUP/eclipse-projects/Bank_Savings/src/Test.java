import java.util.Scanner;
class Test { 
	
	public static void main(String[] args) 
	{
		
		System.out.println("Welcome To Banking");
		System.out.println("Enter the Name");
		Scanner sc = new Scanner(System.in);
		String Name = sc.nextLine();
		System.out.println("Enter the Age");
		int Age = sc.nextInt();
		
		PrintStatement p = new PrintStatement(Name, Age);
		
		System.out.println("Press A to open saving account");
		System.out.println("Press B to open current account");
		
		char Option = sc.next().charAt(0);
		switch(Option)
		{
		case 'A' : 
			System.out.println("Enter the amount going to deposit");
			int DepositAmount = sc.nextInt();
			System.out.println("With interst after 1 year");
			double interst = DepositAmount*3.5*12;
			System.out.println(interst);
			break;
		case 'B' :
				System.out.println("Amount that you can able to deposit per month"); 
				int FixedDeposit = sc.nextInt();
				System.out.println("Duration of year");
				double FixedInterst = sc.nextDouble();
				FixedInterst = FixedDeposit%10;
				System.out.println(FixedInterst);
		}
	}
}
	
