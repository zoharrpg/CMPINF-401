/*
	Exercise2.java
	- WRITE A SINGLE DO LOOP THAT DOES THE FOLLOWING UNTIL THE USER ENTERS AN INT IN 1..100 INCLUSIVE
	- 	USE TRY CATCH TO READ AN INT FROM THE KBD SUCH THAT IF USER ENTERS "FOO" IT DOES NOT CRASH
	- 	BE SURE TO MANUALLY THROW AN EXCEPTION & CATCH IT FOR THE CASE OF USER ENTERING AN VALID 
	-	INT THAT HAPPENS TO BE OUT OF RANGE.

*/
import java.io.*;
import java.util.*;

public class Exercise2
{
	public static void main( final String args[] )
	{
		// ADD LOOP CODE, ADD TRY CATCH BLOCK(S) AS NEEDED BELOW
		// BE SURE TO LEAVE THESE 3 LINES IN THERE SOMEWHERE  
		// SINCE THEY CONTAIN THE EXACT EXPECTED OUTPUT TEXT

		
		int number=0;
		
		do{
			System.out.print("Enter int in range 1..100 inclusive: ");
			
				
			
			try
			{
				Scanner kbd = new Scanner(System.in);
				number = kbd.nextInt();
				if(number<=0) throw new Exception("Number:"+number+" out of range. Must be in 1..100");
				


			}
			catch(InputMismatchException ime)
			{
				System.out.println("Input was not an integer");
				
				
			
			}
			catch(Exception e)
			{
				System.out.println(e);
			}

		}while(number<1||number>100);


		
		
		System.out.format("Thank you. You entered %d\n", number );
		
	} //END main
} //END CLSS