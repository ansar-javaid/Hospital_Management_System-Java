package com.Hospital.Stack_DSA;

import com.Hospital.LinkedList_DSA.LinkedList;

/**
 * Stack First In Last Out -FILO .
 * Here we can use any kind of patientData type ie. Students, String , Integer.
 * you just have to provide Datatype in <> like Stack< Students> or Node< String>
 * @param <DataType>
 */
public class Stack<DataType> {
    private LinkedList<DataType> stackList=new LinkedList<>();
    private DataType data;
    private int sizeOFStack=0;
    //Constructor-------------------------------------------------------------------------------------------------------
    public Stack() { }
    //TODO: Stack Methods using Singly Linked List----------------------------------------------------------------------
    /**
     * @param data Pushes the element onto the stack.
     */
    public void push(DataType data)
    {
        stackList.add(data);
    }
    //------------------------------------------------------------------------------------------------------------------
    /**
     *
     * @return Object
     * Returns the element on the top of the stack, removing it in the process.
     */
    public DataType pop()
    {
        if(stackList.isEmpty())
        {
            System.out.println("Stack Underflow");
            return null;
        }
        else
        {
            DataType LastPopped=stackList.get(stackList.size()-1);
            stackList.remove(stackList.size()-1);
            return LastPopped;
        }
    }
    //------------------------------------------------------------------------------------------------------------------
    /**
     * @param listData Accepts List
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
            push(listData.get(count));
        }
        return false;
    }
    //------------------------------------------------------------------------------------------------------------------
    /**
     * @return the size of Stack or elements that  are present in Stack.
     */
    public int Size()
    {
        return stackList.size();
    }
    //------------------------------------------------------------------------------------------------------------------
    /**
     * @return  true if the stack is empty, and returns false if the stack contains elements.
     */
    public boolean empty()
    {
        return (stackList.isEmpty());
    }
    //------------------------------------------------------------------------------------------------------------------
    /**
     * @return Returns the element on the top of the stack, but does not remove it.
     */
    public DataType peek()
    {
        return stackList.getLast();
    }
    //==================================================================================================================
}
