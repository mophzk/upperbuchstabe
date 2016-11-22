package de.moritz.upperbuchstabe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("String eingeben: ");
    	System.out.println(read().toUpperCase());
        
    }
    
    
    
	public static String read() {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String readname = "leer";
		try {
			readname = reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
	return readname;
		
	}
    
    
    
    
    
    
    
    
    
}
