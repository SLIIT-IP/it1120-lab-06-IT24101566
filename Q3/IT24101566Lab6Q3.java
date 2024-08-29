import java.util.Scanner;
public class IT24101566Lab6Q3
{
  public static void main(String args[])
  {
    System.out.println("Enter positive integers (terminate input with -99): ");
    Scanner input = new Scanner(System.in);
    int sum = 0;
    int count = 0;
    while(true)
    {
      System.out.print("Enter a number: ");
      int num = input.nextInt();
      
    
      if (num==-99)
      break;

      else if(num<0)
      {
        System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");
        continue;
      }
      else
      {
        int square = num*num;
        sum = sum+square;
        count++;
      }
      
    }
    double result = Math.sqrt(sum/count);
    System.out.println("The Root Mean Sqare (RMS) is : "+result);
  }
}