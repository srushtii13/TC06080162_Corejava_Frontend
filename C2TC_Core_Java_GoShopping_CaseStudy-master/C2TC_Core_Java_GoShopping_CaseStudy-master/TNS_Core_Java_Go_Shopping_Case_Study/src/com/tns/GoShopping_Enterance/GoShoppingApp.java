package com.tns.GoShopping_Enterance;

import java.util.Scanner;

import com.tns.GoShopping_application.*;
import com.tns.GoShopping_framework.*;

public class GoShoppingApp {
	@SuppressWarnings("static-access")
	public static void main(String[] args) 
	
	{ //Assigning instance of GSShopFactory to ShopFactory reference.
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Name");
		String accNm=sc.next();
	
		int accNo=9623;
		
		boolean isPrime=false;
		
		System.out.println("\nEnter the type of account you want to create 1.Prime Account 2.Normal Account");
		int choice=sc.nextInt();
		
	// Instantiate GSPrimeAcc and refer it through reference PrimeAcc.
		switch(choice)
		{
		
		case 1: //Prime Acc
		             GSShopFactory gssP=new GSShopFactory();
		             gssP.getNewPrimeAccount(accNo, accNm, 1000, isPrime);
			break;
			
		case 2: //Normal Acc
			    
		     GSShopFactory gssN=new GSShopFactory();
             gssN.getNewNormalAccount(accNo, accNm,1000,50);
	     	break;
	     	
		}

		
	// Instantiate GSNormalAcc and refer it through reference NormalAcc.
		
		
	
	}
	
	}