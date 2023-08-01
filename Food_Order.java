package Food_Order;

import java.util.Scanner;

public class Food_Order {
	
	//creating objects
	static Starters st= new Starters();
	static Main_Courses mc= new Main_Courses();
	static Desserts des= new Desserts();
	static Drinks dr= new Drinks();
	

	public static void main(String[] args) {
		// TODO Auto-generated method 
		
		Scanner sc = new Scanner(System.in);
		
		int item, choice, total=0;
		String menu="";
			System.out.println("\t Welcome! To Kathiyawadi :)");	//top most part 
			
			do {
				System.out.println("\nSelect The Items From Menu");
				System.out.println("By Choosing The Number\n");
				System.out.println("1: Starter");
				System.out.println("2: Main Course");
				System.out.println("3: Desserts");
				System.out.println("4: Drinks");
				System.out.println("\nEnter the number of the Desired Items:"); 
				item=sc.nextInt();
				switch(item) {
				case 1:
				{
					st.Starter();
					menu+=st.menu_starter+"\n";
					total+=st.total;
				}
				break;
				
				case 2:
				{
					mc.Main_Course();
					menu+=mc.Menu_mc+"\n";
					total+=mc.total;
				}
				break;
				
				case 3:
				{
					des.Dessert();
					menu+=des.dessert+"\n";
					total+=des.total;
				}
				break;
				
				case 4:
				{
					dr.drink();
					menu+=dr.menu_drink+"\n";
					total+=dr.total;
				}
				break;
				
				default:
				{
					System.out.println("Invalid Option \n");
				}
				break;
							
				}
				System.out.println("Do you want some more item\n");
				System.out.println("If yes then press 1, else 0 for no");
				
				choice=sc.nextInt();
				
			}while(choice==1);
			
			
			System.out.println("Your Order Is Here !\n");
			System.out.println(menu);
			System.out.println("And Your Total Bill is Rs"+total+"/-");
			System.out.println("Thank You! Please Visit Us Again :)");
			
		
		
	}




}
		