function subAlgo2(a,b,p){
    var res = 1;
    a = a%p;
    while(b>0){
        if((b%2) == 1)
            res = (res*a)%p;
        b = Math.floor(b/2);
        a = (a*a)%p;
    }
    return res;
}

function subAlgo1(a,n){
    var b = 2+Math.floor(Math.floor(Math.random() * (n-4)));
    
    var x = subAlgo2(b,a,n);

    if(x == 1 || x == n-1)   
        return true;

    while(a != n-1){
        x = (x*x)%n;
        a *= 2;

        if(x==1)
            return false;
        if (x==n-1)
            return true;
    }
    return false;
}   

function algo(n,k){
    if(n <= 1 || n == 4)
        return false;
    if(n <= 3)
        return true;
    var d = n-1;
    for(var i = 0; i<k; i++)
        if(!subAlgo1(d,n))
            return false;
    return true;
}
