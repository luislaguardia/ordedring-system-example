// import the Scanner class
import java.util.Scanner;

public class App {
static Scanner scan = new Scanner(System.in);

public static void main(String[] args) {

		pizzaBebe();
	}

static void pizzaBebe() {

	System.out.println("Welcome to Red Ribbon!");

	System.out.println("Enter letter A if you want a Sippon Cake!");
	System.out.println("Enter letter B if you want a Chocolate Cake!");

	System.out.print("Enter your choice: ");
	char pili = scan.next().charAt(0);

	String keyk = "";
	double presyo = 0;

	switch (pili) {
	    case 'A':
		keyk = "Sippon Cake";
		presyo = 400.00;
		break;
		case 'B':
		keyk = "Chocolate Cake";
		presyo = 600.00;
		break;
		default:
	    System.out.println("Please enter A or B!");
		return;
		}

	System.out.println("Your order is: " + keyk);
	System.out.println("Your total order amount is: " + presyo);

	System.out.println("Enter COD if you want cash on delivery!");
	System.out.println("Enter CREDIT if you want to use credit card!");

	System.out.print("Enter your choice: ");
	String methodOfPAYMENT = scan.next();

	switch (methodOfPAYMENT) {
	case "COD":
	System.out.println("Please prepare exact amount " + presyo);
	break; 
	case "CREDIT":
	System.out.print("Enter CREDIT card number:");
    int visaCard = scan.nextInt();
    System.out.println(visaCard + " accepted");
	break;
	default:
	System.out.println("that's not in our method of payment");
	return;
    }

	System.out.println("Do you have a Red Ribbon card? (true or false)");
	System.out.print("Please enter true or false: ");
	boolean mayroongRedRibboncard = scan.nextBoolean();

	if (mayroongRedRibboncard == true) {
		System.out.println("You get a free coke!");
}   else {
		System.out.println("ughh, sayang");
		}

		System.out.println("Choose delivery method!");

		System.out.println("Enter PICKUP if you wanna pickup the cake");
		System.out.println("Enter DELIVER and I will deliver the cake to you");
		System.out.print("Enter delivery method: ");
		String methodofDelivery = scan.next();

	switch (methodofDelivery) {
	case "PICKUP":
		System.out.println("Alright, thank you!");
	break;
	case "DELIVER":
		System.out.print("Enter your Address: ");
        String address = scan.next();
        System.out.println( address + ", the cake is on the way, thank you!");
	break;
	default:
		System.out.println("WTF KA");
	return;
		}
		scan.close();
	}
}
