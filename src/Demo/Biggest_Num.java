package Demo;

import java.util.Scanner;

public class Biggest_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter any three numbers");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		
		if ( a>b)
		{
			
			if (a>c)
			{
				
				System.out.println(a + " is biggest");
			}
			
			else
				
			{
				System.out.println(b + " is biggest");
				

			}
			
		}			
			else
			{
				
				if (b > c)
				{
					
					System.out.println(b + " is biggest");
				}
				
				else
				{
					System.out.println(c + " is biggest");
					
				}
			}
			
		}
			
		
	}


