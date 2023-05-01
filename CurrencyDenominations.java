package com.greatlearning.denominations;

import java.util.Scanner;

import com.greatlearning.mergesort.MergeSort;

public class CurrencyDenominations {
	 MergeSort msort=new MergeSort();
	    
	    void paymentDriver(int notes[],int amount)
	    {

	    	int counter[]=new int[notes.length];
	    	
	    	try {
	    		for(int i=0;i<notes.length;i++)
	    		{
	    			if(amount>=notes[i])
	    			{
	    				counter[i]=amount/notes[i];
	    				amount=(amount-notes[i]*counter[i]);
	    				
	    			}
	    			
	    		}
	    		if(amount>0)
 			{
 				 System.out.println("Payment Not Possible");
 			}
	    		else {
	    			
	    			 System.out.println("Your payment approach in order to give min no of notes will be\n");
	    			for(int i=0;i<counter.length;i++)
	    			{
	    				if(counter[i]!=0)
	    				{
	    			        System.out.println(notes[i]+" : "+counter[i]);
	    				}
	    			}
	    		}
	    		   		
	    	}catch(ArithmeticException e)
	    	{
	    		 System.out.println("Notes are invalid");
	    	}
	    	
	    }
	    
	   public  void travelorsPayment()
	    {
	    	
	    	
	    	Scanner sc = new Scanner(System.in);
	    	int d_size;
	    	System.out.print("enter the size of currency denominations :\n");
	    	d_size=sc.nextInt();
	    	
	    	int notes[]=new int[d_size];
	    	
	    	System.out.print("enter the currency denominations value :\n");
	    	
	    	for(int i=0;i<d_size;i++)
	    	{
	    		notes[i]=sc.nextInt();
	    	}
	    	System.out.print("enter the amount you want to pay :\n");
	    	int amount;
	    	amount=sc.nextInt();
	    	
	    	msort.mergeSort(notes,0,d_size-1);
	    	paymentDriver( notes,amount);
	    	   	
	    	
	    }
}
