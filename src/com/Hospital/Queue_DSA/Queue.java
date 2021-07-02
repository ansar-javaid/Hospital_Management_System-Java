package com.Hospital.Queue_DSA;

import com.Hospital.LinkedList_DSA.LinkedList;
import java.util.NoSuchElementException;

/**
 * Queue: First In First Out -FIFO .
 * Here we can use any kind of patientData type ie. Students, String , Integer.
 * you just have to provide Datatype in <> like Queue< Students> or Node< String>
 * @param <DataType>
 */
public class Queue<DataType>{
    private LinkedList<DataType> queueList=new LinkedList<>();
    private int sizeOfQueue=0;
    //Constructor-------------------------------------------------------------------------------------------------------
    public Queue() {
    }
    //TODO: Queue Methods using Singly Linked List----------------------------------------------------------------------
    /**
     * @return  true if the Queue is empty, and returns false if the stack contains elements.
     */
    public int Size()
    {
        return sizeOfQueue;
    }
    //------------------------------------------------------------------------------------------------------------------
    /**
     * @param data  Inserts the specified element into the queue.
     */
    public void enqueue(DataType data)
    {
        sizeOfQueue++;
        queueList.add(data);
    }
    //------------------------------------------------------------------------------------------------------------------
    /**
     * @return head of Queue.
     * Removes the head of the queue and returns it. Throws NoSuchElementException if queue is empty.
     */
    public DataType dequeue()
    {
        if(queueList.isEmpty())
            throw new NoSuchElementException();
        else
        {
            sizeOfQueue--;
            DataType data=queueList.getFirst();
            queueList.removeFirst();
            return data;
        }
    }
    //------------------------------------------------------------------------------------------------------------------
    /**
     * @return Returns the head of the queue without removing it. Throws NoSuchElementException if the queue is empty.
     */
    public DataType front()
    {
        if(queueList.isEmpty())
            throw new NoSuchElementException();
        else
            return queueList.getFirst();
    }
    //------------------------------------------------------------------------------------------------------------------
    /**
     * @param listData Accepts LinkedList
     *                 It is used to append all of the elements in the specified collection to
     *                 the end of a list. e.g pass and array and it will copy all the elements
     *                 from input array.
     * @return true or false : true if List is added
     */
    public boolean addAll(LinkedList<? extends DataType> listData)
    {
        if(listData==null)
            return false;
        for(int count=0;count<listData.size();count++)
        {
            enqueue(listData.get(count));
        }
        return false;
    }
    //------------------------------------------------------------------------------------------------------------------
    /**
     * @return  true if the stack is empty, and returns false if the stack contains elements.
     */
    public boolean empty()
    {
        return (queueList.isEmpty());
    }
    //------------------------------------------------------------------------------------------------------------------
    /**
     * @return Returns the tail of the queue without removing it. Throws NoSuchElementException if the queue is empty.
     */
    public DataType rare()
    {
        if(queueList.isEmpty())
            throw new NoSuchElementException();
        else
            return queueList.getLast();
    }
    //=================================================================================================================

}
