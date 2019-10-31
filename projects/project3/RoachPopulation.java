/**
 * The RoachPopulation.java program is used to model the roach population, their current population and their
 * breeding and spraying count
 * Designing Classes Project
 * INPUTS: Name of gang, Current Population, SprayAmount, BreedAmount 
 * OUTPUT: Population and Gang Name
 */

public class RoachPopulation {
	
	public String name;
	public int RoachPopulation;
	
	//Constructor that has the initial population of roaches as 10
	public RoachPopulation() {
		RoachPopulation = 10;
		System.out.println("The roach population is " + RoachPopulation + " and these roaches have no name.");
	}
	
	//Constructor that initializes the roach population and name of the roach gang
	public RoachPopulation(int RoachPopulation, String name) {
		System.out.println("The roach population is " + RoachPopulation + " and the name of these roaches is "
	+ name);
		this.RoachPopulation = RoachPopulation;
		this.name = name;
	}
	
	//Doubles the current population of roaches
	public void breed() {
		RoachPopulation = RoachPopulation * 2;
	}
	
	//Doubles the current population of roaches
	public void breed(int BreedingAmount) {
		RoachPopulation = RoachPopulation * 2 * BreedingAmount;
	}
	
	//Decreases current population of roaches by 10%
	public void spray() {
		RoachPopulation = (int) (RoachPopulation - (RoachPopulation * 0.1));
	}
	
	//Decreases current population of roaches by 10%
	public void spray(int sprayAmount) {
		RoachPopulation = (int) (RoachPopulation - (RoachPopulation * 0.1));
	}
	
	//Retrieves the current population of roaches
	public String getRoaches() {
		return "The current population of roaches is " + (int) RoachPopulation;
	}
	
	//Retrieves current roach name
	public String getName() {
		return "The current roach gang name is " + name;
	}
	
	//Change the name of the roach gang
	public void setName(String gang) {
		name = gang;
	}
	
	//Returns information
	@Override
	public String toString() {
		return "The current roach population is " + (int) RoachPopulation + " and the name of the roach gang is "
	+ name;
	}
}
