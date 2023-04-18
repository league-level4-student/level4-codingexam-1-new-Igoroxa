package scheduler;

public enum DaysOfTheWeek {

	MONDAY(), TUESDAY(), WEDNESDAY(), THURSDAY(), FRIDAY(), SATURDAY(), SUNDAY();
	
	
	private LinkedList<event> schedule;
	
	public LinkedList getList() {
		return schedule;
	}
	
	
	
}
