//Name: Rifa Safeer Shah
//Binary Search Tree Project

/**
 * The Binary Search Tree Project is used to model the binary search tree and print out the largest
 * and the smallest element in the binary search tree.
 * INPUTS: First Name and Last Name of authors
 * OUTPUTS: Binary Search Tree, max, min
 */

public class TreesTester {
    public static void main(String[] args) {
        
        BinarySearchTrees authorList = new BinarySearchTrees();
        
        Author auth1 = new Author("Atark","Aony");
        Author auth2 = new Author("Rogers","Steve");
        Author auth3 = new Author("Son of Odin","Thor");
        Author auth4 = new Author("Banner","Bruce");
        Author auth5 = new Author("Barton","Clint");
        Author auth6 = new Author("Romanoff","Natasha");
        
        authorList.add(auth1);
        authorList.add(auth2);
        authorList.add(auth3);
        authorList.add(auth4);
        authorList.add(auth5);
        authorList.add(auth6);
        
        System.out.println("Binary Search Tree: ");
        authorList.print();
        
        System.out.println("The maximum is " + authorList.findMax()); //largest element
        System.out.println("The minimum is " + authorList.findMin()); //smallest element
        
    }
    
}
