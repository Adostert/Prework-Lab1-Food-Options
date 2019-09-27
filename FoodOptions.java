package foodOptions;
import java.util.Scanner;

public class FoodOptions {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name;
		int numGuests;
		String eventType;
		String meal = null;
		String mealPrep;
		String answer;
		
		
	
		System.out.println("Lets figure out what to have for dinner!");
		
		System.out.println("What is your name?");
		
		name = scanner.nextLine();

		
		System.out.println("What kind of event are you enjoying tonight? Casual, Semiformal or Formal");
		eventType = scanner.nextLine();
			
		if (eventType.contentEquals( "Casual")) {	
			meal = "sandwiches";
		}
		else if  (eventType.contentEquals( "Semiformal")) {
			meal = "fried chicken";
		}

		else if (eventType.contentEquals( "Formal")) {
			meal = "chicken parmesan";
		}
		

		System.out.println("Lets figure out how to prep your meal. First, how many people?");
		numGuests = scanner.nextInt();
		if (numGuests == 1 ) {
			mealPrep = "in your microwave";
		}
			
		else if (numGuests > 1 && numGuests < 13) {
				mealPrep = "in your kitchen!";
			
		}
		
		else {
				mealPrep = "by catering!";
			}
		

 
		System.out.println("Since you’re hosting a " +  eventType + " event for " + numGuests + " participants, you should serve " + meal + " prepared " + mealPrep);
		


			
	}


}

