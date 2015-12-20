/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordsphonedigits;
import java.util.*;
/**
 *
 * @author Ajay
 */
public class WordsPhoneDigits {

    /**
     * @param args the command line arguments
     */
    
    final static char map[][]= {
        {'0'},
        {'1'},
        {'a','b','c'},
        {'d','e','f'},
        {'g','h','i'},
        {'j','k','l'},
        {'m','n','o'},
        {'p','q','r'},
        {'s','t','u','v'},
        {'w','x','y','z'},
        };
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        int a[]={2,3,4};
        
        
        char op[] = new char[a.length];
        printWords(a,0,op);
    }
    
    public static void printWords(int a[], int pos, char output[])
    {
        if(pos == a.length)
        {
            System.out.println(Arrays.toString(output));
            return;
        }
        
        for(int i = 0; i < map[a[pos]].length; i++)
        {
            output[pos] = map[a[pos]][i];
            printWords(a,pos+1,output);
            
        }
    }
    
}
