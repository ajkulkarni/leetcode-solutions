/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prefixexpstack;

/**
 *
 * @author Ajay
 */
public class PrefixExpStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s = "231*+9-";
        evaluateExp(s);
        
    }
    
    public static void evaluateExp(String s)
    {
        StackStruct st = new StackStruct(10);
        for (int i = 0; i < s.length(); i++)
        {
            if(!s.substring(i, i+1).equals("+") && !s.substring(i, i+1).equals("-") && !s.substring(i, i+1).equals("*") && !s.substring(i, i+1).equals("/"))
                st.push(s.substring(i, i+1));
            
            else
            {
                int b = Integer.parseInt(st.pop());
                int a = Integer.parseInt(st.pop());
                
                if(s.substring(i, i+1).equals("+"))
                    st.push(Integer.toString(a+b));
                        
                else if(s.substring(i, i+1).equals("-"))
                    st.push(Integer.toString(a-b));
                            
                else if(s.substring(i, i+1).equals("*"))
                    st.push(Integer.toString(a*b));
                                
                else
                    st.push(Integer.toString(a/b));
                
            }
        }
        st.print();
    }
    
}

class StackStruct
{
    String[] stack;
    int top, size;
    
    
    public StackStruct(int n)
    {
        size = n;
        stack = new String[size];
        top = -1;
    }
    
    public boolean isEmpty()
    {
        return top == -1;
    }
    
    public boolean isFull()
    {
        return top == stack.length-1;
    }
       
    public void push(String data)
    {
        if(isFull())
            return;
        
            top++;
            
            stack[top] = data;
    }
    
    public String pop()
    {
        if(isEmpty())
            return null;
        
        String data = stack[top];
        top--;
        return data;
    }
    
    public void print()
    {
        if(top == -1)
            return;
        
        for (int i = 0; i <= top; i++)
            System.out.println(stack[i]);
    }
}
