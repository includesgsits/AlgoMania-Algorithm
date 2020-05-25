
public class Algo
{   
    static void subalgo(char arr[])
    {
        int l=arr.length;
        char b[]=new char[l];
        int x[]=new int[256];
        
        for(int i=0;i<256;i++)
        {
            x[i]=0;
        }
        
        for(int i=0;i<l;i++)
        {
           x[arr[i]]++; 
        }
        int s=0;
        for(int i=0;i<256;i++)
        {
            s+=x[i];
            x[i]=s;
        }
        for(int i=l-1;i>=0;i--)
        {
           b[x[arr[i]-1]]=arr[i];
           x[arr[i]]--;
        }
        for(int i=0;i<l;i++)
        {
            arr[i]=b[i];
        }
    }
	public static void main(String[] args)
	{
    	 char arr[]={'a','b','e','g','c'};
    	 subalgo(arr);
    	 for(int i=0;i<arr.length;i++)
    	 {
    	     System.out.print(arr[i]);
    	 }
	
	}
	
}
