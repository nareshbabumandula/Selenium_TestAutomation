package collections;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		List<String> alist=new ArrayList<String>();
		alist.add("jaipal");
		alist.add("saran");
		alist.add("lavanya");
		alist.add("rahul");
		alist.add("ram");
		System.out.println(alist.get(1));
		System.out.println(alist.get(2));
		System.out.println(alist.get(3));
		System.out.println(alist.get(4));
		System.out.println(alist.get(0));
		System.out.println(alist.contains("ram"));
		System.out.println(alist.size());
		System.out.println(alist.remove("1"));
		for (int i = 0; i < alist.size(); i++) {
			System.out.println(alist.get(i));
		}
		

	}
}
