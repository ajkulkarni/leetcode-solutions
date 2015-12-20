/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxsubarray;

/**
 *
 * @author Ajay
 */
public class MaxSubArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[] = {2 , 9, 3, 4, 1, 6}; 
        largestSubArray(a, 0, 3);
    }
    
    public static void largestSubArray(int a[], int pos, int k)
    {
        if(pos == a.length)
            return;
        
        int max = 0;
        
        for (int i = pos; i < k; i++)
        {
            if (i == pos)
                max = a[i];
            else
            {
                if(a[i] > max)
                    max = a[i];
            }
        }
        if(max != 0)
            System.out.println(max);
        largestSubArray(a, pos+1,k);
    }
    
}


