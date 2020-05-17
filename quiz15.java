//last date of submission 18/05/2020:
//p is prime number .

class algomania 
{  
static int subalgo1(int x, int y, int p) 
{ 
	int res = 1; 
	x = x % p;
	while (y > 0) 
	{ 
		if ((y & 1) > 0) 
			res = (res * x) % p; 

		y = y >> 1; 
		x = (x * x) % p; 
	} 
	return res; 
} 
 
static int subalgo2(int a, int p) 
{ 
	return subalgo1(a, p - 2, p); 
} 
 
static int algo(int n, int p) 
{  
	if (p <= n) 
	    return 0; 

	int res = (p - 1);  
	for (int i = n + 1; i < p; i++) 
		res = (res * subalgo2(i, p)) % p; 
	return res; 
} 
 
public static void main(String[] args) 
{ 
	int n = 5, p = 13; 
	System.out.println(algo(n, p)); 
} 
} 

