/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oddnumberarray;

/**
 *
 * @author Ajay
 */
public class OddNumberArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] a = {0,0,0,1};
        printOdd(a);
        // TODO code application logic here
    }
    
    public static void printOdd(int a[])
    {
        int exor=0;
        
        for(int i = 0; i < a.length; i++)
        {
            exor = exor ^ a[i];
        }
        
        if(exor == 0)
            return;
        
        int exor1 = 0,exor2 =0;
        int check = 1;
        
        while((exor & check) <= 0)
        {
            check++;
        }
        
        for(int i = 0; i < a.length; i++)
        {
            if((check & a[i] ) == 0) 
                exor1 = exor1^a[i];
            else
                exor2 = exor2 ^ a[i];        
        }
        
        System.out.println(exor1+" "+exor2);
    }
}
