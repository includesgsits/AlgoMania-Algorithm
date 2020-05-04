/*
        NOTE:
        - import java util package to run.
        - diff should always be greater than equals 0. 
*/
	    
static ArrayList<Integer> algo(String s1,int No, String s2) 
{ 
	int temp1=0,temp2=0;
	ArrayList<Integer> aL=new ArrayList<Integer>();
	int var1 = s1.length(),var2 = s2.length(); 
	int magic = 1, MagicNo=256,iterator1=0,diff=var2-var1; 
	
	while(iterator1 < var1)
	{ 
		temp1 = (MagicNo*temp1 + s1.charAt(iterator1))%No; 
		temp2 = (MagicNo*temp2 + s2.charAt(iterator1++))%No; 
	} 
		
	for (iterator1 = 0; iterator1 < var1-1; iterator1++)magic = (magic*MagicNo)%No; 
        iterator1=0;
    
	for (iterator1 = 0; iterator1 <= diff; iterator1++) 
	{ 
		if ( temp1 == temp2 ) 
		{ 
			int iterator2=0;
			for ( iterator2 = 0; iterator2 < var1; iterator2++)
				if (s2.charAt(iterator1+iterator2) != s1.charAt(iterator2))break; 
			if (iterator2 == var1)aL.add(iterator1); 
		} 
		if ( iterator1 < diff) 
		{ 
			temp2 = (MagicNo*(temp2 - s2.charAt(iterator1)*magic) + s2.charAt(iterator1+var1))%No; 
			temp2 = temp2<0? (temp2 + No):temp2; 
		} 
	} 
	return aL;
} 
	
	
	
