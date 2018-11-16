import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
public class version_3
{
	public static List<String> list = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		version_3 a = new version_3();
		a.cal();
		System.out.println("Enter the installentation number");
		int num = sc.nextInt();
		System.out.println(list.get(num));
	}
	public  void cal()
	{
		System.out.println("Welcome To Banking");
		System.out.println("Enter the LoanAmount");
		float principle = sc.nextFloat();
		System.out.println("Enter the RateofInterst");
		float RateofInterest = sc.nextFloat();
		RateofInterest = (RateofInterest / 100);
		float Tenure_or_number_of_installments=0;
		try
		{
			System.out.println("Enter the tenure");
			 Tenure_or_number_of_installments = sc.nextFloat();
			if(Tenure_or_number_of_installments<0)
			{
				throw new InputMismatchException("Negative number");
			}
		}
		catch( InputMismatchException t1)
		{
			System.out.println(t1.getMessage());
			while(Tenure_or_number_of_installments<0)
			{
				
				System.out.println("Enter the correct positive tenure");
				Tenure_or_number_of_installments = sc.nextFloat();
			}
		}
		
		float Number_of_payments_in_a_year=0;
		try {
			System.out.println("Enter the no of payment in a year (constant value)");
			 Number_of_payments_in_a_year = sc.nextFloat();
		if(Number_of_payments_in_a_year<12||Number_of_payments_in_a_year>12)
		{
			throw new InputMismatchException("Not correct");
		}
	}
		catch(InputMismatchException n1)
		{
		System.out.println(n1.getMessage() );
		while(Number_of_payments_in_a_year<12 || Number_of_payments_in_a_year>12)
		{ 
			System.out.println("Enter the correct instalenment number");
			Number_of_payments_in_a_year=sc.nextFloat();
		}
		}
		// function2
		for (int i1 = 0; i1 < 12; i1++)
		{
			System.out.println(i1);
			principle = calculateInstallment(principle, RateofInterest, Tenure_or_number_of_installments, Number_of_payments_in_a_year);
		}
	}
	static float EMI = (float) 0.0;
	static boolean emicalculator = true;
	float calculateInstallment(float principle, float RateofInterest, float Tenure_or_number_of_installments, float Number_of_payments_in_a_year)
	{
		float numerator1 = (RateofInterest / Number_of_payments_in_a_year);
		float numerator = (principle * numerator1);

		float deno1 = 1 + numerator1;

		float deno2 = (float) (Math.pow(deno1, Tenure_or_number_of_installments));

		float denominator = (1 - (1 / deno2));
		if (emicalculator)
		{
			EMI = (numerator / denominator);
			emicalculator = false;
		}

		double Pn = (EMI - numerator);
		double OPn = (principle - Pn);

		DecimalFormat formatter = new DecimalFormat("#.##");
		System.out.format("%-15s %-25s %-15s %-15s\n", "O/s Principle", "Interest", "Principle", "EMI");
		System.out.format("%-15s %-25s %-15s %-15s\n",formatter.format(principle),formatter.format(numerator),formatter.format(Pn),formatter.format(EMI));
		String v = ("laonAm: "+formatter.format(principle)+" Interest:" +formatter.format(numerator)+" Principle :"+formatter.format(Pn)+" EMI:"+ formatter.format(EMI));
		list.add(v);
		return (float) OPn;
		
	}

}
