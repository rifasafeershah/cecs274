
//Rifa Safeer Shah
//Hash Set Project
/**
 * The HashSet.java program is for the use of HashSet with the Nodes. It shows the intersection, union and
 * difference between the sets (SetA: r,i,f,a and SetB: r, h, e, a)
 * Inputs: None
 * Outputs: Difference between two sets, union, intersection
 */

import java.util.Iterator;
import java.util.NoSuchElementException;


/**
 This class implements a hash set using separate chaining.
 */
public class HashSet
{
    private Node[] buckets;
    private int currentSize;

    /**
     Constructs a hash table.
     @param bucketsLength the length of the buckets array
     */
    public HashSet(int bucketsLength)
    {
        buckets = new Node[bucketsLength];
        currentSize = 0;
    }

    /**
     Tests for set membership.
     @param x an object
     @return true if x is an element of this set
     */
    public boolean contains(Object x)
    {
        int h = x.hashCode();
        if (h < 0) { h = -h; }
        h = h % buckets.length;

        Node current = buckets[h];
        while (current != null)
        {
            if (current.data.equals(x)) { return true; }
            current = current.next;
        }
        return false;
    }

    /**
     Adds an element to this set.
     @param x an object
     @return true if x is a new object, false if x was
     already in the set
     */
    public boolean add(Object x)
    {
        int h = x.hashCode();
        if (h < 0) { h = -h; }
        h = h % buckets.length;

        Node current = buckets[h];
        while (current != null)
        {
            if (current.data.equals(x)) { return false; }
            // Already in the set
            current = current.next;
        }
        Node newNode = new Node();
        newNode.data = x;
        newNode.next = buckets[h];
        buckets[h] = newNode;
        currentSize++;
        return true;
    }

    /**
     Removes an object from this set.
     @param x an object
     @return true if x was removed from this set, false
     if x was not an element of this set
     */
    public boolean remove(Object x)
    {
        int h = x.hashCode();
        if (h < 0) { h = -h; }
        h = h % buckets.length;

        Node current = buckets[h];
        Node previous = null;
        while (current != null)
        {
            if (current.data.equals(x))
            {
                if (previous == null) { buckets[h] = current.next; }
                else { previous.next = current.next; }
                currentSize--;
                return true;
            }
            previous = current;
            current = current.next;
        }
        return false;
    }

    /**
     * Combines two Objects with all their
     * elements together
     * @param x
     * @return
     */
    public HashSet union(HashSet x)
    {
        // Creates a new HashSet for the Combines Elements
        HashSet result = new HashSet(currentSize);

        Iterator rTemp = x.iterator();
        Iterator cTemp = iterator();

        while(rTemp.hasNext()){
            result.add(rTemp.next());
        }
        while(cTemp.hasNext()){
            result.add(cTemp.next());
        }

        return result;
    }

    /**
     * Compares two Objects
     * that have the same element
     * @param x
     * @return
     */
    public HashSet intersect(HashSet x)
    {
        HashSet result = new HashSet(currentSize);

        Iterator rTemp = x.iterator();

        while(rTemp.hasNext())
        {
            Object temp = rTemp.next();
            if(this.contains(temp))
            {
                result.add(temp);
            }
        }

        return result;
    }

    /**
     * Compares two Objects
     * and shows the Difference in
     * the elements of the two Objects
     * @param x
     * @return
     */
    public HashSet difference(HashSet x)
    {
        HashSet result = new HashSet(currentSize);

        Iterator rTemp = x.iterator();
        Iterator cTemp = iterator();
        while(rTemp.hasNext())
        {
            Object temp = rTemp.next();
            if (!this.contains(temp))
                result.add(temp);
        }
        return result;
    }

    /**
     Returns an iterator that traverses the elements of this set.
     @return a hash set iterator
     */
    public Iterator iterator()
    {
        return new HashSetIterator();
    }

    /**
     Gets the number of elements in this set.
     @return the number of elements
     */
    public int size()
    {
        return currentSize;
    }

    class Node
    {
        public Object data;
        public Node next;
    }

    class HashSetIterator implements Iterator
    {
        private int bucketIndex;
        private Node current;

        /**
         Constructs a hash set iterator that points to the
         first element of the hash set.
         */
        public HashSetIterator()
        {
            current = null;
            bucketIndex = -1;
        }

        public boolean hasNext()
        {
            if (current != null && current.next != null) { return true; }
            for (int b = bucketIndex + 1; b < buckets.length; b++)
            {
                if (buckets[b] != null) { return true; }
            }
            return false;
        }

        public Object next()
        {
            if (current != null && current.next != null)
            {
                current = current.next; // Move to next element in bucket
            }
            else // Move to next bucket
            {
                do
                {
                    bucketIndex++;
                    if (bucketIndex == buckets.length)
                    {
                        throw new NoSuchElementException();
                    }
                    current = buckets[bucketIndex];
                }
                while (current == null);
            }
            return current.data;
        }

        public void remove()
        {
            throw new UnsupportedOperationException();
        }
    }
}
