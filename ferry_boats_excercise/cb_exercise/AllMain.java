package cb_exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class AllMain {
	
	public static void main(String[] args) {
		
		String answer=null;
		Ferry Myrtw=new Ferry("Myrtw",50,4,30,300,0,0,0,0,0,0);
		Ferry Artemis=new Ferry("Artemis",40,4,20,220,0,0,0,0,0,0);
		Ferry Eirini=new Ferry("Eirini",37,3,14,170,0,0,0,0,0,0);
		Ferry f=new Ferry();

		Scanner sc=new Scanner(System.in);
		do {
			Menu menu=new Menu();
			f=menu.FerryChoosingMenu(Myrtw,Artemis,Eirini);
			String EntryType=menu.EntryChoosingMenu();
			
			switch(EntryType) {
			
			//1.0. Passenger Menu
			case "1":
				menu.PassengerMenu(f);
				break;
				
			//2.0 Motorcycle Menu	
			case "2":
				menu.MotorcycleMenu(f);
				break;
				
			case "3":
				
				break;
				
			case "4":
				
				break;
			
			//5. Exit Entry type Menu
			case "5":
				System.out.println("Canceling Entry"+"\n"+"Exiting Entry Menu..."+"\n");
				break;
			
			}
			
			
			System.out.println("Do you want to continue inputing (y/n): ");
			answer=sc.next();
			System.out.println("\n");
			}while(!answer.equalsIgnoreCase("n"));
			
			
		/*//2.0 Motorcycle Menu	
		case "2":
			String str3="Please Enter How many passengers are with the motorcycle: "+"\n"
		               +"1. One Passenger"+"\n"
			           +"2. Two Passengers"+"\n"
		               +"3. Cancel Motorcycle Entry";
			System.out.println(str3);
			String userThirdChoice=sc.next();
			while(!userThirdChoice.equals("1")&&!userThirdChoice.equals("2")
					&&!userThirdChoice.equals("3")) {
					System.out.println("ERROR: Invalid Input"+"\n"+str3+"\n");
					userThirdChoice=sc.next();
				}
			
			switch(userThirdChoice) {
			
			//2.1. One Passenger
			case "1":
				break;
			
			//2. Two Passengers
			case "2":
				if(Mirto.getpCapacity()<0) {
					System.out.println("Mirto Ferry is full and can't take any more passengers"+"\n"
					                  +"Please choose another Ferry"+"\n");
					}
				else {
					Baby b=new Baby();
					babyAll.add(b);
					incomeAll.add(b.getPrice());
					Mirto.setpCapacity(Mirto.getpCapacity()-1);
					System.out.println("Mirto Ferry's Passenger Capasity is: "+Mirto.getpCapacity()+"\n");
				}
				break;
			
			//3. Cancel Motorcycle Entry
			case "3":
				System.out.println("Canceling Motorcycle Entry"+"\n"+"Exiting Motorcycle Menu..."+"\n");
				break;
				
			
			
		
		}*/
		
			
		
		
		}
	}
	
	

