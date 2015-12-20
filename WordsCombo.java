/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordscombo;

/**
 *
 * @author Ajay
 */
public class WordsCombo {

    /**
     * @param args the command line arguments
     */
    
    public static final String[] dict = {
            "ajay",
            "omkar",
            "pranav",
            "shashank"
        };
    
    public static void main(String[] args) {
        // TODO code application logic here  
        String find = "shashankajay";
        String s = "";
        permute(find, 0, s);
    }
    
    public static void permute(String find, int pos, String s)
    {
        if(pos >= find.length()-1)
        {
            if(find.equals(s))
                System.out.println(s);
            return;
        }
        
       for (int i = 0; i < dict.length; i++) 
       {
           
           if( pos+dict[i].length() <= find.length() &&  dict[i].equals(find.substring(pos, pos+dict[i].length())))
           {
               s = s + dict[i];
               pos = s.length();
               permute(find, pos, s);
           }
           
       }
    }
    
}
 