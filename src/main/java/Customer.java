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
    
    void display (){
        System.out.println("Name: "+Name);
        System.out.println("ID:"+this.getID());
        System.out.println("Gander: "+Gender);
        System.out.println("Adress: "+this.getAdress());
        System.out.println("Pohne_number: "+Phone_number);
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
        this.gym.listOfCoaches[this.coachID].display();
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
        double res = this.List_of_inbodies.get(0).howManyKilosToReduce();
        if(res==0){
            System.out.println("You don't need to lose weight");
        }
        else{
            System.out.println("You need to lose " + res + " kilos to get to your ideal body weight.");
        }
    }




}
