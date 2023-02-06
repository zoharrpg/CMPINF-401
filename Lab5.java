import java.util.*;
import java.io.*;

public class Lab5
{
	static final int NOT_FOUND = -1;  // THE INDEX TO RETURN IF KEY NOT FOUND AT ANY INDEX IN ARRAY
    
	static int[] arr1 = { 87, 52, 96, 84, 26, 31, 37, 30, 95, 35, 75, 34, 91, 27, 78, 60, 29, 65, 57, 70 };
    
	static int[] arr2 = { 92, 42, 76, 67, 35, 46, 17, 54, 34, 86, 16, 88, 20, 81, 57, 28, 85, 90, 79, 32 };
        
	public static void main( String args[] ) throws Exception
	{
		printArray( "arr1 before being sorted: ", arr1 );
		selectionSort( arr1 );
		printArray( "arr1 after selectionSort: ", arr1 );
        
		printArray( "arr2 before being sorted: ", arr2 );
		bubbleSort(arr2 );
 		printArray( "arr2 after bubbleSort:    ", arr2 );	
	}
    
 	// ############################################################################################################
    
	static void printArray( String label, int[] array )
	{
		System.out.print( label );
		for ( int i=0 ; i<array.length ; ++i )
			System.out.print( array[i] + " ");
		System.out.println();
	}
    
	/*	I N D E X  O F  M I N:
		STARTING NOT ALWAYS AT THE BEGINNING, NOT ALWAYS AT INDEX 0
		STARTING AT THE INDEX PASSED IN, FIND AND RETURN 
		THE INDEX OF THE SMALLEST NUMBER IN THE ARRAY
	*/
	static int indexOfMin( int[] array, int startingAt )
	{
		int low=array[startingAt];
		int smallestindex = startingAt;
		for(int j = startingAt;j<array.length;j++)
				
				if(low>array[j])
				{
				    low = array[j];
				    smallestindex = j;
				}
            



		return smallestindex; // REPLACE WITH YOUR CODE
	}
    
	/*	S E L E C T I O N  S O R T:
		FOR i AT EVERY INDEX OF THE ARRAY FROM 0 TO LENGTH-1 INCLUSIVE
			FIND THE INDEX OF LARGEST NUMBER IN ARRAY FROM I ONWARD
			SWAP THE NUMBER AT THAT [INDEX] WITH THE NUMBER AT [i]

		THE ARRAY IS NOW SORTED!
	*/
    
	static void selectionSort( int[] array )
	{

		int index;
		for(int i=0;i<array.length;i++)
		{
			index = indexOfMin(array,i);
			

           int temp = array[i];
			array[i]=array[index];
			array[index] = temp;
		}
	}




		// YOUR CODE HERE
	
    
	/*	B U B B L E  S O R T:
	FOR STOP = .length-2 DOWNTO 0 
		FOR i = 0 UPTO STOP
			IF ARRAY[i] AND ARRAY[i+1] ARE OUT OF ORDER
				SWAP 'EM

	THE ARRY IS NOW SORTED!
	*/

	static void bubbleSort( int[] array )
	{
		boolean order=false;
		boolean order2=true;
		
		for(int stop=array.length-1;stop>0&&order==false;stop--)
		{
			for(int i=0;i<stop;i++)
			{

				
				if(array[i]>array[i+1])
				{
					int temp = array[i];
					array[i]=array[i+1];
					array[i+1]=temp;
					 
					 order2=false;
					
				
				}
				if(order2)
					order = true;
			
			}


		// YOUR CODE HERE
	      }
    }
}// END CLASS

