/* Project2.java */

import java.io.*;
import java.util.*;

public class Project2
{
	static final int INITIAL_CAPACITY = 10;
	public static void main (String[] args) throws Exception
	{
		// ALWAYS TEST FIRST TO VERIFY USER PUT REQUIRED INPUT FILE NAME ON THE COMMAND LINE
		if (args.length < 1 )
		{
			System.out.println("\nusage: C:\\> java Project2 <input filename>\n\n"); // i.e. C:\> java Project2 dictionary.txt
			System.exit(0);
		}

		String[] words = new String[INITIAL_CAPACITY];
		int wordCount = 0;
		int vowelCount = 0;

		BufferedReader infile = new BufferedReader( new FileReader(args[0]) );
		while ( infile.ready() )
		{
			String word = infile.readLine();

			// # # # # # DO NOT WRITE/MODIFY ANYTHING ABOVE THIS LINE # # # # #

			
            if(wordCount == words.length)
            {
            		words = upSize(words);
            		System.out.println( "words.length after upSize: " + words.length );
            }


             words[wordCount] = word;
             
             wordCount++;

             for(int i = 0; i<word.length();i++)
             {
             	switch (word.charAt(i))
             	{
             		case 'a':
             		vowelCount++;
             		break;

             		case 'e':
             		vowelCount++;
             		break;

             		case 'i':
             		vowelCount++;
             		break;

             		case 'o':
             		vowelCount++;
             		break;

             		case 'u':
             		vowelCount++;
             		break;

             	}

             }

			/*

			if words array is full
			{
			 	upsize the array
				System.out.println( "words.length after upSize: " + words.length ); // use this line
			}

			now append the word onto the end of the array and increment wordCount

			now examine every char in the word and every time you detect an a e i o or u, increment vowelCount

			*/


			// # # # # # DO NOT WRITE/MODIFY BELOW THIS LINE IN MAIN   # # # # #

		} //END WHILE INFILE READY
		infile.close();

		words = downSize( words, wordCount );
		System.out.println( "After downSize() words.length=" + words.length + "\nwordCount=" + wordCount + "\nvowelCount=" + vowelCount );

		System.out.println( "The duplicate word is: " + findFirstDupe( words, wordCount ) );

	} // END main

	// RETURN AN ARRAY OF STRING 2X AS BIG AS ONE YOU PASSED IN
	// BE SURE TO COPY ALL THE OLD OWRDS OVER TO THE NEW ARRAY FIRST
	static String[] upSize( String[] fullArr )
	{
		String[] upsize = new String[2*fullArr.length];

		for (int i = 0; i < fullArr.length;i++)
			upsize[i] = fullArr[i];

		    return upsize;
	}

	static String[] downSize( String[] arr, int count )
	{
		String[] downsize = new String[count];

		for(int i = 0; i < count;i++)
			downsize[i] = arr[i];


		return downsize;
	}

	static String findFirstDupe( String[]  array,  int count )
	{
		for(int i = 0;i < count; i++)
		for(int subi = (i+1); subi < count; subi++)
			if (array[i].equals(array[subi]))
		            return array[i];
		    
		
		// write a pair of nested loops that compare every stinrg to every other string
		// as soon as you fond two that are .equals to each other, immediately return that string

		return "NO DUPE FOUND IN ARRAY"; // LEAVE THIS HERE
	}

} // END CLASS PROJECT#2