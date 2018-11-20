import java.util.Scanner;

public class EMI
{
public void cal()
{
	System.out.println("Welcome To Banking");
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the LoanAmount");
	int p= sc.nextInt();	
	
	System.out.println("Enter the RateofInterst");
	double rate = sc.nextDouble();
	double i = (rate/100);
	
	System.out.println("Enter the tenure");
	int t=sc.nextInt(); 
	System.out.println("Enter the no of installenment (constant value)");
	int n = sc.nextInt();//constant
	
	double a = (i/n);
	double interest = (p*a);
	System.out.println(interest);

	double y;
	y = a + 1;
	
	double z = (Math.pow(y, t));

	double u =(1-(1/z));
	
	double xy= (interest/u);
	System.out.println("EMI");
	System.out.println(xy);

	double Pn = (xy-interest );
	System.out.println(Pn);
	double OPn = (p-Pn);
	System.out.println(OPn);
	
}
	public static void main(String[] args) 
	{
		EMI a = new EMI();
		a.cal();
		
		
//		double Pn = (xy-interest );
//		System.out.println(Pn);
//		double OPn = (p-Pn);
//		System.out.println(OPn);
//	
	}

}
