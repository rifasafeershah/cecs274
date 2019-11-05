//Rifa Safeer Shah
//Hash Set Project
/**
 * The HashSet.java program is for the use of HashSet with the Nodes. It shows the intersection, union and
 * difference between the sets (SetA: r,i,f,a and SetB: r, h, e, a)
 * Inputs: None
 * Outputs: Difference between two sets, union, intersection of the characters in the two marvel movies
 */

import java.util.Iterator;

public class Main
{
    public static void main(String[] args)
    {
        HashSet rifa = new HashSet(100);
        HashSet rhea = new HashSet(100);

        // Elements added to First Object
        rifa.add("r");
        rifa.add("i");
        rifa.add("f");
        rifa.add("a");

        // elements added to second Object
        rhea.add("r");
        rhea.add("h");
        rhea.add("e");
        rhea.add("a");
        
        HashSet temp = rifa.difference(rhea);
        HashSet temp1 = rifa.union(rhea);
        HashSet temp2 = rifa.intersect(rhea);

        Iterator CNames = rifa.iterator();
        Iterator ENames = rhea.iterator();
        Iterator tempM = temp.iterator();
        Iterator tempU = temp1.iterator();
        Iterator tempI = temp2.iterator();

        System.out.println("letters in the name rifa: ");
        while (CNames.hasNext())
        {
            System.out.println(CNames.next());
        }
        System.out.println();
        System.out.println("letters in the name rhea: ");
        while (ENames.hasNext())
        {
            System.out.println(ENames.next());
        }
        System.out.println();
        System.out.println("The Difference of the two sets are: ");	// prints the difference of elements
        while(tempM.hasNext())
        {
            System.out.println(tempM.next());
        }
        System.out.println();
        System.out.println("The Union of the two sets are: ");	// prints out the elements in both sets
        while(tempU.hasNext())
        {
            System.out.println(tempU.next());
        }
        System.out.println();
        System.out.println("The Intersection of the two sets are: ");	// prints out the common element
        while(tempI.hasNext())
        {
            System.out.println(tempI.next());
        }
    }
}
