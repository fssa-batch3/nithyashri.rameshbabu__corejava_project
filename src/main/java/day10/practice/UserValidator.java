package day10.practice;

public class UserValidator {

	public boolean validateEmail(String email) throws InvalidUserException {
		String regex = "^[A-Za-z0-9+_.-]+@([A-Za-z0-9-]+\\.)+[A-Za-z]{2,}$";

//		if (regex.matches(email)) {
			if (email.matches(regex)) {
			return true;
		} else {
			throw new InvalidUserException("Invalid email.");
		}
	}
}
