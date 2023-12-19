package Gym;
import EQ_GYM.*;
/**
 *
 * @author abdallah
 */
import java.util.Scanner;
import java.util.ArrayList;
import EQ_GYM.Equipment;
import java.util.Collections;

public class Admin extends Person{
    
    public enum EqType {
        BIKE,
        DUMBELLS,
        TREADMILL,
        LEGPRESS,
        WEIGHT_BENCH
    }
    
    public enum check {
        COACH,
        CUSTOMER
    }
        
    
    public Admin(){
        super();
    }
    
    private boolean existCheck(Gym gym, int ID, Coach coach){
        for (Coach c: gym.listOfCoaches) {
            if (c.getID() == ID) {
                coach = c;
                return true;
            }
        }
        //
        return false;
    }
        
    private boolean existCheck(Gym gym, int ID, Customer customer){
        for (Customer c: gym.listOfCustomers) {
            if (c.getID() == ID) {
                customer = c;
                return true;
            }
        }
        //
        return false;
    }
    
    public void addCoach(Gym gym, Coach coach){
        gym.listOfCoaches.add(new Coach(coach));
    }

    // Edit Coach Info
    public void editCoach(Gym gym, int coachID) {
        Coach coachEdit = null;

        if (!existCheck(gym, coachID, coachEdit)) {
            System.out.println("No Coach was found with the provided ID");
            return;
        }

        Scanner input = new Scanner(System.in);

        System.out.println("Choose the information to edit:");
        System.out.println("1. Name");
        System.out.println("2. Gender");
        System.out.println("3. Address");
        System.out.println("4. Phone Number");
        System.out.println("5. Email");
        System.out.println("0. Cancel");

        int choice = input.nextInt();
        input.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Enter new name: ");
                coachEdit.setName(input.nextLine());
                break;
            case 2:
                System.out.print("Enter new gender: ");
                coachEdit.setGender(input.nextLine());
                break;
            case 3:
                System.out.print("Enter new address: ");
                coachEdit.setAdress(input.nextLine());
                break;
            case 4:
                System.out.print("Enter new phone number: ");
                coachEdit.setPhone_number(input.nextInt());
                break;
            case 5:
                System.out.print("Enter new email: ");
                coachEdit.setE_mail(input.nextLine());
                break;
            case 0:
                System.out.println("Editing canceled.");
                return;
            default:
                System.out.println("Invalid choice. Editing canceled.");
                return;
        }

