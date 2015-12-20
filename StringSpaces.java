/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringspaces;
import java.util.*;
/**
 *
 * @author Ajay
 */
public class StringSpaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s = " adsd sdfs edfwefe wefef";
        trimString(s);
    }
    
    public static void trimString(String s)
    {
        s = s.trim();
        for(int i = 0; i < s.length(); i++)
        {
            if(s.substring(i,i+1).equals(" "))
                s = s.substring(0,i)+s.substring(i+1,s.length());
        }
        
        System.out.println(s);
    }
    
}
