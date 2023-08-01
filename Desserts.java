package Food_Order;

import java.util.Scanner;

class Desserts {
	
	Scanner sc= new Scanner(System.in);
	
	int choice, total=0;
	String dessert="";

	void Dessert() {
		System.out.println("Select the Dessert you would like to have.");
		System.out.println("By Choosing The Item Number");
		System.out.println("1: Choco Lava Cake --- Rs80/-");
		System.out.println("2: Hazelnut Brownies --- Rs120/-");
		System.out.println("3: Cheesecake Squares --- Rs150/-");
		System.out.println("4: Lemon Sponge Cake --- Rs100/-");
		System.out.println("5: Butterscotch Pudding --- Rs150/-");
		System.out.println("\nEnter the number of the Desired Items:"); 
		choice=sc.nextInt();
		switch(choice) {
		
		case 1:
			System.out.println("Choco Lava Cake --- Rs80/-");
			dessert+="Choco Lava Cake --- Rs80/-";
			total+=80;
			break;
		
		case 2:
			System.out.println("Hazelnut Brownies --- Rs120/-");
			dessert+="Hazelnut Brownies --- Rs120/-";
			total+=120;
			break;
		
		case 3:
			System.out.println("Cheesecake Squares --- Rs150/-");
			dessert+="Cheesecake Squares --- Rs150/-";
			total+=150;
			break;
		
		case 4:
			System.out.println("Lemon Sponge Cake --- Rs100/-");
			dessert+="Lemon Sponge Cake --- Rs100/-";
			total+=100;
			break;
		
		case 5:
			System.out.println("Butterscotch Pudding --- Rs150/-");
			dessert+="Butterscotch Pudding --- Rs150/-";
			total+=150;
			break;
		}
	}
}
