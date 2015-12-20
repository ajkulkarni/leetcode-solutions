/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circularqueuearray;

/**
 *
 * @author Ajay
 */
public class CircularQueueArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CircularQueueStruct q = new CircularQueueStruct(5);
        q.dequeue();
        System.out.println("Print No. 1");
        q.print();
        q.enqueue(1);
        System.out.println("Print No. 2");
        q.print();
        q.dequeue();
        //q.print();
        q.dequeue();
        System.out.println("Print No. 3");
        q.print();
        q.enqueue(2);
        q.enqueue(3); 
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(7);
        q.dequeue();
        q.dequeue();
        q.enqueue(7);
        System.out.println("Print No. 4");
        q.print();
        
    }
    
}

class CircularQueueStruct {
    Object queue[];
    int front;
    int rear;
    int length;
    int size;
    
    public CircularQueueStruct(int n){
        size = n;
        queue = new Object[size];
        front = -1;
        rear = -1;
        length = 0;
        
    }
    
    public boolean isEmpty()
    {
        return front == -1;
    }
    
    public boolean isFull()
    {
        return front-rear == 1 || rear-front == size -1;
    }
    
    public void enqueue(int data)
    {
        if(isFull())
            return;
        
        if(front == -1)
            front++;
        
        rear = (rear + 1) % size;
        queue[rear] = data;
    }
    
    public void dequeue()
    {
        if(isEmpty())
            return;
        
        if(front == rear)
        {
            queue[front] = null;
            front = -1;
            rear = -1;
            return;
        }
        
        queue[front] = null;
        front = (front + 1) % size;
    }
    
    public void print()
    {
        if(rear == -1)
            return;
        
        for(int i = 0; i < size; i++)
            System.out.println(queue[i]);
    }
    
}
