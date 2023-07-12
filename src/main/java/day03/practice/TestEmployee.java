package day03.practice;

public class TestEmployee {
	 
    private int id;
    private String name;
 
    public TestEmployee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    	 
        public static void main(String[] args) {
            TestEmployee e1 = new TestEmployee(1, "naresh");
            TestEmployee e2 = new TestEmployee(2, "suresh");
            System.out.println("id" + "=" + e1.id + "," + " " +"name" + "=" +  e1.name);
            System.out.println("id" + "=" + e2.id + "," + " " +"name" + "=" +  e2.name);
        }
    
}