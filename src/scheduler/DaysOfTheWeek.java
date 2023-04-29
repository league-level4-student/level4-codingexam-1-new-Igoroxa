package scheduler;

public enum DaysOfTheWeek {

	MONDAY(), TUESDAY(), WEDNESDAY(), THURSDAY(), FRIDAY(), SATURDAY(), SUNDAY();
	
	
	private LinkedList<event> schedule = new LinkedList<event>();
	
	

	public LinkedList getList() {
		return schedule;
	}
	
	
	
	
	
}
