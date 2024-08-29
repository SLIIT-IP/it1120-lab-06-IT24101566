import java.util.Scanner;
public class IT24101566Lab6Q2C
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter 10 numbers: ");
        int[] numbers = new int[10];
		int count = 0;
		int i;
		i = 0;
		
		while(i<10)
        {
            
            System.out.print("Enter number "+(i+1)+": ");
            numbers[i] = input.nextInt();
            count = count + numbers[i];
            i++;
        }
        i = 0;
        while (i<10)
        {
            System.out.print(numbers[i]+" ");
            i++;
        }
		System.out.println();
        System.out.println("Sum of the numbers: "+count);
        double average =  count/10;
        System.out.println("Average of the numbers: "+average);
    }
}