/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package islandproblem;

/**
 *
 * @author Ajay
 */
public class IslandProblem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] a = {
            {1,0,0,0,0},
            {0,0,0,1,0},
            {0,0,0,0,0},
            {0,1,0,1,0}
        };
        
        locateIsland(a,4,5);
    }
    
    public static void locateIsland(int[][] a, int row, int col)
    {
        
        for(int i = 0; i <= row-1; i++)
        {
            for(int j = 0; j <= col-1; j++)
            {
                if(a[i][j] != 1)
                    continue;
                
                int count = 0;
                
                if((i == 0 && j == 0) || (i == row-1 && j == col-1))
                    count = 5;
                
                else if(i == 0 || i == row-1 || j == 0 || j == col-1)
                    count = 3;
                
                for(int k = i-1; k <= i+1; k++)
                {
                    if(k == -1 || k == row)
                        continue;
                    
                    for(int l = j-1; l <= j+1; l++)
                    {
                        if(l == -1 || l == col)
                            continue;
                        
                        if(a[k][l] == 0)
                            count++;
                    }
                }
                
                if(count == 8)
                    System.out.println(i+","+j);
            }
        }
    }
    
}
