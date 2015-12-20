/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverse;

/**
 *
 * @author Ajay
 */
public class Reverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s = "Ajay";
        reverse(s);
        // TODO code application logic here
    }
    
    public static void reverse(String s)
    {
        String sp="";
        
        for (int i = s.length(); i > 0; i--)
        {
            sp = sp + s.substring(i-1, i);
        }
        
        System.out.println(sp);
    }
}
