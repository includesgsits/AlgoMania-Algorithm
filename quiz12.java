    /*
        NOTE :
            Deadline: 14:00, 15th May 2020.
            - no3 should always be greater than equals 0 and less than equals no2.
            - no1 should always be greater than 0.
    
    */
    
    static int algo(int no1,int no2, int no3) 
    { 
        return no3==0?1:(algo(no1,no2/no1, no3/no1)*subAlgo(no1,no2%no1, no3%no1)) % no1; 
    } 
    
    static int subAlgo( int no1,int no2, int no3) 
    { 
    	int[] array=new int[no3+1]; 
        int iterator1=1;array[0] = 1;
    	while(iterator1++<= no2) 
    	{   
    	    int iterator2=iterator1<no3?iterator1:no3;
    	    while( iterator2> 0)
    	        array[iterator2] = (array[iterator2] + array[iterator2---1])%no1; 
    	} 
    	return array[no3]; 
    } 
    

    