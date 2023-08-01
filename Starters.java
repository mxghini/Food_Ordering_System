package Food_Order;

import java.util.Scanner;

class Starters {
	
	Scanner sc = new Scanner(System.in);
	
	int choice,total=0;
	String menu_starter="";
	

	void Starter() {
		System.out.println("Select the Starter you would like to have.");
		System.out.println("By Choosing The Item Number.");
		System.out.println("1: Paneer Tikka --- Rs180/-");
		System.out.println("2: Aloo Tikka --- Rs150/-");
		System.out.println("3: Paneer Kebab --- Rs200/-");
		System.out.println("4: Chilli Paneer --- Rs190/-");
		System.out.println("5: Corn Cheese Balls --- Rs180/-");
		System.out.println("\nEnter the number of the Desired Items:"); 
		choice=sc.nextInt();
		switch(choice) {
		
		case 1 :
			System.out.println("Paneer Tikka --- Rs180/-");
			menu_starter+="Paneer Tikka --- Rs180/-";
			total+=180;
			break;
		
		case 2 :
			System.out.println("Aloo Tikka --- Rs150/-");
			menu_starter+="Aloo Tikka --- Rs150/-";
			total+=150;
			break;
		
		case 3 :
			System.out.println("Paneer Kebab --- Rs200/-");
			menu_starter+="Paneer Kebab --- Rs200/-";
			total+=200;
			break;
		
		case 4 :
			System.out.println("Chilli Paneer --- Rs190/-");
			menu_starter+="Chilli Paneer --- Rs190/-";
			total+=190;
			break;
		
		case 5 :
			System.out.println("Corn Cheese Balls --- Rs180/-");
			menu_starter+="Corn Cheese Balls --- Rs180/-";
			total+=180;
			break;
		}
		
		
	}
}
