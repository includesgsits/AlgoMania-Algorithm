
  //here n is size of array.
  //arr[] is sorted  
int algo(int arr[], int n, int x) 
{ 
    int i = 1; 
    if (arr[0] == x) 
        return 0; 
  
    while (i < n && arr[i] <= x) 
        i = i*2; 
  
   return subAlgo(arr, i/2, min(i, n), x); 
} 
  

int subAlgo(int arr[], int l, int r, int x) 
{ 
    if (r >= l) 
    { 
        int num = l + (r - l)/2; 
  
        if (arr[num] == x) 
            return num; 
  
        if (arr[num] > x) 
            return subAlgo(arr, l, num-1, x); 
  
    return subAlgo(arr, num+1, r, x); 
    } 
  
  return -1; 
} 

