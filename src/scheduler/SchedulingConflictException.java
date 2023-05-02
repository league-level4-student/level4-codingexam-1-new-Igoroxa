package scheduler;

public class SchedulingConflictException extends Exception {
	void popUp() {
		System.out.println("Error! Times for events overlap eachother.");
	}

}
