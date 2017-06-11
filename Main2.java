
/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main2
{
	
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		long StartTime = System.currentTimeMillis();
		long l = fib2((long)9000000000000000000.0);
		long endTime = System.currentTimeMillis();
		double a = (endTime-StartTime)/1000.0;
		
		System.out.println(l % 2014);
		System.out.println(a);
	}
	public static long[][] mulm(long[][] n , long[][]m){
		
		long[][] p = new long[2][2];
		p[0][0]  = n[0][0]*m[0][0]+n[0][1]*m[1][0];
		p[0][1] = n[0][0]*m[0][1]+n[0][1]*m[1][1];
		p[1][0] = n[1][0]*m[0][0]+ n[1][1]*m[1][0];
		p[1][1] = n[1][0]*m[0][1]+n[1][1]*m[1][1];
		return p ;
	}
	public static long fib2(long g){
		long[][] d = new long[2][2];
		d[0][0] = 1;
		d[0][1] = 1;
		d[1][0] = 1;
		d[1][1] = 0;
				
//		long c = 0;
//		if (c!=g){
		return 	 power(d,g-1)[0][0];
//			c++;
//		}
//		long h = d[0][0];
		
//		return h;
		
		
	
	}
	
	static long [][] power(long[][] a, long n){
		if(n==1)
			return a;
		long [][] half = power(a,n/2);
		long [][]full = mulm(half,half);
		if(n%2==1)
			full = mulm(full, a);
		return full;
	}
}