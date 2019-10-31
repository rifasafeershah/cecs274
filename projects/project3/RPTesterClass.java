public class RPTesterClass {
	public static void main(String[] args) {
		
		//First Roach Class
		System.out.println("First Roach Class");
		RoachPopulation roaches1 = new RoachPopulation();
		roaches1.setName("Smoky Brown Cockroach"); //changes roach gang
		roaches1.spray(); //decreases population by 10%
		System.out.println("The roaches have been sprayed.");
		System.out.println(roaches1.getRoaches());
		roaches1.breed(); //doubles population
		System.out.println("The roaches have been bred.");
		System.out.println(roaches1.getRoaches()); //retrieves population
		System.out.println(roaches1); //returns current population
		System.out.println(" ");
		
		//Second Roach Class
		System.out.println("Second Roach Class");
		RoachPopulation roaches2 = new RoachPopulation(500, "American Cockroach");
		roaches2.setName("Madagascar Hissing Cockroach");
		roaches2.spray();
		System.out.println("The roaches have been sprayed.");
		System.out.println(roaches2.getRoaches());
		roaches2.breed();
		System.out.println("The roaches have been bred.");
		System.out.println(roaches2.getRoaches());
		System.out.println(roaches2);
		System.out.println(" ");
		
		//Third Roach Class
		System.out.println("Third Roach Class");
		RoachPopulation roaches3 = new RoachPopulation(100, "German Cockroach");
		roaches3.setName("Brown-Banded Cockroach");
		roaches3.spray();
		System.out.println("The roaches have been sprayed.");
		System.out.println(roaches3.getRoaches());
		roaches3.breed();
		System.out.println("The roaches have been bred.");
		System.out.println(roaches3.getRoaches());
		System.out.println(roaches3);
		System.out.println(" ");
		
		//Fourth Roach Class
		System.out.println("Fourth Roach Class");
		RoachPopulation roaches4 = new RoachPopulation();
		roaches4.setName("Smoky Brown Cockroach"); //changes roach gang
		roaches4.spray(2); //decreases population by 10%
		System.out.println("The roaches have been sprayed.");
		System.out.println(roaches4.getRoaches());
		roaches4.breed(2); //doubles population
		System.out.println("The roaches have been bred.");
		System.out.println(roaches4.getRoaches()); //retrieves population
		System.out.println(roaches4); //returns current population
		System.out.println(" ");
		
		//Fifth Roach Class
		System.out.println("Fifth Roach Class");
		RoachPopulation roaches5 = new RoachPopulation(500, "American Cockroach");
		roaches5.setName("Madagascar Hissing Cockroach"); //changes roach gang
		roaches5.spray(3); //decreases population by 10%
		System.out.println("The roaches have been sprayed.");
		System.out.println(roaches5.getRoaches());
		roaches5.breed(3); //doubles population
		System.out.println("The roaches have been bred.");
		System.out.println(roaches5.getRoaches()); //retrieves population
		System.out.println(roaches5); //returns current population
		System.out.println(" ");
		
		//Sixth Roach Class
		System.out.println("Sixth Roach Class");
		RoachPopulation roaches6 = new RoachPopulation(100, "German Cockroach");
		roaches6.setName("Madagascar Hissing Cockroach"); //changes roach gang
		roaches6.spray(2); //decreases population by 10%
		System.out.println("The roaches have been sprayed.");
		System.out.println(roaches6.getRoaches());
		roaches6.breed(2); //doubles population
		System.out.println("The roaches have been bred.");
		System.out.println(roaches6.getRoaches()); //retrieves population
		System.out.println(roaches6); //returns current population
		System.out.println(" ");
		
	}
}
