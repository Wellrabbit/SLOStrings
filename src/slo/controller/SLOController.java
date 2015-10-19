package slo.controller;
import java.util.Scanner;

public class SLOController {
	private String userString;
	private Scanner myScanner;
	boolean KickBack;
	
	
	
	void start()
	{
		myScanner = new Scanner(System.in);
		
		
		System.out.println("Type one word that you like");
		userString = myScanner.nextLine();
		
		if(userString.length() > 10)
		{
			System.out.println("wow you picked a big word");
			
		}
		else
		{
			System.out.println("words a little shabby dont you thing maybe you can do a little better than " + userString);
			KickBack = true;
		}
	KickbackMethod();
	
	}
		
	private void KickbackMethod()
	{
		
	if (KickBack = true )
	{
		start();
	}
	else
	{
		System.out.println("you are very educated indeed");
	}
	
	}
}
	
	



	
