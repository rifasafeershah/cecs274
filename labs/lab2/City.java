import java.util.Arrays;

public class City implements Comparable<City> {
	String cityname;
	String statename;
	
	public City(String incityname, String instatename) {
		cityname = incityname;
		statename = instatename;
	}
	
	public String toString() {
		return cityname + " , " + statename;
	}
	
	public int compareTo(City o) {
		if (cityname.compareTo(o.cityname) == 0) {
			return statename.compareTo(o.statename);
		}
		else {
			return cityname.compareTo(o.cityname);
		}
	}
	
	public static void main(String [] args) {
		City [] cities = new City[5];
		cities[0] = new City("anaheim" , "disneyland");
		cities[1] = new City("long beach" , "california");
		cities[2] = new City("long beach" , "new york");
		cities[3] = new City("orlando" , "florida");
		cities[4] = new City("anaheim" , "california");
		System.out.println("before sort");
		for (int i=0; i<cities.length; i++) {
			System.out.println(cities[i]);
		}
		Arrays.sort(cities);
		System.out.println("after sort");
		System.out.println(cities);
		for (int i=0; i<cities.length; i++) {
			System.out.println(cities[i]);
		}		
	}
}
