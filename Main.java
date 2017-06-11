
/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	static long startTime = System.currentTimeMillis();
	public static void main(String[] args)throws java.lang.Exception
	{
			
		
		
	System.out.println(fib((long)49.0) % 2014);
	long endTime = System.currentTimeMillis();
	double z =(endTime - startTime)/1000.0;
 	
		System.out.println(z);		
	}
	
	
	public static long fib (long a ) throws java.lang.Exception
	{
	
		if (a== 0 || a==1){
		return a;
		}
		else{
		return (fib(a-1)+fib(a-2));
		}
		// your code goes here
		
	}
	


}

// n= 10 ; 1
