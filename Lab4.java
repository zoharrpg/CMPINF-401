// STARTER FILE LAB #4 CS 401 SPRING 2020 DEVINE/HOFFMAN
import java.util.*;
import java.io.*;

public class Lab4
{
    static final int MAX_CAPACITY = 30;  // HARDOCED PLENTY BIG. WE'LL DO TRIM AFTER
    
    public static void main( String args[] ) throws Exception
    {
        if (args.length < 1 )
        {
            System.out.println("usage: $ java Lab3 <inupt file of random numbers>\n");
            System.exit(0);
        }
        
        int[] arr = new int[ MAX_CAPACITY ];
        int count=0;
        
        Scanner infile = new Scanner( new File( args[0] ) );
        while ( infile.hasNextInt() )
        {
            insertInOrder( arr, count, infile.nextInt() );
            ++count;
        }
        
        arr = trimArray( arr, count );
        printArray( arr ); // NOTE:  NO COUNT PASSED IN
        
    }// END MAIN
    
    // ############################################################################################################
    
    // MUST USE ENHANCED FOR LOOP IN THIS METHOD
    // (YOUR TRIM BETTER HAVE BEEN WRITEN CORRECTLY)
    static void printArray( int[] array )
    {
       for (int n:array) // PRINT EACH NUMBER WITH A SPACE AFTER IT
        System.out.print(n +" "); // LEAVE THIS HERE
    }
    
    static int[] trimArray( int[] array, int count  )
    {
        int [] trimArray = new int[count];

        for(int i = 0; i<count;i++)
            trimArray[i]=array[i];

        return trimArray; // THIS IS NOT CORRECT. YOU MUST REPLACE IT!!!!
    }
    
   
    // THE CODE IN HERE NOW JUST APPENDS. THIS IS NOT CORRECT
    static void insertInOrder( int[] arr, int count, int newVal   )
    {
         if(count==0)
           arr[0]=newVal;

      
          int i;
          for( i=count-1;i>=0&&newVal<arr[i];i--){
               
                        arr[i+1]=arr[i];
                       
                        
                    
                   
                  
        }
         arr[i+1]=newVal;
                    

              
                   

                  
              

             
             
        






       // THIS IS NOT CORRECT. YOU MUST REPLACE IT!!
    }
}// END LAB #4

