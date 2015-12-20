/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magicnumber;

/**
 *
 * @author Ajay
 */
public class MagicNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        getMagicNo(10000);
    }
    
    public static void getMagicNo(int num)
    {
        int digits = 0;
        
        while(num != 0)
        {
            num = num / 10;
            digits++;
        }
        
        double magic = 0.0;
        
        for(int i = 1; i <= digits; i++)
        {
            magic = magic + (Math.pow(5, i));
        }
        
        num = (int) magic;
        
        System.out.println(num);
    }
}
