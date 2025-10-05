import java.util.*;

public class Armstrong
{
    public static boolean isArmstrong(int num)
    {
    
    
    int sum=0;
    int temp=num;
    
    while(num > 0)
    {
        int lastDigit;
        lastDigit = num%10;
        sum=sum+(lastDigit*lastDigit*lastDigit);
        num=num/10;
    }
    
    return temp == sum;
    }
   
	public static void main(String[] args) 
	{
	     Scanner sc = new Scanner(System.in);
	    System.out.print("Enter 3 digit number to check for armstrong number=");
	    
        int num= sc.nextInt();
	    boolean answer = isArmstrong(num);
	    if (answer)
	    {
	        System.out.println("Yes, it is an armstrong number");
	    }
	    else
	    {
	        System.out.println("No, it is not an armstrong number");   
	    }
	}
}