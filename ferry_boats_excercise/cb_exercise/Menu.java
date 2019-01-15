package cb_exercise;


import java.util.Scanner;

public class Menu {
	
	public Menu() {}
	
	//FERRY CHOOSING MENU
	public Ferry FerryChoosingMenu(Ferry f1,Ferry f2,Ferry f3) {
		
		Ferry ferry=null;
		Scanner sc0=new Scanner(System.in);
		String str0="Please Choose a Ferry:"+"\n"
	               +"1. Myrtw"+"\n"
  	               +"2. Artemis"+"\n"
	               +"3. Eirini"+"\n"
	               +"Choose one of the above numbers:";
		
		System.out.println(str0);
		String userFerryChoice=sc0.next();
		while(!userFerryChoice.equals("1")&&!userFerryChoice.equals("2")
			&&!userFerryChoice.equals("3")) {
			System.out.println("ERROR: Invalid Input"+"\n"+str0+"\n");
			userFerryChoice=sc0.next();
			}
		System.out.println("\n");
		
		switch(userFerryChoice) {
	
		//1.0. Myrtw
		case "1":
			ferry=f1;
			break;
		
		//2.0. Artemis
		case "2":
			ferry=f2;
			break;
		
		//3.0. Eirini
		case "3":
			ferry=f3;
			break;
		
		}
		return ferry;
	}
	
	//ENTRY TYPE MENU
	public String EntryChoosingMenu() {
		
		Scanner sc1=new Scanner(System.in);
		String str1="Please choose the type of the entry"+"\n"
	               +"1. Passenger"+"\n"
			       +"2. Motorcycle"+"\n"
	               +"3. Car"+"\n"
			       +"4. Truck"+"\n"
	               +"5. Exit Entry type Menu"+"\n"
	               +"Type one of the above numbers:";
		
		System.out.println(str1);
		String userEntryMenuChoice=sc1.next();
	
	while(!userEntryMenuChoice.equals("1")&&!userEntryMenuChoice.equals("2")
		&&!userEntryMenuChoice.equals("3")&&!userEntryMenuChoice.equals("4")
		&&!userEntryMenuChoice.equals("5")) {
		System.out.println("ERROR: Invalid Input"+"\n"+str1);
		userEntryMenuChoice=sc1.next();
	}
	
	System.out.println("\n");
		
		return userEntryMenuChoice;
	}
	
	//FERRY MANIFEST METHOD
	public String FerryManifest(Ferry ferry) {
		String Manifesto=ferry.getFerryName()+" Ferry's Passenger current Capasity is: "+ferry.getpCapacity()+"\n"
	                    +ferry.getFerryName()+" Passenger Ticket Analysis:"+"\n"
                        +"Regular         : "+ferry.getNormal()+"\n"
                        +"College Student : "+ferry.getCollegeStudent()+"\n"
                        +"Disabled        : "+ferry.getHandicapped()+"\n"
                        +"Elderly         : "+ferry.getElder()+"\n"
                        +"Babies          : "+ferry.getBaby()+"\n"
                        +ferry.getFerryName()+" Ferry's Income is: "+ferry.getFincome()+"\n";
		return Manifesto;
	}
	
