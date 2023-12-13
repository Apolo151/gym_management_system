/**
 *
 * @author abdallah
 */
import java.util.Scanner;

import EQ_GYM.Equipment;

public class Admin extends Person{
    
    
    Admin(){
        
    }
    
    public void addCoach(Gym gym, Coach coach){
        
    }
    
    public void editCoach(Coach coach){
        
    }
    
    public void deleteCoach(Coach[] coaches){
        
    }
    
    public void addCustomer(Gym gym, Customer customer){
        
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
    
    public void displayGymCustomers(Gym gym, Date date){
        Scanner input = new Scanner (System.in);
        String c;
        System.out.println("Month or Day? (enter m or d)");
        c = input.nextLine();
        if(c.equals('m')){
            for(Subscription sub : gym.listOfSubscriptions){
            
            }
        }
        else{
            for(Subscription sub : gym.listOfSubscriptions){
            
            }
        }
        
    }
    
    public void displayCoachCustomers(Coach coach, Date date){
        
    }
    
    public void displayGymIncome(Date date){
        
    }
    
    public void displaySortedCoaches(Gym gym){
        
    }
    
    
    
    void display(){
        System.out.println("");
    }
    
    
}
