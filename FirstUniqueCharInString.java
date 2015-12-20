/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstuniquecharinstring;
import java.util.*;
/**
 *
 * @author Ajay
 */
public class FirstUniqueCharInString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s = "aeraergaerkaer";
        getUnique(s);
    }
    
    public static void getUnique(String s)
    {
        Map<String, Integer> m = new HashMap<String, Integer>();
        
        for (int i = 0; i < s.length(); i++)
        {
            if(!m.containsKey(s.substring(i, i+1)))
                m.put(s.substring(i, i+1), 1);
            else
                m.put(s.substring(i, i+1), -1);
        }
        
        for (Map.Entry<String, Integer> entry : m.entrySet())
        {
            if(entry.getValue() == 1)
            {
            System.out.println("character = " + entry.getKey());
            break;
            }
        }
    }
    
}
