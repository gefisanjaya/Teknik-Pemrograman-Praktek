import java.util.*;

public class InputTest
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		// get first input
		System.out.print("Siapa Nama Anda? ");
		String name = in.nextLine();
		
		// get second input
		System.out.print("Berapa umur Anda? ");
		int age = in.nextInt();
		
		// display output on console
		System.out.println("Hello, " + name + ". Next year, you'll be " + (age + 1));
	}
}