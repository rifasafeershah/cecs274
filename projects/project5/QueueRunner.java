
//Name: Rifa Safeer Shah
//Assignment: Queue Project

/**
 * The QueueRunner.java program is used to model the distribution of iPhones
 * to the customers in the queue using their first name and last name
 * INPUTS: First Name, Last Name, Size of the Queue
 * OUTPUT: A queue of people to receive the iPhone
 */

public class QueueRunner {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

        LinkedList iPhone = new LinkedList();

        System.out.println("Fill up the queue with people ahead of me.");
        iPhone.add(new person("Britney", "Spears"));
        iPhone.add(new person("Chevvy", "Chase"));
        iPhone.add(new person("Sandra", "Bullock"));
        System.out.println("After loading up the queue with famous people:");
        System.out.println(iPhone);
        System.out.println("size = " + iPhone.queueSize());
        iPhone.add(new person("Dave", "Brown"));
        iPhone.add(new person("Mary", "Brown"));

        System.out.println("After adding me and Mary");
        System.out.println("size = " + iPhone.queueSize());
        System.out.println(iPhone);
        System.out.println("Add some non-descript person");
        iPhone.add(new person("Joshua", "Nun"));
        System.out.println("size = " + iPhone.queueSize());
        System.out.println(iPhone);
        iPhone.remove();
        System.out.println("Now they are gone.");
        System.out.println("size = " + iPhone.queueSize());
        System.out.println(iPhone);
        System.out.println("The queue now has: " + iPhone.queueSize() + " in it.");
        System.out.println("The first person to get a phone will be: " +
                iPhone.peek());
        System.out.println(iPhone);
        int index = iPhone.queueSize();
        for (int i = 0; i < index; i++ ) 
        {
            System.out.println("Oh look!  " + iPhone.remove() + " just got a phone!");
        }
        System.out.println("size = " + iPhone.queueSize());
    }
}
