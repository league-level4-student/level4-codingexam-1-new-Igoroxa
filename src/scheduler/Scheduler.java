package scheduler;

import java.time.LocalTime;
import java.time.MonthDay;
import java.util.Scanner;

/*
 * Objective: Create a weekly scheduling application.
 * 
 * You may create any additional enums, classes, methods or variables needed
 * to accomplish the requirements below:
 * 
 * - You should use an array filled with enums for the days of the week and each
 *   enum should contain a LinkedList of events that includes a time and what is 
 *   happening at the event.
 * 
 * - The user should be able to to interact with your application through the
 *   console and have the option to add events, view events or remove events by
 *   day.
 *   
 * - Each day's events should be sorted by chronological order.
 *  
 * - If the user tries to add an event on the same day and time as another event
 *   throw a SchedulingConflictException(created by you) that tells the user
 *   they tried to double book a time slot.
 *   
 * - Make sure any enums or classes you create have properly encapsulated member
 *   variables.
 */
public class Scheduler {

	public static void main(String[] args) {
		LinkedList<event> list;
		Scanner scan = new Scanner(System.in);
		System.out.println("Which day do you want to choose?");
		String inputtedday = scan.nextLine();

		switch (inputtedday) {
		case ("monday"): {
			list = DaysOfTheWeek.MONDAY.getList();
		}
			break;
		case ("tuesday"): {
			list = DaysOfTheWeek.TUESDAY.getList();
		}
			break;
		case ("wednesday"): {
			list = DaysOfTheWeek.WEDNESDAY.getList();
		}
			break;
		case ("thursday"): {
			list = DaysOfTheWeek.THURSDAY.getList();
		}
			break;
		case ("friday"): {
			list = DaysOfTheWeek.FRIDAY.getList();
		}
			break;
		case ("saturday"): {
			list = DaysOfTheWeek.SATURDAY.getList();
		}
			break;
		case ("sunday"): {
			list = DaysOfTheWeek.SUNDAY.getList();
		}
			break;
		default: {
			list = null;
		}
		}

		System.out.println("Which action do you want to perform?");
		String action = scan.nextLine();

		switch (action) {
		case ("add"): {
		
			System.out.println("State the event name");
			String desc = scan.nextLine();
			System.out.println("State the event time");
			String time = scan.nextLine();
			event even = new event(desc, time);
			list.add(even);
			
		}
			break;

		case ("remove"): {

		}

		case ("view"): {

		}
		}

	}
}
