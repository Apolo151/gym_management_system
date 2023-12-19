package Gym;

import EQ_GYM.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Customer extends Person {
    Gym gym;
    Subscription subscription;
    int coachID;
    ArrayList<InBody> List_of_inbodies = new ArrayList<>();

    public Customer(int coachID, Gym gym){
        super();
        this.coachID = coachID;
        this.gym = gym;
    }
    
    public Customer( String Name , int ID , String Gender ,String Adress,
            int Phone_number, String E_mail, int coachID, Gym gym, Subscription sub){
        super(Name, ID, Gender, Adress, Phone_number, E_mail);
        this.coachID = coachID;
        this.gym = gym;
        this.subscription = sub;
    }
    
    public Customer(Customer customer){
        super(customer.Name, customer.getID(), customer.Gender, customer.getAdress(),
                customer.Phone_number, customer.E_mail);
        this.coachID = customer.coachID;
        this.gym = customer.gym;
        this.subscription = customer.subscription;
    }
    
      
    void display (){
        System.out.println("Name: "+Name);
        System.out.println("ID:"+this.getID());
        System.out.println("Gender: "+Gender);
        System.out.println("Adress: "+this.getAdress());
        System.out.println("Phone_number: "+Phone_number);
        System.out.println("E_mail: "+E_mail);
        //
        for(InBody in : this.List_of_inbodies){
            in.Display();
        }
    }

    void read (){
        Scanner input = new Scanner (System.in);
        this.read_data();
        System.out.println("How many inbodies do you have? ");
        int number_of_inbodys=input.nextInt();
        for (int i = 0 ,j =1 ; i > number_of_inbodys ;i++,j++){
            System.out.print("Please Enter your "+ j +" inbody");
        }
    }
    
    // Display coach info
    void displayCoachInfo(){
        this.gym.listOfCoaches.get(this.coachID).display();
    }
    
    // Display all Gym Equipment
    void displayGymEquipment(){
        for(Equipment eq : this.gym.sportsEquipment){
            eq.disp();
        }
    }
    
    // Display membership plan details
    void displayMembershipPlan(){
        this.subscription.getMembershipPlan().display();
    }
    
    // Display inbody info at a specific date
    void displayInBodyAtDate(java.util.Date date){
        for(InBody in : this.List_of_inbodies){
            if(in.date == date){
                in.Display();
            }
        }
    }
    
    // Display how many kilos need to be reduced according to his body
    void displayHowManyKilosToReduce(){
        if(this.List_of_inbodies.size() == 0){
            System.out.println("You must perform an Inbody to be able to find how many kilos you need to reduce.");
            return;
        }
        //
        this.List_of_inbodies.get(this.List_of_inbodies.size()).howManyKilosToReduce();
    }

    public void setGym(Gym gym) {
        this.gym = gym;
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }

    public void setCoachID(int coachID) {
        this.coachID = coachID;
    }

    public void setList_of_inbodies(ArrayList<InBody> List_of_inbodies) {
        this.List_of_inbodies = List_of_inbodies;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public void setPhone_number(int Phone_number) {
        this.Phone_number = Phone_number;
    }

    public void setE_mail(String E_mail) {
        this.E_mail = E_mail;
    }

    public void readScenario() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nCustomer Functionalities: (Choose the Corresponding number)");
            System.out.println("1. Get his coach info (Name, Phone number, working hours)");
            System.out.println("2. Display all the Gym Equipment.");
            System.out.println("3. Display the customer's membership plan details.");
            System.out.println("4. Display the in-body information at a specific date.");
            System.out.println("5. Display how many kilos need to be reduced according to his body.");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            System.out.println("");

            switch (choice) {
                case 1:
                    System.out.println("\nCoach Info:");
                    displayCoachInfo();
                    break;
                case 2:
                    System.out.println("\nList of Gym Equipment:");
                    displayGymEquipment();
                    break;
                case 3:
                    System.out.println("\nMembership Plan Details:");
                    displayMembershipPlan();
                    break;
                case 4:
                    System.out.print("\nEnter the date (format: yyyy-MM-dd) to display in-body information: ");
                    String dateString = scanner.next();
                    try {
                        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                        Date date = sdf.parse(dateString);
                        System.out.println("\nIn-Body Information at " + dateString + ":");
                        displayInBodyAtDate(date);
                    } catch (ParseException e) {
                        System.out.println("Invalid date format. Please enter a valid date.");
                    }
                    break;
                case 5:
                    System.out.println("\nHow Many Kilos Need to be Reduced:");
                    displayHowManyKilosToReduce();
                    break;
                case 0:
                    System.out.println("Exiting Customer Functionalities.");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
