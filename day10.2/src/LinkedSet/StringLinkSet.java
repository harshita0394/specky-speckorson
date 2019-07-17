package LinkedSet;

import java.util.LinkedHashSet;

public class StringLinkSet {

	public static void main(String[] args) {
		LinkedHashSet<String> l1 = new LinkedHashSet<>();
		System.out.println(l1.add("A"));
		System.out.println(l1.add("B"));
		System.out.println(l1.add("C"));		
		System.out.println(l1.add("C"));
		
		System.out.println("Sizeof linkedHashSet :"+l1.size());
		System.out.println("Removing B frm set :"+l1.remove("B"));
		System.out.println("Removing B frm set :"+l1.remove("B"));

	}

}
