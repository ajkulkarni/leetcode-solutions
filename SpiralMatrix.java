/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spiralmatrix;

/**
 *
 * @author Ajay
 */
public class SpiralMatrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int m = 4, n = 6;
        int a[][] = {{1, 2, 3, 4, 5, 6},
        {7, 8, 9, 10, 11, 12},
        {7, 8, 9, 10, 11, 12},
        {13, 14, 15, 16, 17, 18}
        };

        printSpiral(a, m, n);

    }

    public static void printSpiral(int a[][], int m, int n) {
        int stop_m = 0;
        int stop_n = 0;

        while (a[stop_m][stop_n] != -1){
            
            int row = stop_m;
            int col;

            for (col = stop_n; col < n; col++) {

                if (a[row][col] != -1) {
                    System.out.println(a[row][col]);
                }
                a[row][col] = -1;
            }
            col--;
            for (row = stop_m + 1; row < m; row++) {

                if (a[row][col] != -1) {
                    System.out.println(a[row][col]);
                }
                a[row][col] = -1;
            }
            row--;

            for (col = col - 1; col >= 0; col--) {

                if (a[row][col] != -1) {
                    System.out.println(a[row][col]);
                }
                a[row][col] = -1;
            }

            col++;

            for (row = row - 1; row > 0; row--) {

                if (a[row][col] != -1) {
                    System.out.println(a[row][col]);
                }
                a[row][col] = -1;
            }

            stop_m += 1;
            stop_n += 1;
            m -= 1;
            n -= 1;
        }
    }
}
