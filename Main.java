import java.util.Scanner;
public class Main 
{
  Scanner sc = new Scanner(System.in);
 
 //function to checkPalindrome

     public void checkPalindrome()  
    {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number:");
	int n=sc.nextInt();
	int sum=0,r,temp=n;
	while(n>0)
 	{
		r=n%10;
		sum=sum=(sum*10)+r;
		n=n/10;
	}
	if(temp==sum)
		System.out.println(temp + "is a palindrome ");
	else
		System.out.println(temp + "is not a palindrome");

     }
	 //function to printPattern downwards

       public void printPattern() 
	   {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number:");
			int rows=sc.nextInt();
			int a,b;
			// Loop for rows
				for(a=rows-1;a>=0;a--)
				{
					//Loop for columns
					for(b=0;b<=a;b++)
					{
						System.out.print("*" + " ");
					}
					System.out.println();
				}
	   }
	    //function to check no is prime or not

        public void checkPrimeNumber() 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number:");
			int num=sc.nextInt();
			int count=0,i;
			for(i=2;i<num;i++)
			{
				if(num%i==0)
				{
					count++;
					break;
				}
			}
			if(count==0)
				System.out.println(num + " is a prime number");
			else
				System.out.println(num +  "is not a prime number");
		}
		 // function to print Fibonacci Series

          public void printFibonacciSeries() 
		  {

                //initialize the first and second value as 0,1 respectively.
						Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number:");
			int fn=sc.nextInt();
			int first = 0, second = 1,i,nextnum;
			for(i=1;i<=fn;++i)
			{
				System.out.print(first + ",");
				nextnum=first + second;
				first=second;
				second=nextnum;
			}
		  }
//main method which contains switch and do while loop

      public static void main(String[] args) 
	     {

     	        Main obj = new Main();

                int choice;

                Scanner sc = new Scanner(System.in);

		do {
			System.out.println();
			System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

			+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

			+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

			System.out.println();

 			choice = sc.nextInt();

			switch (choice)
		   {
			case 0:

			choice = 0;

			break;

 			case 1: {

			obj.checkPalindrome();

			}break;
			
			case 2: {

			obj.printPattern();
			}break;
			
			case 3: {

			obj.checkPrimeNumber();
			}break;
			
			case 4: {

			obj.printFibonacciSeries();
			}break;

			default:

			System.out.println("Invalid choice. Enter a valid no.\n");

		   }

 		   } while (choice != 0);

		System.out.println("Exited Successfully!!!");

}

}