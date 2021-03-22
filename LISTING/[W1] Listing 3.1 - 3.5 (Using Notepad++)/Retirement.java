import java.util.*;

public class Retirement
{
	public static void main(String[] args)
	{
		// read inputs
		Scanner in = new Scanner(System.in);
		
		System.out.print("Berapa banyak uang yang anda butuhkan untuk pensiun? ");
		double goal = in.nextDouble();
		
		System.out.print("Berapa banyak uang yang bertambah setiap tahunnya? ");
		double payment = in.nextDouble();
		
		System.out.print("Pertamabahan setiap tahun dalam %: ");
		double interestRate = in.nextDouble();
		
		double balance = 0;
		int years = 0;
		
		// update account balance while goal isn't reached
		while (balance < goal)
		{
			// add this year's payment and interestRate
			balance += payment;
			double interest = balance * interestRate / 100;
			balance += interest;
			years++;
		}
		
		System.out.println("You can retire in " + years + " years.");
	}
}
	