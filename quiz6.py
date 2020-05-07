"""
last date of submission:8/5/20 before 2pm;
Assumption: Numbers in a[] are pairwise coprime
and len(a)=len(r);
make sure that r[i] <=a[i]-1
"""
def subalgo(a, m) :
	a = a % m;
	for x in range(1, m) :
		if ((a * x) % m == 1) :
			return x
	return 1

def algo(a,r):
    p = 1
    for i in range(len(a)):
        p = p * a[i]

    num = 0
    for i in range(len(a)):
        j = p // a[i]
        num = num + r[i] * subalgo(j, a[i]) * j

    return num % p




