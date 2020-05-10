def algo(n) :
    ans = n
    p = 2
    while(p * p <= n) :
        if (n % p == 0) :
            while (n % p ==0) :
                n = n // p
            ans -= ans//p
        p+=1

    if n >1 :
        ans -= ans//n

    return ans