        System.out.println("Coach information updated successfully.");
    }

    
    public void deleteCoach(Gym gym, int coachID){
        gym.listOfCustomers.removeIf(coach -> coach.getID() == coachID);
    }
    
    public void addCustomer(Gym gym, Customer customer){
        gym.listOfCustomers.add(new Customer(customer));
    }

    // Edit Customer Info
    public void editCustomer(Gym gym, int customerID){
        Customer customerEdit = null;
        //
        if(!existCheck(gym, customerID, customerEdit)){
            System.out.println("No Customer was found with the provided ID");
            return;
        }
        
        Scanner input = new Scanner(System.in);

        System.out.println("Choose the information to edit:");
        System.out.println("1. Name");
        System.out.println("2. Gender");
        System.out.println("3. Address");
        System.out.println("4. Phone Number");
        System.out.println("5. Email");
        System.out.println("6. Coach ID");
        System.out.println("0. Cancel");

        int choice = input.nextInt();
        input.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Enter new name: ");
                customerEdit.setName(input.nextLine());
                break;
            case 2:
                System.out.print("Enter new gender: ");
                customerEdit.setGender(input.nextLine());
                break;
            case 3:
                System.out.print("Enter new address: ");
                customerEdit.setAdress(input.nextLine());
                break;
            case 4:
                System.out.print("Enter new phone number: ");
                customerEdit.Phone_number = input.nextInt();
                break;
            case 5:
                System.out.print("Enter new email: ");
                customerEdit.E_mail = input.nextLine();
                break;
            case 6:
                System.out.print("Enter new coach ID: ");
                customerEdit.coachID = input.nextInt();
                break;
            case 0:
                System.out.println("Editing canceled.");
                return;
            default:
                System.out.println("Invalid choice. Editing canceled.");
                return;
        }

        System.out.println("Customer information updated successfully.");
    }
    
    public void deleteCustomer(Gym gym, int customerID){
        gym.listOfCustomers.removeIf(customer -> customer.getID() == customerID);
    }

    
    public void addEquipment(Gym gym, EqType type, Equipment equipment){
        // Assuming Equipment class has a constructor that takes a name and quantity
        switch (type) {
            case BIKE:
                equipment = new Bike();
                break;
            case DUMBELLS:
                equipment = new Dumbbels();
                break;
            case TREADMILL:
                equipment = new Treadmill();
                break;
            case LEGPRESS:
                equipment = new Leg_Press();
                break;
            case WEIGHT_BENCH:
                equipment = new Weight_Bench();
                break;
            // Add more cases for other equipment types if needed
        }

        // Add the equipment to the gym's list
        gym.sportsEquipment.add(equipment);
    }
    
    public void editEquipment(Gym gym, Equipment equipment){
        
    }
    
    public void deleteEquipment(Gym gym, int equipmentCode){
        gym.sportsEquipment.removeIf(equipment -> equipment.getCode() == equipmentCode);
    }
    
    
    public void showSubscriptionHistory(Gym gym, int customerID){
        for(Subscription sub: gym.listOfSubscriptions){
            if(sub.getCostumer_id() == customerID){
                sub.getMembershipPlan().display();
            }
        }
    }
    
    // Display all the customers that subscribed to the gym in a given month/day
    public void displayGymCustomers(Gym gym, Date date){
        Scanner input = new Scanner (System.in);
        String c;
        System.out.println("Month or Day? (enter m or d)");
        c = input.nextLine();
        if(c.equals('m')){
            for(Subscription sub : gym.listOfSubscriptions){
                if(sub.getMembershipPlan().start_date.month == date.month){
                   for(Customer customer: gym.listOfCustomers){
                       if(customer.Name.equals(sub.getMembershipPlan().member_name)){
                           customer.display();
                           break;
                       }
                   } 
                }
            }
        }
        //
        else{
            for(Subscription sub : gym.listOfSubscriptions){
                if(sub.getMembershipPlan().start_date.day == date.day){
                   for(Customer customer: gym.listOfCustomers){
                       if(customer.Name.equals(sub.getMembershipPlan().member_name)){
                           customer.display();
                           break;
                       }
                   } 
                }

            }
        }
        
    }
    
    // Display all the customers of a specific coach
    public void displayCoachCustomers(Coach coachID){
        for(Customer customer: coach.List_of_customers){
            if(customer.subscription.getCoach_id() == coachID){
                customer.display();
            }
        }
    }
    
    // Display the GYM income in a given month
    public void displayGymIncome(Gym gym, Date date){
        double income = 0;
        for(Subscription sub: gym.listOfSubscriptions){
            MembershipPlan mem = sub.getMembershipPlan();
            if(mem.start_date.month == date.month && mem.start_date.year == date.year){
                income+= mem.discount_price(mem.number_of_plan);
            }
        }
    }
    
    // Display Gym Coaches, sorted descendingly according to their number of customers
    public void displaySortedCoaches(Gym gym){
        ArrayList<Coach> sCoaches = new ArrayList<>(gym.listOfCoaches);
        Collections.sort(sCoaches);
        //
        for(Coach coach: sCoaches){
            coach.display();
        }
    }
    
    public void readScenario(Gym gym) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an action:");
            System.out.println("1. Add/Edit/Delete Coaches, Equipment, and Customers");
            System.out.println("2. Show Subscription History for a Customer");
            System.out.println("3. Display Customers Subscribed in a Month/Day");
            System.out.println("4. Display Customers of a Specific Coach");
            System.out.println("5. Display Gym Income in a Given Month");
            System.out.println("6. Display Coaches Sorted by Assigned Customers");
            System.out.println("0. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    manageEntities(gym);
                    break;
                case 2:
                    showSubscriptionHistory(gym);
                    break;
                case 3:
                    displayCustomersInMonthOrDay(gym);
                    break;
                case 4:
                    displayCoachCustomers(gym);
                    break;
                case 5:
                    displayGymIncome(gym, );
                    break;
                case 6:
                    displaySortedCoaches(gym);
                    break;
                case 0:
                    System.out.println("Exiting the admin panel.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    private void manageEntities(Gym gym) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an action:");
        System.out.println("1. Add Coach");
        System.out.println("2. Edit Coach");
        System.out.println("3. Delete Coach");
        System.out.println("4. Add Customer");
        System.out.println("5. Edit Customer");
        System.out.println("6. Delete Customer");
        System.out.println("7. Add Equipment");
        System.out.println("8. Edit Equipment");
        System.out.println("9. Delete Equipment");
        System.out.println("0. Back");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        switch (choice) {
            case 1:
                addCoach(gym);
                break;
            case 2:
                editCoach(gym);
                break;
            case 3:
                deleteCoach(gym);
                break;
            case 4:
                addCustomer(gym);
                break;
            case 5:
                editCustomer(gym);
                break;
            case 6:
                deleteCustomer(gym);
                break;
            case 7:
                addEquipment(gym);
                break;
            case 8:
                editEquipment(gym);
                break;
            case 9:
                deleteEquipment(gym);
                break;
            case 0:
                return;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }
    }

    
       
    public void display(){
        System.out.println("Admin Info");
        System.out.println("Name: "+Name);
        System.out.println("ID:"+this.getID());
        System.out.println("Gender: " + Gender);
        System.out.println("Phone_number: "+ Phone_number);
    }
    
    
}
