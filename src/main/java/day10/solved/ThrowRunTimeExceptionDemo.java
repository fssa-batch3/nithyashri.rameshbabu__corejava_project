package day10.solved;

import day07.practice.Tasks;

class NewTaskValidator {
       
	public static boolean validate(Tasks task) {
		
		if (task == null)
			throw new IllegalArgumentException("Task is null");
		else if (  task.getName()== null || "".equals(task.getName()))
			throw new IllegalArgumentException("Task name is empty");
		return true;
	}
}

public class ThrowRunTimeExceptionDemo {
	public static void main(String[] args) {
		Tasks task = new Tasks("Swimming", 4,"To do sometihg");

		NewTaskValidator.validate(task);
	}
}