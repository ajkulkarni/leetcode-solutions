
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparebstarray;

/**
 *
 * @author Ajay
 */
public class CompareBSTArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[] = {1,2,3,4,5,6,7};
        int b[] = {1,3,2,5,4,7,6};
        equalBST(a,b);
    }
    
    public static void equalBST(int a[], int b[])
    {
        if(a[0] != b[0] || a.length != b.length)
        {
            System.out.println("False");
            return;
        }
        
        
    }
    
}
