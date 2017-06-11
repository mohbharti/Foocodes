

/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main1
{
	
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		//Scanner y = new Scanner(System.in);
		
		//long d = Long.parseLong(y.next());
		
		 long startTime = System.currentTimeMillis();
		 long h = fib1((long)90000000000.0) % 2014;
		System.out.println(h);
		long endTime = System.currentTimeMillis();
		double e = (endTime-startTime)/1000.0;
		
		System.out.println(e);
	}
	public static long fib1(long n){
		long p = 0;
		long q = 1;
	
	
		if(n==0 || n==1)
			return n;
		else
			
			for(long i =2 ; i<n ; i++){
				long t = q;
				q=q+p;  
				p=t;
		
			
		}
	return q;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          	
	}
}
