package day05.solved.packagetwo;
import day05.solved.packageone.*;
public class SomeOtherClass {

	public static void main(String[] args) {
		try {
		Rectangle rectangle = new Rectangle(1.0, 1.0);
		
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}