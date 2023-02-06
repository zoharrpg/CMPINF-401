import java.util.*;
import java.io.*;

public class Lab3
{

    public static void main(String[] args) throws Exception
    {
    	BufferedReader infile = new BufferedReader (new FileReader(args[0]));

    	ArrayList<String> words = new ArrayList<String>();

    	while(infile.ready())
    	{

    		words.add(infile.readLine());
    	}
    	
    	Collections.sort(words);

    	for(String w:words)
    		System.out.println(w+" " + canonical(w));

    		
    }

    static String canonical(String word)
    {
    	char[] character = word.toCharArray();
    	Arrays.sort(character);

    	return new String(character);
    }




}