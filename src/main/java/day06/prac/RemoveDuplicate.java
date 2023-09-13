package day06.prac;
 import java.util.ArrayList;
 import java.util.List;
 
 
public class RemoveDuplicate {
	public static void main(String[]args) {
		List<String> cityList = new ArrayList<>();
		cityList.add("Chennai");
		cityList.add("Bangalore");
		cityList.add("Mumbai");
		cityList.add("Mumbai");
		
		System.out.println(cityList);
		System.out.println(cityList.size());
		System.out.println(cityList.remove(2));
		System.out.println(cityList);
		
		
	}
	
}
