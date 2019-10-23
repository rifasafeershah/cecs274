/**
 * The EndangeredSpecies.java program is used to model endangered species names,
 * their current population and their current rate of growth.
 * INPUTS: Species Name, Current Population, Rate of Growth
 * OUTPUT: An endangered Species object
 */
 
public class EndangeredSpecies {
	
	//Private Species Class info: name, population, rate of growth 
	private String SpeciesName;
	private int CurrentPopulation;
	private double GrowthRate;
	
	//Class Constructors
	EndangeredSpecies(String n , int p , double r) {
		SpeciesName = n;
		CurrentPopulation = p;
		GrowthRate = r;
	}
	
	EndangeredSpecies() {
		SpeciesName = null;
		CurrentPopulation = 0;
		GrowthRate = 0;
	}
	
	//Private data accessor methods
	
	/**
	 * String getName()
	 * @return 'SpeciesName'
	 */
	public String getName() {
		return SpeciesName;
	}
	
	/**
	 * int getPopulation()
	 * @return 'CurrentPopulation'
	 */
	public int getPopulation() {
		return CurrentPopulation;
	}
	
	/**
	 * double getRate()
	 * @return 'GrowthRate'
	 */
	public double getRate() {
		return GrowthRate;
	}
	
	//Private data mutator methods
	/**
	 * void setName(String)
	 * @param n
	 * Change the value "n" into "SpeciesName"
	 */
	public void setName(String n) {
		SpeciesName = n;
		return;
	}
	
	/**
	 * void setPopulation(int)
	 * @param p
	 * Change the value "p" into "CurrentPopulation"
	 */
	public void setPopulation(int p) {
		CurrentPopulation = p;
		return;
	}
	
	/**
	 * void setRate(double)
	 * @param r
	 * Change the value "r" into "GrowthRate"
	 */
	public void setRate(double r) {
		GrowthRate = r;
		return;
	}
	
	/**
	 * int GrowthPerYear(int)
	 * @param g
	 * @return 'NEw Population'
	 */
	public int GrowthPerYear(int g) {
		return (int)(CurrentPopulation * Math.pow(Math.E, GrowthRate * g));
	}
	
	/**
	 * String toString()
	 * @return 'endangeredSpecies Information'
	 */
	public String toString() {
		String output = "";
		output = output + " Species Name: " + this.SpeciesName + "\n";
		output = output + "Current Population: " + this.CurrentPopulation + "\n";
		output = output + "Growth Rate: " + (GrowthRate * 100) + "%" + "\n";
		return output;
	}
}
