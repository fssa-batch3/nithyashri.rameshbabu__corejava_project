package day02.practice;


public class User {

	 private int id;
	 private String name;
	 private String pass;
	 private String email;

	    public void setId(int id) {
	        this.id = id;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public void setPassword(String password) {
	        this.pass = password;
	    }

	    public void setEmailId(String emailId) {
	        this.email = emailId;
	    }

	    
	    
	    public int getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getPassword() {
	        return pass;
	    }

	    public String getEmailId() {
	        return email;
	    }
	    
	    public static void main(String[]args) {
	        User us = new User();
	        us.setId(23);
	        us.setName("Nithyashri");
	        us.setPassword("A0190");
	        us.setEmailId("nithirmshmail.com");
	        
	    
	        System.out.println("User details");
	        System.out.println("Name: " + us.getName());
	        System.out.println("Id: " + us.getId());
	        System.out.println("Password: " + us.getPassword());
	        System.out.println("Email: " + us.getEmailId());
	        
	    }
}
