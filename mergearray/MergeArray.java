/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergearray;
import java.util.Arrays;
/**
 *
 * @author Ajay
 */
public class MergeArray {

    /**
     * @param args the command line arguments
     */
    
    private int[] arr;
    private int[] temp;
    
    public void callSort(int[] a) {
        // TODO code application logic here
        arr = a;
        int arr_length = arr.length;
        temp = new int[arr_length];
        sort(0,arr_length-1);
        System.out.println(Arrays.toString(arr));
        
    }
    
    private void sort(int low, int high)
    {
        if(high > low)
        {
        int mid = low + (high - low)/2;
        sort(low, mid);
        sort(mid+1,high);
        merge(low, mid, high);
        }
    }
    
    private void merge(int low,int mid, int high)
    {
        for (int c = low; c <= high; c++)
            temp[c] = arr[c];
        
        int i = low;
        int j = mid + 1;
        int k = low;
        
        while (i <= mid && j <= high)
        {
            if(temp[i] <= temp[j])
                arr[k++] = temp[i++];
            else
                arr[k++] = temp[j++];
        }
        
        while(i <= mid)
            arr[k++] = temp[i++];
    }
}
