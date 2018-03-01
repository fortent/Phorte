package com.NatashaForte.Phorte;

import java.util.Date;
import java.util.Scanner;


/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    
    {
        seeCommandlineInput(args);
        
        actionCommandlineInput(args);
        
        
    }
    
    private Scanner someInput;
    private Date today;
    
    public App()
    
    {
    		this.someInput = new Scanner(System.in);
    		
    		System.out.println("\n Soon stuff will happen here");
    		
    		System.out.println("\n press enter to exit the program");
    		
    		this.someInput.nextLine();
    		
    		System.exit(0);
    }
    
    private static void actionCommandlineInput( String args[])
    {
    		App anApp = new App();
    }
    
    private static void seeCommandlineInput( String args[])
    {
    		if (args.length == 0)
    		{
    			System.out.println("There were no commandline arguments passed!");
    		}
    		
    		else
    		{
    			for(int i=0; i < args.length; i++)
    			{
    				System.out.println(args[1]);
    				
    			}
 
    		}
    }
}
