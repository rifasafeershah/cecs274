/**
 * This class is used to test the functionality of the EndangeredSpecies class
 */

public class ESTesterClass {
	public static void main(String[] args) {
		EndangeredSpecies Dog = new EndangeredSpecies("Dog",5000,5.0);
		System.out.println("The new species is: " + Dog );
		System.out.println(Dog.GrowthPerYear(5));
		System.out.println(Dog.GrowthPerYear(3));
		System.out.println(" ");
		EndangeredSpecies Cat = new EndangeredSpecies("Cat",50,10.0);
		System.out.println("The new species is: " + Cat );
		System.out.println(Cat.GrowthPerYear(5));
		System.out.println(Cat.GrowthPerYear(4));
	}
}
