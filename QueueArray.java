/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuearray;

/**
 *
 * @author Ajay
 */
public class QueueArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        QueueStruct q = new QueueStruct(5);
        q.delete();
        q.print();
        q.insert(1);
        q.delete();
        q.delete();
        q.print();
        q.insert(2);
        q.insert(3); 
        q.insert(4);
        q.insert(5);
        q.insert(6);
        q.insert(7);
        q.print();
        
    }
    
}

class QueueStruct{
    
    int queue[];
    int front;
    int rear;
    int length;
    int size;
    
    public QueueStruct(int n){
        size = n;
        queue = new int[size];
        front = -1;
        rear = -1;
        length = 0;
        
    }
    
    public boolean isEmpty()
    {
        return rear == -1;
    }
    
    public boolean isFull()
    {
        return front == 0 && rear == size-1;
    }
    
    public int getSize()
    {
        return length;
    }
    
    public void insert(int data)
    {
        if(rear == size -1)
            return;
        
        if(isEmpty())
        {
            front++;
            rear++;
        }
        else
            rear++;
        queue[rear] = data;
        
    }
    
    public void delete()
    {
        if(front == rear)
        {
            front = -1;
            rear = -1;
            return;
        }
        
        front++;
    }
    
    public void print()
    {
        if(rear == -1)
            return;
        
        for(int i = front; i <= rear; i++)
            System.out.println(queue[i]);
    }
}
