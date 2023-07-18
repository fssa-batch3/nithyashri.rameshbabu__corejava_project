package day06.practice;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicate {
	public static void main(String[] args) {

		List<String> cityL = new ArrayList<String>();
		cityL.add("Chennai");
		cityL.add("Bangalore");
		cityL.add("Mumbai");
		cityL.add("Mumbai");

		List<String> uniqueCity = new ArrayList<>();
		 
		for (String city : cityL) {
			if (uniqueCity.contains(city)) {
				continue;
			}
			uniqueCity.add(city);
		}
		for (String city : uniqueCity) {
			System.out.println(city);
		}

	}
}