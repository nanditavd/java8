package samples.java.nandita;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortString {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Nandita");
		names.add("Vinod");
		names.add("Dhakappa");

		Collections.sort(names, (s1, s2) -> s1.compareTo(s2));

		System.out.println(names);
	}

}
