/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringanagram;
import java.util.*;
/**
 *
 * @author Ajay
 */
public class StringAnagram {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        String s = "abcd";
        char[] a = s.toCharArray();
        char[] b = new char[a.length];
        anagram(a,0,b);
    }
    
    public static void anagram(char[] a, int pos, char[] output)
    {
        if(pos == output.length-1)
        {
            output[pos] = a[0];
            System.out.println(Arrays.toString(output));
            return;
        }
        
        for (int i = 0; i < a.length; i++)
        {
            output[pos] = a[i];
            char[] new_a = new  char[output.length - (pos+1)];
            int k = 0;
            
            for (int j = 0; j < a.length; j++)
            {
                if(j == i)
                    continue;
                else
                    new_a[k++] = a[j];
            }
            
            anagram(new_a, pos+1, output);
        }
    
}
}
