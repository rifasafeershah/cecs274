package cecs274final;

import java.util.Iterator;
public class HashSetFinalTester {
	public static void main(String[] args) {
		HashSet names = new HashSet(101);
		names.add("Harry");
		names.add("Sue");
		names.add("Nina");
		names.add("Susannah");
		names.add("Larry");
		names.add("Eve");
		names.add("Sarah");
		names.add("Adam");
		names.add("Tony");
		names.add("Katherine");
		names.add("Juliet");
		names.add("Romeo");
		names.remove("Romeo");
		names.remove("George");
		HashSet names2 = new HashSet(101);
		names2.add("Harry");
		names2.add("Sue");
		names2.add("Nina");
		names2.add("Susannah");
		names2.add("Linus");
		names2.add("Sam");
		System.out.println("testing complement");
		HashSet namesc = names.complement(names2);
		Iterator iter = namesc.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
			}
		HashSet names3 = new HashSet(101);
		names3.add("Harry");
		names3.add("Sue");
		names3.add("Nina");
		names3.add("Susannah");
		names3.add("Larry");
		System.out.println("testing subset");
		System.out.println(names.subset(names3));
		System.out.println(names2.subset(names3));
		}
	}
