package scheduler;

public class NegativeNumberException extends Exception {
	void popUp() {
		System.out.println("Error! Times for events overlap eachother.");
	}

}
