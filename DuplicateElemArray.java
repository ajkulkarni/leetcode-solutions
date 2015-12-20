/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duplicateelemarray;

/**
 *
 * @author Ajay
 */
public class DuplicateElemArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] a={3,4,3,2}; //
        printElements(a);
    }
    
    public static void printElements(int a[])
    {
       
       int n=a.length;
     
       for(int i = 0; i < a.length; i++)
       {
           if(a[i] % n ==0)
            a[n-1] += n; 
           else
            a[(a[i]%n)-1] += n;
       }
       
       for(int i = 0; i < a.length; i++)
       {
           if(a[i]%n == 0)
            System.out.println((i+1)+" "+ (a[i]-1)/n);
           else
            System.out.println((i+1)+" "+ a[i]/n);
       }
        
    }
    
}
