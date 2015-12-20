/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findelemmatrix;
import java.util.*;
/**
 *
 * @author Ajay
 */
public class FindElemMatrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int row = 4, col = 6;
        int a[][] = {{1, 2, 3, 4, 5, 6},
        {7, 8, 9, 10, 3, 12},
        {3, 8, 9, 10, 11, 12},
        {13, 14, 15, 16, 17, 3}
        };
        
        findCommon(a,row,col);
    }
    
    public static void findCommon(int a[][], int row, int col)
    {
        if(row == 1)
            return;
        
        Map<Integer,Integer> m = new HashMap<Integer,Integer>();
        
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                
                if(!m.containsKey(a[i][j]))
                {
                
                    m.put(a[i][j], 1);
                    continue;
                }
                
                int k = m.get(a[i][j])+1;
                
                if(k >= row && i == row-1)
                {
                    System.out.println(a[i][j]);
                    return;
                }
                
                m.put(a[i][j], k);
            }
        }
    }
    
}
