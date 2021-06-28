package com.Hospital.LinkedList_DSA;

import java.util.List;

/**
 * Here we can use any kind of data type ie. Students, String , float.
 * you just have to provide Datatype in <> like SinglyList< Students> or SinglyList< String>
 * @param <DataType>
 */
public class LinkedList<DataType> {
    private Node headNode, tailNode;
    private int sizeOfList=0;
    //Constructor-------------------------------------------------------------------------------------------------------
    public LinkedList() {
        this.headNode = this.tailNode = null; //TODO: keeping both head and tail null for creating very first node
    }
    //==================================================================================================================
    //TODO: Singly Linked Lists methods---------------------------------------------------------------------------------
    /**
     * @param data It adds an element of Specific Object type at the end of Linked List
     */
    public void add(DataType data)
    {
        sizeOfList++;
        Node<DataType> currentNode=new Node<>(data);
        if(headNode==null)
        {
            headNode=tailNode=currentNode;
        }
        else
        {
            tailNode.setNextLink(currentNode);
            tailNode=currentNode;
        }
    }
    //------------------------------------------------------------------------------------------------------------------
    /**
     * @param Index Provide index from 0-to-Size();.
     *              It returns the element present in the mentioned position in the linked list.
     *              If the index mentioned in the argument is more than the size of linked list,
     *              then it returns false.
     * @return  true or false
     */
    public DataType get(int Index)
    {
        int indexCounter=0;
        Node currentNode=headNode;
        while(currentNode!=null)
        {
            if(Index==indexCounter)
            {
                return ((DataType) currentNode.data);
            }
            currentNode=currentNode.getNextLink();
            indexCounter++;
        }
        return null;
    }
    //------------------------------------------------------------------------------------------------------------------
    /**
     *
     * @return Very first element of the Linked List.
     */
    public DataType getFirst() { return (DataType) headNode.data; }
    //------------------------------------------------------------------------------------------------------------------
    /**
     * @return Very Last element of Linked List.
     */
    public DataType getLast() { return get(size()-1); }
    //------------------------------------------------------------------------------------------------------------------
    /**
     * @return size of Linked List.
     */
    public int size()
    {
        return sizeOfList;
    }
    //------------------------------------------------------------------------------------------------------------------
    /**
     * @param data This method add the specified element at the first position of the list.
     */
    public void insertAtFirst(DataType data)
    {
        sizeOfList++;
        Node<DataType> currentNode=new Node<>(data);
        currentNode.setNextLink(headNode);
        headNode=currentNode;
    }
    //------------------------------------------------------------------------------------------------------------------
    /**
     * @return true if the Linked List is empty at that point else false.
     */
    public boolean isEmpty()
    {
        return (headNode==null);
    }
    //------------------------------------------------------------------------------------------------------------------

    /**
     * this method removes the very first element from the list
     */
    public void removeFirst()
    {
        sizeOfList--;
        headNode=headNode.getNextLink();
        System.gc();
    }
    //------------------------------------------------------------------------------------------------------------------
    /**
     * @param Index Provide index from 0-to-Size();.
     *              It deletes the element from the given index from the Linked List.
     *              It returns false if index specified is out of range.
     * @return true or false
     */
    public boolean remove(int Index)
    {
        if(Index==0)
        {
            removeFirst();
            return true;
        }
        else if(Index>0 && Index<=size()) {
            int indexCounter = 0;
            Node currentNode = headNode;
            while (indexCounter != Index - 1) {
                currentNode = currentNode.getNextLink();
                indexCounter++;
            }
            currentNode.setNextLink(currentNode.getNextLink().getNextLink());
            sizeOfList--;
            return true;
        }
        else return false;
    }
    //------------------------------------------------------------------------------------------------------------------
    /**
     * @param Index Provide index from 0-to-Size();.
     * @param data Object
     * This method adds element of Specific Object type at the specified
     * index of the Linked List as mentioned the method. If in case the index specified is out of range it returns false
     * @return true or false
     */
    public boolean insetAt(int Index,DataType data)
    {
        if(Index==0)
        {
            insertAtFirst(data);
            return true;
        }
        else if(Index>0 && Index<=size())
        {
            Node<DataType> currentNode=new Node<>(data);
            Node targetedNode=headNode;
            int indexCounter=0;
            while (indexCounter != Index - 1) {
                targetedNode = targetedNode.getNextLink();
                indexCounter++;
            }
            Node nextReferencedNode = targetedNode.getNextLink();
            targetedNode.setNextLink(currentNode);
            currentNode.setNextLink(nextReferencedNode);
            sizeOfList++;
            return true;
        }
        else
        return false;
    }
    //------------------------------------------------------------------------------------------------------------------
    /**
     *  It is used to remove all of the elements from this list.
     */
    public void clear()
    {
        for(int count=0;count<sizeOfList;count++)
        {
            headNode=headNode.getNextLink();
            System.gc();
        }
        headNode=null;
        tailNode=null;
        System.gc();
        this.sizeOfList=0;
    }
    //------------------------------------------------------------------------------------------------------------------
    /**
     * @param data Accepts Object
     *            It is used to compare the specified object with the elements of a list.
     * @return true or false
     */
    @Override
    public boolean equals(Object data)
    {
        for(int count=0;count<sizeOfList;count++)
        {
            if(get(count).equals(data))
                return true;
        }
        return false;
    }
    //------------------------------------------------------------------------------------------------------------------
    /**
     * @param data Accepts any Object
     *             It is used to remove the first occurrence of the specified element.
     * @return true or false :true if removed
     */
    public boolean remove(Object data)
    {
        for(int count=0;count<sizeOfList;count++)
        {
            if(get(count).equals(data))
                return remove(count);
        }
        return false;
    }
    //------------------------------------------------------------------------------------------------------------------
    /**
     * @param listData Accepts List
     *                 It is used to append all of the elements in the specified collection to
     *                 the end of a list. e.g pass and array and it will copy all the elements
     *                 from input array.
     * @return true or false : true if List is added
     */
    public boolean addAll(List<? extends DataType> listData)
    {
        if(listData==null)
            return false;
        for(int count=0;count<listData.size();count++)
        {
            add(listData.get(count));
        }
        return false;
    }
    //------------------------------------------------------------------------------------------------------------------
    /**
     * @return an Array[] of Objects
     */
    public Object[] toArray()
    {
        Object[] ObjectArray=  new Object[size()];
        for(int count=0;count<sizeOfList;count++)
        {
            ObjectArray[count]=get(count);
        }
        return ObjectArray;
    }
    //==================================================================================================================


}
