/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bst;

/**
 *
 * @author Ajay
 */
public class BST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BSTImpl b = new BSTImpl();
        b.insert(10);
        b.insert(5);
        b.insert(15);
        b.insert(2);
        b.insert(7);
        b.insert(13);
        b.insert(17);
        b.insert(1);
        b.insert(4);
        b.insert(6);
        b.insert(8);
        b.insert(11);
        b.insert(14);
        b.insert(16);
        b.insert(18);
        b.insert(3);
        b.preorder(b.getRoot());
        b.delete(15);
        System.out.println("");
        b.preorder(b.getRoot());
        
    }
    
}

class Node {
    Node left, right;
    int data;
    
    public Node(int data)
    {
        left = null;
        right = null;
        this.data = data;
    }
    
    public int getData()
    {
        return data;
    }
    
    public void setData(int data)
    {
        this.data = data;
    }
    
    public Node getLeft()
    {
        return left;
    }
    
    public Node getRight()
    {
        return right;
    }
    
    public void setLeft(Node left)
    {
        this.left = left;
    }
    
    public void setRight(Node right)
    {
        this.right = right;
    }
}

class BSTImpl{
    private Node root;
    
    
    public Node getRoot()
    {
        Node temp = root;
        return temp;
    }
    
    public void insert(int data)
    {
        if(root == null)
        {
        root = new Node(data);
        return;
        }
        
        Node newNode = new Node(data);
        Node temp = root;
        Node temp1 = temp;
        
        while(temp != null)
        {
            temp1 = temp;
            
            if (newNode.getData() <= temp.getData())
            {
                temp = temp.getLeft();
            }
            
            else
            {
                temp = temp.getRight();
            }
        }
        
        if(newNode.getData() <= temp1.getData())
            temp1.setLeft(newNode);
        else
            temp1.setRight(newNode);
        
    }
    
    public void delete(int data)
    {
        Node temp = root;
        Node temp1=null;
        
        while(temp != null)
        {
            
            if(temp.getData() == data)
                break;
            
            temp1 = temp;   
            
            if (temp.getData() > data)
            {
                temp = temp.getLeft();
            }
            
            else
            {
                temp = temp.getRight();
            }
            

        }
        
        if(temp == null)
            return;
        
        if(temp.getLeft() == null && temp.getRight() == null)
        {
            System.out.println("--"+temp1.getData());
            if(data > temp1.getData())
                temp1.setRight(null);
            else
                temp1.setLeft(null);
            return;
        }
        
        if(temp.getLeft() == null)
        {
            if(temp1.getRight()==temp)
                temp1.setRight(temp.getRight());
            if(temp1.getLeft()==temp)
                temp1.setLeft(temp.getRight());
            return;
        }
        
        if(temp.getRight() == null)
        {
            if(temp1.getRight()==temp)
                temp1.setRight(temp.getLeft());
            if(temp1.getLeft()==temp)
                temp1.setLeft(temp.getLeft());
            return;
        }
        
        Node new_temp = temp.getLeft();
        Node new_temp1 = null;
        
        while(new_temp.getRight() != null)
        {
            new_temp1 = new_temp;     
            new_temp = new_temp.getRight();
        }
        
        if(new_temp.getLeft() != null)
            new_temp1.setRight(new_temp.getLeft());
        else
            new_temp1.setRight(null);
        
        new_temp.setLeft(temp.getLeft());
        new_temp.setRight(temp.getRight());
        
        if(new_temp.getData() <= temp1.getData())
            temp1.setLeft(new_temp);
        
        else
            temp1.setRight(new_temp);
    }
    
    public void preorder(Node root)
    {
        if(root == null)
            return;
        
        System.out.println(root.getData());
        
        if (root.getLeft() != null)
            preorder(root.getLeft());
        
        if (root.getRight() != null)
            preorder(root.getRight());
        
    }
}