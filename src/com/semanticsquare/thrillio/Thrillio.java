package com.semanticsquare.thrillio;

import java.io.IOException;
import java.util.Scanner;

public class Thrillio {
	
	public static void main(String[] args) throws IOException {
		// thrill.io
		Scanner scanner = View.getIOScanner();
		System.out.println("\nWELCOME TO THRILL...IO\n");
		System.out.println("SIGN UP or LOGIN HERE: \n 1. Sign Up \n 2. Log In\n");
		System.out.print("Enter choice here>>> ");
		int userNavigationOption = scanner.nextInt(); 
		if(userNavigationOption == 1) {
		    /* Sign up */
		    View.getInstanceView().signUp();
		}else {
			/* Log in: will take user to Home page directly */
			 View.getInstanceView().logIn();
		}
	}
}
