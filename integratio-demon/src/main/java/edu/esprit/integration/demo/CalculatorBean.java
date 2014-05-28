package edu.esprit.integration.demo;

/**
 * Hello world!
 *
 */
public class CalculatorBean 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    
    public int  addition(int a ,int b) {
		int result = 0;
		result= a+b;
		return result;    	
		
	}
    public int  soustraction(int a ,int b) {
		int result = 0;
		result= a-b;
		return result;    	
		
	}
    public int  multiplication(int a ,int b) {
		int result = 0;
		result= a*b;
		return result;    	
		
	}
    public int  division(int a ,int b) {
		int result = 0;
		result= a/b;
		return result;    	
		
	}
}

