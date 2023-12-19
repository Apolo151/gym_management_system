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
        /*className.put("Gym",true);
        className.put("Equipment", true);
        className.put("Customer", true);
        className.put("Coach", true);
        className.put("Subscription", true);
        className.put("MembershipPlan", true);
        className.put("InBody", true);
        className.put("Admin", true);
        className.put("Exit",true);*/
        
        ArrayList<Gym> gymObj = new ArrayList<>();
        ArrayList<MembershipPlan> membershipPlans = new ArrayList<>();
        ArrayList<InBody> InBodyList = new ArrayList<>();
        Map<String, Boolean> className = new HashMap<String, Boolean>();
        gymObj.add(new Gym("GYMO", "Addddd", 2343242));
        Gym gymO = gymObj.get(0);
        gymO.listOfCoaches.add(new Coach("Name1", 1, "SSS", 5, gymO));
        gymO.listOfCoaches.add(new Coach("Name2", 2, "trrrt", 7, gymO));
        gymO.listOfCustomers.add(new Customer(1, "Cu1", gymObj.get(0)));
        gymO.listOfCustomers.add(new Customer(2, "Cu2", gymObj.get(0)));
        System.out.println(gymO.listOfCustomers.toArray().length);
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
            System.out.println("Who are you little guy ?");
            String role = input.nextLine();
            int i =0;
            switch (role)
            {
                case "Customer":
                    while(nextFunction)
                    {
                        Scanner scan = new Scanner(System.in);
                        Customer customer =  null;
                        while(customer == null){
                            System.out.println("Enter you name:");
                            String cName = scan.nextLine();
                            for(Customer co: gymO.listOfCustomers){
                                if(co.getName().equals(cName)){
                                    customer = co;
                                }
                            }
                            //
                            if (customer == null){
                                System.out.println("No Customer exists with the provided name");
                                System.out.println("Exit (e) or Retry(r) ?");
                                String option = scan.nextLine();
                                if(option.equals("e")){
                                    break;
                                }
                            }

                        }
                        //
                        customer.readScenario();
                    }
                    break;
                case "Coach":
                    while(nextFunction)
                    {
                        Scanner scan = new Scanner(System.in);
                        Coach coach =  null;
                        while(coach == null){
                            System.out.println("Enter you name:");
                            String cName = scan.nextLine();
                            System.out.println(gymO.listOfCoaches.toArray().length);
                            for(Coach co: gymO.listOfCoaches){
                                System.out.println(co.getName());
                                if(co.getName().equals(cName)){
                                    coach = new Coach(co);
                                }
                            }
                            //
                            if (coach == null){
                                System.out.println("No Coach"
                                        + " exists with the provided name");
                                System.out.println("Exit (e) or Retry(r) ?");
                                String option = scan.nextLine();
                                if(option.equals("e")){
                                    break;
                                }
                            }

                        }
                        //
                        coach.readScenario();
                    }
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