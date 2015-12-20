/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberpairs;
import java.util.*;
/**
 *
 * @author Ajay
 */
public class NumberPairs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        int[] a = {4,10,3,7,2,11,17,14,1,13,12,6,8,7,0,14};
        printPairs(a);
    }
    
    public static void printPairs(int a[]) 
    {
        Map <Integer,Integer> m = new HashMap<Integer,Integer>();
        for(int i=0; i<a.length; i++)
        {
            if(a[i] == 7 && m.containsKey(a[i]))
                m.put(7, -1);
                
            else if(a[i]>14)
                //m.put(a[i], a[i]-14);
                continue;
            else
                m.put(a[i], 14-a[i]);
        }
        
        int i = 0;
       
            
        while(i < a.length)
        {
            if(a[i]==7 && m.get(a[i]) != null && m.get(a[i]) != -1)
            {
                //System.out.println("Pair ("+a[i]+","+a[i]+")");
                m.remove(7);
                //System.out.println("removed ");
                i++;
            }
            
            else if(a[i]==7 && m.get(a[i]) != null && m.get(a[i]) == -1)
            {
                System.out.println("Pair ("+a[i]+","+a[i]+")");
                m.remove(7);
                i++;
            }
           
            
            else if(m.containsKey(m.get(a[i])))
            {    
                System.out.println("Pair ("+a[i]+","+m.get(a[i])+")");
                m.remove(14-a[i]);
                i++;
            }
            
            else
                i++;
      
        }

    }
    
}

