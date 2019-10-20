import java.util.ArrayList;

public class ArrayListRunner {

	public static void main(String[] args) {
		
		ArrayList <String> names = new ArrayList <String>();	
		System.out.println(names);
		//a
    names.add("Alice");
		names.add("Bob");
		names.add("Connie");
		names.add("David");
		names.add("Edward");
		names.add("Fran");
		names.add("Gomez");
		names.add("Harry");
		System.out.println(names);
		System.out.println(" ");
		
		//b
		System.out.println(names.get(0));
		System.out.println(names.get(names.size()-1));
		System.out.println(" ");
		
		//c
		names.size();
		System.out.println(names.size());
		System.out.println(" ");
		
		//d
		names.get(names.size()-1);
		System.out.println(" ");
		
		//e
		names.set(0, "Alice B. Toklas");
		System.out.println(names);
		System.out.println(" ");
		
		//f
		names.add(4, "Doug");
		System.out.println(" ");
		
		//g
		int i = 0;
		while (i <= names.size()-1) {
			System.out.println(names.get(i));
			if (i < names.size()-1) {
				System.out.println(" ");
			}
			i = i + 1;
		}
		
		//h
		ArrayList <String> names2 = new ArrayList <String>(names);
		
		//i
		System.out.println("");
		names.remove(0);
		System.out.println("names: " + names);
		System.out.println("names2: " + names2);
	}
}
