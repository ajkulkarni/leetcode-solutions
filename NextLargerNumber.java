/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nextlargernumber;

/**
 *
 * @author Ajay
 */
public class NextLargerNumber {

    /**
     * @param args the command line arguments
     */
    
    static String str = "534976";
    static int result = 999999999;
    
    public static void main(String[] args) {
        // TODO code application logic here
        largerNumber(str,"",0);
        System.out.println(result);
    }
    
    public static void largerNumber(String s, String combo, int pos)
    {
        if(combo.length() == str.length())
        {
            if(Integer.parseInt(combo) > Integer.parseInt(str) && Integer.parseInt(combo) < result)
                result = Integer.parseInt(combo);
            return;
        }
        
        for(int i = 0; i < s.length(); i++)
        {
            String new_combo = combo+s.substring(i, i+1);
            String new_s = s.substring(0, i) + s.substring(i+1, s.length());
            largerNumber(new_s,new_combo,i);
        }
    }
}
