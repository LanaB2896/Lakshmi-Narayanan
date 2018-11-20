import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
public class version_2
{
	public static List<String> list = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		version_2 a = new version_2();
		a.cal();
		System.out.println("Enter the installentation number");
		int num = sc.nextInt();
		System.out.println(list.get(num));
	}
	public  void cal()
	{
		System.out.println("Welcome To Banking");
		System.out.println("Enter the LoanAmount");
		float p = sc.nextFloat();
		System.out.println("Enter the RateofInterst");
		float rate = sc.nextFloat();
		float i = (rate / 100);
		float t=0;
		try
		{
			System.out.println("Enter the tenure");
			 t = sc.nextFloat();
			if(t<0)
			{
				throw new InputMismatchException("Negative number");
			}
		}
		catch( InputMismatchException t1)
		{
			System.out.println(t1.getMessage());
			while(t<0)
			{
				
				System.out.println("Enter the correct positive tenure");
				t = sc.nextFloat();
			}
		}
		
		float n=0;
		try {
			System.out.println("Enter the no of installenment (constant value)");
			 n = sc.nextFloat();
		if(n<12||n>12)
		{
			throw new InputMismatchException("Not correct");
		}
	}
		catch(InputMismatchException n1)
		{
		System.out.println(n1.getMessage() );
		while(n<12 || n>12)
		{ 
			System.out.println("Enter the correct instalenment number");
			n=sc.nextFloat();
		}
		}
		// function2
		for (int i1 = 0; i1 < 12; i1++)
		{
			System.out.println(i1);
			p = calculateInstallment(p, i, t, n);
		}
	}
	static float EMI = (float) 0.0;
	static boolean emicalculator = true;
	float calculateInstallment(float p, float i, float t, float n)
	{
		float numerator1 = (i / n);
		float numerator = (p * numerator1);

		float deno1 = 1 + numerator1;

		float deno2 = (float) (Math.pow(deno1, t));

		float denominator = (1 - (1 / deno2));
		if (emicalculator)
		{
			EMI = (numerator / denominator);
			emicalculator = false;
		}

		double Pn = (EMI - numerator);
		double OPn = (p - Pn);

		DecimalFormat formatter = new DecimalFormat("#.##");
		System.out.format("%-15s %-25s %-15s %-15s\n", "O/s Principle", "Interest", "Principle", "EMI");
		System.out.format("%-15s %-25s %-15s %-15s\n",formatter.format(p),formatter.format(numerator),formatter.format(Pn),formatter.format(EMI));
		String v = ("laonAm: "+formatter.format(p)+" Interest:" +formatter.format(numerator)+" Principle :"+formatter.format(Pn)+" EMI:"+ formatter.format(EMI));
		list.add(v);
		return (float) OPn;
		
	}

}
