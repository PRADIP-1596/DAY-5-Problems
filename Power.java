package leap;
import java.util.Scanner;
public class PowerOfNumbers {

	public static void main(String[] args)
	{
		//scanner class declaration
		Scanner sc = new Scanner(System.in);
		//input base value and exponent value from user
		System.out.print("Enter the value of base : ");				
		int base = sc.nextInt();
		System.out.print("Enter the value of exponent : ");				
		int exp = sc.nextInt();
		//declare an integer variable to store the result
                int result = 1;
		//logic for calculating power of the entered number
                while (exp != 0)
                {
                    result = result * base;
                    --exp;
                }
		//print the result
                System.out.println("Answer = " + result);
		//closing scanner class(not compulsory, but good practice)
		sc.close();	
        }
}
