/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lrviewbst;

/**
 *
 * @author Ajay
 */
public class LRViewBST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BST b = new BST();
        b.addNode(10);
        b.addNode(5);
        b.addNode(15);
        b.addNode(2);
        b.addNode(7);
        b.addNode(12);
        b.addNode(17);
        //b.printNodes(b.getRoot());
        b.printLeft(b.getRoot(), 0);
        b.printRight(b.getRoot(), 1);
    }
    
}

class Node
{
    Node left = null;
    Node right = null;
    int data;
    
    public Node(int data)
    {
        this.data = data;
    }
    
    public void setData(int data)
    {
        this.data = data;
    }
    
    public int getData()
    {
        return this.data;
    }
    
    public Node getLeft()
    {
        return this.left;
    }
    
    public Node getRight()
    {
        return this.right;
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

class BST
{
    Node root = null;
    
    public void addNode(int data)
    {
        if(root == null)
        {
            root = new Node(data);
            return;
        }
        
        Node temp = null;
        Node traverse = root;
        
        while(traverse != null)
        {
            temp = traverse;
            
            if(data > traverse.getData())
            {
                traverse = traverse.getRight();
            }
            
            else
                traverse = traverse.getLeft();
        }
        
        traverse = new Node(data);
        
        if (data > temp.getData())
            temp.setRight(traverse);
        else
            temp.setLeft(traverse);
    }
    
    public Node getRoot()
    {
        return this.root;
    }
    
    public void printNodes(Node root)
    {
        if(root == null)
            return;
        
        System.out.println(root.getData());
        printNodes(root.getLeft());
        printNodes(root.getRight());
    }
    
    public void printLeft(Node root, int flag)
    {
        if(root == null)
            return;
        if(flag == 0)
            System.out.println(root.getData());
        printLeft(root.getLeft(),0);
        printLeft(root.getRight(),1);
    }
    
    public void printRight(Node root, int flag)
    {
        if(root == null)
            return;
        if(flag == 1)
            System.out.println(root.getData());
        printRight(root.getLeft(),0);
        printRight(root.getRight(),1);
    }
}