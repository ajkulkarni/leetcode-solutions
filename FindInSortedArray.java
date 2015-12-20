/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findinsortedarray;

/**
 *
 * @author Ajay
 */
public class FindInSortedArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] a = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        
        findElement(a,4,4,11);
    }
    
    public static void findElement(int[][] a, int row, int col, int find)
    {
        int i =0, j = 0;
        
        while(i < row && a[i][j] <= find)
        {
            i++;
        }
        
        i--;
        
        while(j < col)
        {
            if(a[i][j] == find)
                System.out.println(a[i][j]+" is a position "+i+","+j);
            j++;
        }
    }
}
