
//Name: Rifa Safeer Shah
//Assignment: Queue Project

/**
 * The LinkedList.java program is used to model the distribution of iPhones
 * to the customers in the queue using their first name and last name
 * INPUTS: First Name, Last Name, Size of the Queue
 * OUTPUT: A queue of people to receive the iPhone
 */

import java.util.NoSuchElementException;

public class LinkedList {
	public int currentSize = 0;
    private Node first;
    private Node previous;
    private Node position;

    @Override
    public String toString() 
    {
        if (first != null)
        {
            // create tempPerson to hold the type casted data
            person tempPerson = (person) first.data;
            //Print first element
            System.out.println("Name: " + tempPerson.FirstName + " " + tempPerson.LastName);

            //tempNext node to store the node after the first node
            Node tempNext = first.next;

            //see if the next node has any element
            while (tempNext != null)
            {
                // tempPerson assigned to data of the next element
                tempPerson = (person) tempNext.data;
                //print the element
                System.out.println("Name: " +tempPerson.FirstName + " " + tempPerson.LastName);

                tempNext = tempNext.next;
            }
            return "";
        } 
        else 
        {
            return("List Empty");
        }
    }

    /**
     Constructs an empty linked list.
     */
    public LinkedList()
    {
        first = null;
    }

    public void add(Object element) 
    {
        if (position == null) 
        {

            addFirst(element);

            position = first;
        } 
        else 
        {
            Node newNode = new Node();
            newNode.data = element;
            newNode.next = position.next;
            position.next = newNode;
            position = newNode;

            currentSize++;
        }
        previous = position;
    }
    
    /**
     Computes the size of the linked list.
     @return the number of elements in the list
     */
    public int queueSize()
    {
        return currentSize;
    }

    /**
     Returns the first element in the linked list.
     @return the first element in the linked list
     */
    public Object peek()
    {
        if (first == null)
            throw new NoSuchElementException();

        // Type casting element into person object to access the instance variables
        person temp = (person) first.data;
        return temp.FirstName + ", " + temp.LastName;
    }

    /**
     Removes the first element in the linked list.
     @return the removed element
     */
    public Object remove()
    {
        if (first == null)
            throw new NoSuchElementException();
        Object element = first.data;
        first = first.next;
        currentSize--;


        // Type casting element into person object to access the instance variables
        person tempPerson = (person) element;
        return tempPerson.FirstName + " " + tempPerson.LastName;
    }

    /**
     Adds an element to the front of the linked list.
     @param element the element to add
     */
    public void addFirst(Object element)
    {
        Node newNode = new Node();
        newNode.data = element;
        newNode.next = first;
        first = newNode;
        currentSize++;
    }

    private class Node
    {
        public Object data;
        public Node next;
    }
}
