/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistimpl;

/**
 *
 * @author Ajay
 */
public class LinkedListImpl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedListOp l = new LinkedListOp();
        l.addNode(5);
        l.addNode(15);
        l.addNode(25);
        l.printNodes();
        l.addNode(35,1);
        l.printNodes();
        l.delete(5);
        l.printNodes();
        l.printRev(l.getHead());
    }
    
}



class Node {
    
    Node next;
    int data;
    
    public Node(int data) 
    {
        next = null;
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
    
    public Node getNext()
    {
        return next;
    }
    
    public void setNext(Node next)
    {
        this.next = next;
    }
}



class LinkedListOp {
    
    private Node head;
    private static int nodeCount = 0;
    
    public Node getHead()
    {
        Node temp = head;
        return temp;
    }
    
    public void addNode(int data)
    {
        nodeCount++;
        
        if(head == null)
        {
            head = new Node(data);
            return;
        }
        
        Node newNode = new Node(data);
        Node tempNode = head;
        
        //goto last node
        while(tempNode.getNext() != null)
        {
            tempNode = tempNode.getNext();
        }
        //append node at the end
        tempNode.setNext(newNode);
        
    }
    
    public void addNode(int data, int index)
    {
        //check if index is out of bounds
        if(index > nodeCount)
            return;
        
       
        if(head == null)
        {
            //if head is null and index is 0
            if( index == 0 )
            {
                head = new Node(data);
                nodeCount++;
            }
            return;
        }
        
        nodeCount++;
        Node newNode = new Node(data);
        Node tempNode = head;
        
        //add node before head
        if(index == 0)
        {
            newNode.setNext(head);
            head = newNode;
            return;
        }
        
        //go till the node-1 before index
        for(int i = 0; i < index-1; i++)
        {
            tempNode = tempNode.getNext();
        }
        
        //if index is after last node
        if(tempNode.getNext() == null)
        {
            tempNode.setNext(newNode);
        }
        
        //index between two nodes
        else
        {
            newNode.setNext(tempNode.getNext());
            tempNode.setNext(newNode);
        }
    }
    
    
    public void delete()
    {
        
        if(head == null)
            return;
        
        Node tempNode = head;
        
        while(tempNode.getNext().getNext() != null)
        {
            tempNode = tempNode.getNext();
        }
        
        tempNode.setNext(null);
        nodeCount--;
        
    }
    
    public void delete(int index)
    {
        
        if(index > nodeCount-1 || head == null)
            return;
        
        Node tempNode = head;
        nodeCount--;
        
        if(index == 0)
        {
            head = head.getNext();
            return;
        }
        
        //go till node before node to be deleted
        for(int i = 0; i < index-1; i++)
        {
            tempNode = tempNode.getNext();
        }
        
        //if index is last node
        if(tempNode.getNext().getNext() == null)
        {
            tempNode.setNext(null);
        }
        
        //index between two nodes
        else
        {
            tempNode.setNext(tempNode.getNext().getNext());
        }
        
    }
    
    public void printNodes()
    {
        if(head == null)
        {
            System.out.println("No nodes to print");
            return;
        }
        
        Node tempNode = head;
        
        while(tempNode.getNext() != null)
        {
            System.out.println(tempNode.getData());
            tempNode = tempNode.getNext();
        }
        
        System.out.println(tempNode.getData());
        System.out.println();
    }
    
    public void printRev(Node temp)
    { 
        if(temp.getNext() != null)
        {
            printRev(temp.getNext());        
        }
        
        System.out.println(temp.getData());
    }
}