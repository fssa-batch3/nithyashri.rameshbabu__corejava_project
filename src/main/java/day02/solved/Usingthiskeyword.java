package day02.solved;

public class Usingthiskeyword {


    private String name;

	public String getName() {  // Public getter method
        return name;
    }

    public void setName(String name) {  
        
			this.name = name; 
    }


public static void main(String[]args) {

	
Usingthiskeyword person = new Usingthiskeyword();
person.setName("John");      // Setting the name using the setter method
String name = person.getName();  // Accessing the name using the getter method
System.out.println(name);    // Output: John
}
}
