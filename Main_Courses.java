package Food_Order;

import java.util.Scanner;

class Main_Courses {
	
	Scanner sc= new Scanner(System.in);
	
	int choice, total=0;
	String Menu_mc="";

	void Main_Course() {
		System.out.println("Select the Main Course you would like to have.");
		System.out.println("By Choosing The Item Number");
		System.out.println("1: Matar Paneer --- Rs150/-");
		System.out.println("2: Sahi Paneer --- Rs200/-");
		System.out.println("3: Veg Kolhapuri --- Rs150/-");
		System.out.println("4: Dal Makhani & Rice --- Rs200/-");
		System.out.println("5: Butter Paneer Masala --- Rs190/-");
		System.out.println("\nEnter the number of the Desired Items:"); 
		choice=sc.nextInt();
		
		switch(choice) {
		
		case 1:
			System.out.println("Matar Paneer --- Rs150/-");
			Menu_mc+="Matar Paneer --- Rs150/-";
			total+=150;
			break;
		
		case 2:
			System.out.println("Sahi Paneer --- Rs200/-");
			Menu_mc+="Sahi Paneer --- Rs200/-";
			total+=200;
			break;
		
		case 3:
			System.out.println("Veg Kolhapuri --- Rs150/-");
			Menu_mc+="Veg Kolhapuri --- Rs150/-";
			total+=150;
			break;
		
		case 4:
			System.out.println("Dal Makhani & Rice --- Rs200/-");
			Menu_mc+="Matar Paneer --- Rs200/-";
			total+=200;
			break;
		
		case 5:
			System.out.println("Butter Paneer Masala --- Rs190/-");
			Menu_mc+="Butter Paneer Masala --- Rs190/-";
			total+=190;
			break;
		}
	}
}
