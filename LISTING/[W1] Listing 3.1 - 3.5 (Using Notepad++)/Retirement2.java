import java.util.*;

public class Retirement2
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Berapa banyak uang yang bertambah setiap tahunnya? ");
		double payment = in.nextDouble();
		
		System.out.print("Pertamabahan setiap tahun dalam %: ");
		double interestRate = in.nextDouble();
		
		double balance = 0;
		int year = 0;
		
		String input;
		
		//update account balance while user isn't ready to retire 
		do 
		{
			// add this year's payment and interest
			balance += payment;
			double interest = balance * interestRate / 100;
			balance += interest;
			
			year++;
			
			// print current balance
			System.out.printf("Setelah %d tahun, tabungan anda sebesar %.2f%n", year, balance);
			
			//ask if ready to retire and get input 
			System.out.print("Ingin Pensiun? (Y/N) ");
			input = in.next();
		}
		while (input.equals("N"));
	}
}