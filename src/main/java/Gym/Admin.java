package Gym;
/**
 *
 * @author abdallah
 */
import java.util.Scanner;
import java.util.ArrayList;
import EQ_GYM.Equipment;
import java.util.Collections;

public class Admin extends Person{
    
    
    Admin(){
        
    }
    
    public void addCoach(Gym gym, Coach coach){
        gym.listOfCoaches.add(new Coach(coach));
    }
    
    public void editCoach(Gym gym, int coachID){
        for(Coach coach: gym.listOfCoaches){
            if(coach.getID() == coachID){
                
                break;
            }
        }
    }
    
    public void deleteCoach(Coach[] coaches){
        
    }
    
    public void addCustomer(Gym gym, Customer customer){
            gym.listOfCustomers.add(new Customer(customer));
    }
    
    public void editCustomer(Customer customer){
        
    }
    
    public void deleteCustomer(Customer[] customers){
        
    }
    
    public void addEquipment(Gym gym, Equipment equipment){
        
    }
    
    public void editEquipment(Equipment equipment){
        
    }
    
    public void deleteEquipment(Equipment[] equipments){
        
    }
    
    public void showSubscriptionHistory(Customer customer){
        
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
    public void displayCoachCustomers(Coach coach){
        for(Customer customer: coach.List_of_customers){
            if(customer.subscription.getCoach_id() == coach.getID()){
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
    
    public void displaySortedCoaches(Gym gym){
        ArrayList<Coach> sCoaches = new ArrayList<>(gym.listOfCoaches);
        Collections.sort(sCoaches);
        //
        for(Coach coach: sCoaches){
            coach.display();
        }
    }

    public String getName() {
        return Name;
    }

    public String getE_mail() {
        return E_mail;
    }
    
       
    void display(){
        System.out.println("Admin Info");
        System.out.println("Name: "+Name);
        System.out.println("ID:"+this.getID());
        System.out.println("Gender: " + Gender);
        System.out.println("Phone_number: "+Phone_number);
    }
    
    
}
