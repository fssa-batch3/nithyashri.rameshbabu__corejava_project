package day03.practice;

public class User {
      
	private String name;
	private String email;
	private int pass;
	
	
	public User() {		
	}
	
	public User(String name , String email, int pass) {
		this.name = name;
		this.email = email;
		this.pass = pass;
				
	}
	
	public String getName() {
		return name;
	}
	public void SetName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void SetEmail(String email) {
		this.email = email;
	}
	public int getPass() {
		return pass;
	}
	public void SetPass(int pass) {
		this.pass = pass;
	}
	
	
	public static void main(String[]args) {
		User one = new User();
		one.SetName("Nithyashri");
		one.SetEmail("nithirmsh@gmail.com");
		one.SetPass(123);
		
		System.out.println("User 1");
		System.out.println("Name" + " = " + one.getName());
		System.out.println("Email" + " = " + one.getEmail());
		System.out.println("Password" + " = " +  one.getPass());
		
		System.out.println();
		User two = new User("Ramesh" , "ramesh@gmail.com", 123);
		System.out.println("User 2");
		System.out.println("Name" + " = " + two.getName());
		System.out.println("Email" + " = " + two.getEmail());
		System.out.println("Password" + " = " + two.getPass());
		
	}
}
