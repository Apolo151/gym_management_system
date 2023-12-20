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
        
    
    public Admin(String Name , int ID , String Gender ,String Address,
                 int Phone_number, String E_mail){
        super(Name, ID, Gender, Address, Phone_number, E_mail);
    }

    public Date getUserDate(Scanner input){
        int day, month, year;
        System.out.println("Enter the Date you want to specify: (a single number for each value, 0 for any)");
        System.out.println("Day: ");
        day = input.nextInt();
        System.out.println("Month: ");
        month = input.nextInt();
        System.out.println("Year: ");
        year = input.nextInt();
        //
        return (new Date(day, month, year));
    }
    
    private boolean existCheck(int coachID, Coach coach){
        for (Coach c: Gym.listOfCoaches) {
            if (c.getID() == coachID) {
                coach = c;
                return true;
            }
        }
        //
        return false;
    }
        
    private boolean existCheck(int customerID, Customer customer){
        for (Customer c: Gym.listOfCustomers) {
            if (c.getID() == customerID) {
                customer = c;
                return true;
            }
        }
        //
        return false;
    }

    public void addCoach(Scanner input) {
        System.out.println("Enter the Coach's Name:");
        String name = input.nextLine();

        System.out.println("Enter the Coach's ID:");
        int id = input.nextInt();

        System.out.println("Enter the Coach's Gender:");
        String gender = input.nextLine();

        System.out.println("Enter the Coach's Address:");
        String address = input.nextLine();

        System.out.println("Enter the Coach's Phone Number:");
        int phoneNumber = input.nextInt();

        System.out.println("Enter the Coach's Email:");
        String email = input.next();

        System.out.println("Enter the Coach's Working Hours:");
        int workingHours = input.nextInt();

        //
        Gym.listOfCoaches.add(new Coach(name, id, gender, address, phoneNumber, email, workingHours));
        System.out.println("Coach added successfully!");
    }


    // Edit Coach Info
    public void editCoach(int coachID, Scanner input) {
        Coach coachEdit = null;
        if (!existCheck(coachID, coachEdit)) {
            System.out.println("No Coach was found with the provided ID");
            return;
        }
        //
        System.out.println("Choose the information to edit:");
        System.out.println("1. Name");
        System.out.println("2. Gender");
        System.out.println("3. Address");
        System.out.println("4. Phone Number");
        System.out.println("5. Email");
        System.out.println("0. Cancel");

        int choice = input.nextInt();
        input.nextLine();
        //
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

    
    public void deleteCoach(int coachID){
        Gym.listOfCustomers.removeIf(coach -> coach.getID() == coachID);
    }

    public void addCustomer(Scanner input) {
        System.out.println("Enter the Customer's Name:");
        String name = input.nextLine();

        System.out.println("Enter the Customer's ID:");
        int id = input.nextInt();

        System.out.println("Enter the Customer's Gender:");
        String gender = input.nextLine();

        System.out.println("Enter the Customer's Address:");
        String address = input.nextLine();

        System.out.println("Enter the Customer's Phone Number:");
        int phoneNumber = input.nextInt();

        System.out.println("Enter the Customer's Email:");
        String email = input.next();

        System.out.println("Enter the ID of the Coach for the Customer:");
        int coachId = input.nextInt();

        // Find the coach with the specified ID and add the customer to their list
        boolean coachIdCorrect=false;
        for (Coach coach : Gym.listOfCoaches) {
            if (coach.getID() == coachId) {
                // Add the new customer to the list of Gym customers
                Gym.listOfCustomers.add(new Customer(name, id, gender, address, phoneNumber, email, coachId));
                // Add the new customer to the list of Coach customers
                coach.List_of_customers.add(Gym.listOfCustomers.get(Gym.listOfCustomers.toArray().length-1));
                coachIdCorrect=true;
                break;
            }
        }
        if(!coachIdCorrect){
            System.out.println("No Coach exists with the specified Coach ID");
            return;
        }

        System.out.println("Customer added successfully!");
    }

    // Edit Customer Info
    public void editCustomer(int customerID, Scanner input){
        Customer customerEdit = null;
        if(!existCheck(customerID, customerEdit)){
            System.out.println("No Customer was found with the provided ID");
            return;
        }
        //
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
        //
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
    
    public void deleteCustomer(int customerID){
        Gym.listOfCustomers.removeIf(customer -> customer.getID() == customerID);
    }

    
    public void addEquipment(EqType type, Equipment equipment){
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
        Gym.sportsEquipment.add(equipment);
    }
    
    public void editEquipment(Equipment equipment){
        
    }
    
    public void deleteEquipment(int equipmentCode){
        Gym.sportsEquipment.removeIf(equipment -> equipment.getCode() == equipmentCode);
    }
    
    
    public void showSubscriptionHistory(int customerID){
        for(Subscription sub: Gym.listOfSubscriptions){
            if(sub.getCostumer_id() == customerID){
                sub.getMembershipPlan().display();
            }
        }
    }
    
    // Display all the customers that subscribed to the gym in a given month/day
    public void displayCustomersInMonthOrDay(Date date){
        Scanner input = new Scanner (System.in);
        String c;
        System.out.println("Month or Day? (enter m or d)");
        c = input.nextLine();
        if(c.equals("m")){
            for(Subscription sub : Gym.listOfSubscriptions){
                if(sub.getMembershipPlan().start_date.month == date.month){
                   for(Customer customer: Gym.listOfCustomers){
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
            for(Subscription sub : Gym.listOfSubscriptions){
                if(sub.getMembershipPlan().start_date.day == date.day){
                   for(Customer customer: Gym.listOfCustomers){
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
    public void displayCoachCustomers(int coachID){
        for(Customer customer: Gym.listOfCustomers){
            if(customer.subscription.getCoach_id() == coachID){
                customer.display();
            }
        }
    }
    
    // Display the GYM income in a given month
    public void displayGymIncome(Date date){
        double income = 0;
        for(Subscription sub: Gym.listOfSubscriptions){
            MembershipPlan mem = sub.getMembershipPlan();
            if(mem.start_date.month == date.month && mem.start_date.year == date.year){
                income+= mem.discount_price(mem.number_of_plan);
            }
        }
    }
    
    // Display Gym Coaches, sorted descendingly according to their number of customers
    public void displaySortedCoaches(){
        ArrayList<Coach> sCoaches = new ArrayList<>(Gym.listOfCoaches);
        Collections.sort(sCoaches);
        //
        for(Coach coach: sCoaches){
            coach.display();
        }
    }

    public void readScenario(Scanner input) {
        while (true) {
            System.out.println("Choose an action:");
            System.out.println("1. Add/Edit/Delete Coaches, Equipment, and Customers");
            System.out.println("2. Show Subscription History for a Customer");
            System.out.println("3. Display Customers Subscribed in a Month/Day");
            System.out.println("4. Display Customers of a Specific Coach");
            System.out.println("5. Display Gym Income in a Given Month");
            System.out.println("6. Display Coaches Sorted by Assigned Customers");
            System.out.println("0. Exit");

            int choice = input.nextInt();
            input.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    manageObjects(input);
                    break;
                case 2:
                    System.out.println("Enter the Customer's ID: ");
                    int cuID = input.nextInt();
                    showSubscriptionHistory(cuID);
                    break;
                case 3:
                    displayCustomersInMonthOrDay(getUserDate(input));
                    break;
                case 4:
                    System.out.println("Enter the Coach's ID: ");
                    int coID = input.nextInt();
                    displayCoachCustomers(coID);
                    break;
                case 5:
                    displayGymIncome(getUserDate(input));
                    break;
                case 6:
                    displaySortedCoaches();
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

    private void manageObjects(Scanner input) {
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

        int choice = input.nextInt();
        input.nextLine(); // Consume the newline character

        switch (choice) {
            case 1:
                System.out.println("En");
                addCoach(input);
                break;
            case 2:
                System.out.println("Enter the Coaches ID: ");
                editCoach(input.nextInt(), input);
                break;
            case 3:
                System.out.println("Enter the Coaches ID: ");
                deleteCoach(input.nextInt());
                break;
            case 4:
                addCustomer(input);
                break;
            case 5:
                System.out.println("Enter the Customer's ID: ");
                editCustomer(input.nextInt(), input);
                break;
            case 6:
                System.out.println("Enter the Customer's ID: ");
                deleteCustomer(input.nextInt());
                break;
            case 7:
                // TODO addEquipment();
                break;
            case 8:
                // TODO editEquipment();
                break;
            case 9:
                System.out.println("Enter the Equipment's Code: ");
                deleteEquipment(input.nextInt());
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
