package fr.sabri.test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try {
		    System.out.println(" =>" + (1/0));
		  } catch (ArithmeticException e) {
			  System.out.println("dsfq");
		    //e.printStackTrace();
		    System.out.println("sdmljsq");
		  }
		  finally{
		   // System.out.println("action faite systématiquement");
		  }
	
	}	
}
