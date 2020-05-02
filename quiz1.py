import math

def algo(m,n):

    # NOTE- m and n are always greater than equal to 9.
    # And m <= n

    rt = int(math.ceil(math.sqrt(n)))

    arr1 = [ i for i in range(rt)]
    arr1[1] = 0
    
    for i in range(2,len(arr1)):
        if arr1[i] == 0:
            continue
        else:
            j = 2*i
            while j<len(arr1):
                arr1[j] = 0
                j += i
    arr1 = [i for i in arr1 if i != 0]

    ans = []
    
    n1,n2 = m, rt+m

    while n1 < n:

        if n2 >= n:
            n2 = n
        
        arr2 =  [ (i+n1) for i in range(n2-n1+1)]
        
        for i in range(len(arr1)):
            l = n1 // arr1[i] * arr1[i]
            if l < n1:
                l += arr1[i]
            for j in range(l,n2+1, arr1[i]):
                arr2[j-n1] = 0
        ans.extend([i for i in arr2 if i != 0])
        n1 = n2 +1
        n2 += rt
        if 1 in ans:
            ans.remove(1)
    return ans 

for _ in range(int(input())):
	m,n = map(int,input().split())
	l = algo(m,n)
	for i in l:
		print(i)
	print("")
