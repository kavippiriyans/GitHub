package GitHub2;

import java.util.Scanner;

public class Even
{
	public static void main(String[] args) 
	{
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number");
       int a=sc.nextInt();
       
       if(a%2==0)
       {
    	   System.out.println("The entered number is even number");
       }
       else
       {
    	   System.out.println("The entered number is not a even number");
       }
	}

}
