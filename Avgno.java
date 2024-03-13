import java.util.Scanner;
class avgdigit
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
 		System.out.println("enter a no");
		int n= sc.nextInt();
		int digit;
		int sum = 0;
		while(n>0)
		{
		digit =n%10;
		sum=sum+digit;
		n=n/10;
		}
		double avg=sum/2.0;
		System.out.println("avg is" + avg);
System.out.println("HP");
	}
}