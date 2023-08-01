package Food_Order;

import java.util.Scanner;

class Drinks {
	
	Scanner sc = new Scanner(System.in);
	
	int choice, total=0;
	String menu_drink="";
	
	void drink() {
		//Options for drinks Items.
		System.out.println("Select the Drinks item you would like to have.");
		System.out.println("By Choosing The Item Number");
		System.out.println("1: Virgin Mogito --- Rs180/-");
		System.out.println("2: Mogito --- Rs150/-");
		System.out.println("3: Gin --- Rs200/-");
		System.out.println("4: Dirty Martini --- Rs280/-");
		System.out.println("5: Tequila Sunrise --- Rs180/-");
		System.out.println("\nEnter the number of the Desired Items:"); 
		choice=sc.nextInt();
		switch(choice) {
		case 1 :
			System.out.println("Virgin Mogito --- Rs180/-");
			menu_drink="Virgin Mojito --- Rs180/-";
			total+=180;
			break;
			
		case 2 :
			System.out.println("Mogito --- Rs150/-");
			menu_drink="Mojito --- Rs150/-";
			total+=150;
			break;
		
		case 3 :
			System.out.println("Gin --- Rs200/-");
			menu_drink="Gin --- Rs200/-";
			total+=200;
			break;
		
		case 4 :
			System.out.println("Dirty Martini --- Rs280/-");
			menu_drink="Dirty Martini --- Rs280/-";
			total+=280;
			break;

		case 5 :
			System.out.println("Tequila Sunrise --- Rs180/-");
			menu_drink="Tequila Sunrise --- Rs180/-";
			total+=180;
			break;
		}
	}
	
}