	//1. PASSENGER TYPE MENU
	public void PassengerMenu(Ferry ferry) { 
		
		Scanner sc2=new Scanner(System.in);
		
		String str1="Please Enter What type of ticket do you pay"+"\n"
	               +"1. Regular"+"\n"
     	           +"2. College Student"+"\n"
	               +"3. Handicapped"+"\n"
			       +"4. Elder"+"\n"
	               +"5. Baby"+"\n"
			       +"6. Cancel Passenger Entry"+"\n"
	               +"Choose one of the above numbers:";
		
		System.out.println(str1);
		String userPassengerTypeChoice=sc2.next();
		while(!userPassengerTypeChoice.equals("1")&&!userPassengerTypeChoice.equals("2")
			&&!userPassengerTypeChoice.equals("3")&&!userPassengerTypeChoice.equals("4")
			&&!userPassengerTypeChoice.equals("5")&&!userPassengerTypeChoice.equals("6")) {
			System.out.println("ERROR: Invalid Input"+"\n"+str1+"\n");
			userPassengerTypeChoice=sc2.next();
			}
		
		System.out.println("\n");
		
		switch(userPassengerTypeChoice) {
		
		
		//1.1. Normal Ticket
		case "1":
			if(ferry.getpCapacity()<1) {
				System.out.println(ferry.getFerryName()+" Ferry is full and can't take any more passengers"+"\n"
						          +ferry.getFerryName()+" earned "+ferry.getFincome()+"\n"
			                      +"Please choose another Ferry"+"\n");
				}
			else {
				Normal n=new Normal();
				ferry.setNormal(ferry.getNormal()+n.getUpkeep());
				ferry.setFincome(ferry.getFincome()+n.getPrice());
				ferry.setpCapacity(ferry.getpCapacity()-n.getUpkeep());
				System.out.println(FerryManifest(ferry));
				}
			break;
			
		//1.2. College Student Ticket
		case "2":
			if(ferry.getpCapacity()<1) {
				System.out.println(ferry.getFerryName()+" Ferry is full and can't take any more passengers"+"\n"
						          +ferry.getFerryName()+" earned "+ferry.getFincome()+"\n"
			                      +"Please choose another Ferry"+"\n");
				}
			else {
				CollegeStudent cs=new CollegeStudent();
				ferry.setCollegeStudent(ferry.getCollegeStudent()+cs.getUpkeep());
				ferry.setFincome(ferry.getFincome()+cs.getPrice());
				ferry.setpCapacity(ferry.getpCapacity()-cs.getUpkeep());
				System.out.println(FerryManifest(ferry));
				}
			break;
			
		//1.3. Handicapped Ticket
		case "3":
			if(ferry.getpCapacity()<1) {
				System.out.println(ferry.getFerryName()+" Ferry is full and can't take any more passengers"+"\n"
						          +ferry.getFerryName()+" earned "+ferry.getFincome()+"\n"
			                      +"Please choose another Ferry"+"\n");
				}
			else {
				Handicapped h=new Handicapped();
				ferry.setHandicapped(ferry.getHandicapped()+h.getUpkeep());
				ferry.setFincome(ferry.getFincome()+h.getPrice());
				ferry.setpCapacity(ferry.getpCapacity()-h.getUpkeep());
				System.out.println(FerryManifest(ferry));
				}
			break;
			
		//1.4. Elder Ticket
		case "4":
			if(ferry.getpCapacity()<1) {
				System.out.println(ferry.getFerryName()+" Ferry is full and can't take any more passengers"+"\n"
			                      +ferry.getFerryName()+" earned "+ferry.getFincome()+"\n"
				   	              +"Please choose another Ferry"+"\n");
				}
			else {
				Elder e=new Elder();
				ferry.setElder(ferry.getElder()+e.getUpkeep());
				ferry.setFincome(ferry.getFincome()+e.getPrice());
				ferry.setpCapacity(ferry.getpCapacity()-e.getUpkeep());
				System.out.println(FerryManifest(ferry));
			}
			break;
			
		//1.5. Baby Ticket
		case "5":
			if(ferry.getpCapacity()<1) {
				System.out.println(ferry.getFerryName()+" Ferry is full and can't take any more passengers"+"\n"
						          +ferry.getFerryName()+" earned "+ferry.getFincome()+"\n"
			                      +"Please choose another Ferry"+"\n");
				}
			else {
				Baby b=new Baby();
				ferry.setBaby(ferry.getBaby()+b.getUpkeep());
				ferry.setFincome(ferry.getFincome()+b.getPrice());
				ferry.setpCapacity(ferry.getpCapacity()-b.getUpkeep());
				System.out.println(FerryManifest(ferry));
				}
			break;
		
		//1.6 Cancel Passenger Entry
		case "6":
			System.out.println("Canceling Passenger Entry"+"\n"+"Exiting Passenger Menu..."+"\n");
			break;
		}
	}
	
	//2. MOTORCYCLE MENU
	public void MotorcycleMenu(Ferry ferry) {
		
		Scanner sc3=new Scanner(System.in);
	
		String str2="Please Enter How many passengers are with the motorcycle: "+"\n"
	               +"1. One Passenger"+"\n"
		           +"2. Two Passengers"+"\n"
	               +"3. Cancel Motorcycle Entry";
		System.out.println(str2);
		String userMotorcyclePassengerChoice=sc3.next();
		while(!userMotorcyclePassengerChoice.equals("1")&&!userMotorcyclePassengerChoice.equals("2")
				&&!userMotorcyclePassengerChoice.equals("3")) {
				System.out.println("ERROR: Invalid Input"+"\n"+str2+"\n");
				userMotorcyclePassengerChoice=sc3.next();
			}
		
		switch(userMotorcyclePassengerChoice) {
		
		//2.1. One Passenger
		case "1":
			PassengerMenu(ferry);
			break;
		
		//2. Two Passengers
		case "2":
			PassengerMenu(ferry);
			break;
		
		//3. Cancel Motorcycle Entry
		case "3":
			System.out.println("Canceling Motorcycle Entry"+"\n"+"Exiting Motorcycle Menu..."+"\n");
			break;
			}
	}
	
	
}
	

