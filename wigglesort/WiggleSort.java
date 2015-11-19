/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wigglesort;
import java.util.Arrays;
/**
 *
 * @author Ajay
 */
public class WiggleSort {

    private int[] ar;
    /**
     * @param args the command line arguments
     */
    public void callWiggle(int[] a, boolean type) {
        // TODO code application logic here
        ar = a;
        wiggle(type);
        
    }
    
    private void wiggle(boolean type)
    {
        if(ar == null || ar.length ==0)
        {
            return;
        }
        int i = 0, temp;
        
        while (i < ar.length-1)
        {
            if ((type && ar[i] < ar[i+1] )  || (!type && ar[i] > ar[i+1] ))
            {
                temp = ar[i];
                ar[i] = ar[i+1];
                ar[i+1] = temp;
            }
            
           i = i + 1;
           type = !type;
        }
        
        System.out.println(Arrays.toString(ar));
    }
    
    
}
