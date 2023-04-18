package scheduler;

import java.time.LocalTime;

public class event {
	
	String desc;
	String time;
	
	public event(String desc , String time) {
		
	}
	public void setDescription (String descr) {
		this.desc = descr;
	}
	public String getDescription() {
		
		return desc;
		
	}
	
	public void setTime(String time) {
		this.time = time;
	}
	public String getTime() {
		return time;
	}
}
}
