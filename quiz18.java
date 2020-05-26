import java.io.*; 
  
public class Main { 

    static int algo(int depth, int nodeIndex, boolean  isMax, 
            int scores[], int h) 
    { 
        if (depth == h) 
            return scores[nodeIndex]; 
  
        if (isMax) 
            return Math.max(algo(depth+1, nodeIndex*2, false, scores, h), 
                algo(depth+1, nodeIndex*2 + 1, false, scores, h)); 
  
        else
            return Math.min(algo(depth+1, nodeIndex*2, true, scores, h), 
                algo(depth+1, nodeIndex*2 + 1, true, scores, h)); 
    } 
  
    static int log2(int n) 
    { 
        return (n==1)? 0 : 1 + log2(n/2); 
    } 

    public static void main (String[] args) 
    { 
        int values[] = {3, 5, 2, 9, 12, 5, 23, 23}; 
        int len = values.length; 
        // l should be a power of 2
        int hei = log2(len); 
        int res = algo(0, 0, true, values, hei); 
        System.out.println( "The optimal value is : "  +res);  
          
    } 
}
