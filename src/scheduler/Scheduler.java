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
	static LinkedList<event> list;

	public static void main(String[] args) {
		list = null;
		Scanner scan = new Scanner(System.in);
		boolean isRunning = true;
		boolean actionState = true;
		while (isRunning == true) {
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

			}

			System.out.println("Which action do you want to perform?");
			String action = scan.nextLine();

			switch (action) {
			case ("add"): {

				System.out.println("State the event name");
				String desc = scan.nextLine();
				System.out.println("State the event time");
				String time = scan.nextLine();
				try {
					testTime(time);
				} catch (SchedulingConflictException e) {
					e.popUp();
				}
				event even = new event(desc, time);
				even.setDescription(desc);
				even.setTime(time);
				list.add(even);
				System.out.println("Would you wish to continue?");
				String resp = scan.nextLine();
				if (resp.equalsIgnoreCase("no")) {
					isRunning = false;
					break;
				}
				break;

			}

			case ("remove"): {
				System.out.println("Which event in the day do you wish to remove?");
				String numb = scan.nextLine();
				int number = Integer.parseInt(numb);
				list.remove(number - 1);
				break;
			}

			case ("view"): {
				Node<event> evenNode = list.getHead();

				System.out.println(evenNode.getValue().getDescription() + " at " + evenNode.getValue().getTime());

				for (int i = 0; i < list.size() - 1; i++) {
					evenNode = evenNode.getNext();
					System.out.println(evenNode.getValue().getDescription() + " at " + evenNode.getValue().getTime());
				}
			}
			}
		}
	}

	public static void testTime(String Time) throws SchedulingConflictException {
		
		if (list.size() > 0) {
			
			Node<event> ExNode = list.getHead();
			do {
				System.out.println(ExNode.getValue().getTime());
				if (ExNode.getValue().getTime().equals(Time)) {

					
					throw new SchedulingConflictException();

				}
				ExNode = ExNode.getNext();

			} while (ExNode != null);

		}
	}
}
