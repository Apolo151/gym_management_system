package Main;

//import EQ_GYM.*;
import Gym.*;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;
import java.util.Date;
import java.util.List;
import java.nio.file.Files;

/*import static Gym.Gym.listOfCustomers;
import static Gym.Gym.listOfSubscriptions;
import static Gym.Gym.listOfCoaches;
import static Gym.Gym.sportsEquipment;*/

public class Main {
    
    public void ReadFile(String file)
    {
        /*catch (Exception e)
        {
            System.out.println("Error: " + e.getMessage());
        }*/

    }
    public static void WriteFile(String classOutput)
    {
        try
        {
            FileWriter outputFile = new FileWriter("output.csv");
            outputFile.write(classOutput);
            outputFile.close();
        }
        catch (Exception e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }


    public static void main(String[] args) {
        /*
        // Create Map of Classes
        className.put("Gym",true);
        className.put("Equipment", true);
        className.put("Customer", true);
        className.put("Coach", true);
        className.put("Subscription", true);
        className.put("MembershipPlan", true);
        className.put("InBody", true);
        className.put("Admin", true);
        className.put("Exit",true);
        Map<String, Boolean> className = new HashMap<String, Boolean>();*/
        
        Gym gym = new Gym("GYMO", "Addddd", 2343242);
        ArrayList<MembershipPlan> membershipPlans = new ArrayList<>();
        ArrayList<InBody> InBodyList = new ArrayList<>();
        
        Gym.listOfCoaches.add(new Coach("CoacherM", 1, "male", "7 al Street", 07775000, "CoacherM@gmail.com", 8));
        Gym.listOfCoaches.add(new Coach("Coacher2F", 2, "female", "9 el Street", 07775000, "Coacher2F@gmail.com", 6));
        Gym.listOfCustomers.add(new Customer("Cu1", 101, "male", "17 Moon Street", 500090, "Customer1@hotmail.com", 2));
        Gym.listOfCustomers.add(new Customer("Cu2", 102, "female", "18 Sun Street", 500500, "Customer255@gmail.com", 1));
        Gym.listOfCoaches.get(0).List_of_customers.add(Gym.listOfCustomers.get(1));
        System.out.println("First Coach Cust No = " + Gym.listOfCoaches.get(0).List_of_customers.toArray().length); // Debugging
        System.out.println("All Gym Customer number = " + Gym.listOfCustomers.toArray().length); // Debugging
        //
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the file path");
        String file = input.nextLine();
        
        // Read File
        //ReadFile(file);
        //for(Coach coach: Gym.listOfCoaches){
        //    System.out.println(coach.getName()  );
        //}
        // Sign in & Choose Role
        boolean run = true;
        while(run) {
            boolean nextFunction = true;
            System.out.println("Who are you little guy ? (type 'Stop' to run)");
            String role = input.nextLine();
            int i =0;
            switch (role)
            {
            case "Customer":
                    //Scanner scan = new Scanner(System.in);
                    Customer customer =  null;
                    while(customer == null){
                        System.out.println("Enter you name:");
                        String cName = input.nextLine();
                        for(Customer co: Gym.listOfCustomers){
                            if(co.getName().equals(cName)){
                                customer = co;
                            }
                        }
                        //
                        if (customer == null){
                            System.out.println("No Customer exists with the provided name");
                            System.out.println("Exit (e) or Retry(r) ?");
                            String option = input.nextLine();
                            if(option.equals("e")){
                                break;
                            }
                        }

                    }
                    //
                    if(customer != null) customer.readScenario();
                    break;
                case "Coach":
                    //Scanner scan = new Scanner(System.in);
                    Coach coach =  null;
                    while(coach == null){
                        System.out.println("Enter your name:");
                        String cName = input.nextLine();
                        //System.out.println(Gym.listOfCoaches.toArray().length);
                        for(Coach co: Gym.listOfCoaches){
                            //System.out.println(co.getName());
                            if(co.getName().equals(cName)){
                                coach = co;
                            }
                        }
                        //
                        if (coach == null){
                            System.out.println("No Coach exists with the provided name");
                            System.out.println("Exit (e) or Retry(r) ?");
                            String option = input.nextLine();
                            if(option.equals("e")){
                                break;
                            }
                        }
                    }
                    //
                    if(coach != null) coach.readScenario();
                    break;
                case "Admin":
                    
                    break;
                case "Stop":
                    run = false;
                    break;
                default:
                    System.out.println("Get out of here !!!");

            }
        }
    }
}