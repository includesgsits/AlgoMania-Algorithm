
import java.util.*;
class Algo
{
    public String support(String str)
    {
        int len = str.length();
        if (len == 0) 
            return "^$";
        String s = "^";
        for (int i = 0; i < len; i++)
            s += "#" + str.charAt(i);         
        s += "#$";
        return s;
    }
    public String algo(String str)
    {
        char[] s = support(str).toCharArray();
        int n = s.length;
        int[] p = new int[n + 1];
        int id = 0, num=0;
        for (int i = 1; i < n - 1; i++) 
        {
             p[i] = num > i ? Math.min(p[2 * id - i], num - i) : 0;
             while (s[i + 1 + p[i]] == s[i - 1 - p[i]]) 
                 p[i]++;
             if (i + p[i] > num) 
             {
                 num = i + p[i];
                 id = i;
             }
        }
        int m = 0;
        int c = 0;
        for (int i = 1; i < n - 1; i++) 
        {
            if (p[i] > m) 
            {
                m = p[i];
                c = i;
            }
        }
        int v = (c - 1 - m)/2;
        return str.substring(v , v + m);        
    }
}