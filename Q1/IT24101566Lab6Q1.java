import java.util.Scanner;
public class IT24101566Lab6Q1
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		double num = input.nextInt();
		
		double square = num*num;
		double squareRoot = Math.sqrt(num);
		System.out.println("The square of "+num+" is : "+square);
		System.out.println("The square root of "+num+" is : "+squareRoot);
	}
}