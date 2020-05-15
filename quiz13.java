
import java.io.*; 

class algomania
{ 
	static int algo(int a, int b) 
	{ 
	 
		int res = 0; 

	
		while (b > 0) 
		{ 
			
			if ((b & 1) != 0) 
				res = res + a; 
 
			a = a << 1; 
			b = b >> 1; 
		} 
		return res; 
	} 
	

	public static void main (String[] args) 
	{ 
		System.out.println(algo(18, 1)); 
		System.out.println(algo(20, 12)); 
	} 
} 


