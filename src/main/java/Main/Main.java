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
        File newFile = new File(file);
        //try (Scanner scanner = new Scanner(Paths.get(file)))
        //gymObj.add(new Gym("GYMO", "Addddd", 2343242));
        //Gym gymO = gymObj.get(0);
        //gymO.listOfCoaches.add(new Coach("Lol", 1, "ththt", "ss", 3, "fdfd", 5));
        /*Gym.listOfCoaches.add(new Coach("Lol2", 2, "trrrt", "ss2", 6, "fdfd2", 7));
        Gym.listOfCustomers.add(new Customer(1, gymObj.get(0)));
        Gym.listOfCustomers.add(new Customer(2, gymObj.get(0)));*/
        
        try{
            List<String> lines = Files.readAllLines(Paths.get(file));
            for(String line: lines) {

            //String line = scanner.nextLine();
            System.out.println(line);
            if (line.isEmpty()) {
                continue;
            }
            if(line.equals("Gym"))
            {
                System.out.println("I Work here");
                while(true)
                {
                    /*line = scanner.nextLine();
                    if(className.get(line)!= null)
                    {
                        break;
                    }
                    String[] attribute = line.split(",");
                    String name = attribute[0];
                    for(String s: attribute){
                        System.out.println(s + " | ");
                    }
                    String address = attribute[1];
                    long phoneNumber = Long.valueOf(attribute[2]);
                    //System.out.println(name);
                    gymObj.add(new Gym(name, address, phoneNumber));*/
                }
            }
            /* if(line.equals("Equipment"))
            {
                while(true)
                {
                    line = scanner.nextLine();
                    if(className.get(line)!= null)
                    {
                        break;
                    }
                    String[] attribute = line.split(",");
                    String name = attribute[0];
                    String address = attribute[1];
                    long phoneNumber = Long.valueOf(attribute[2]);

                    gymObj.add(new Gym(name, address, phoneNumber));
                }
            }*/

  //          if(line.equals("Coach"))
          //  {
            //    while(true)
              //  {
                //    //line = scanner.nextLine();
                  //  if(className.get(line)!= null)
            //      {
               //         break;
             //       }
              //      String[] attribute = line.split(",");

//                    String Name = attribute[0];
  //                  int ID = Integer.valueOf(attribute[1]);
    //                String Gender = attribute[2];
      //              String Adress = attribute[3];
        //            int Phone_number =  Integer.valueOf(attribute[4]);
          //          String E_mail = attribute[5];
            //        int W_H =  Integer.valueOf(attribute[6]);
//
  //                  listOfCoaches.add(new Coach(Name, ID, Gender,Adress, Phone_number,E_mail, W_H));
    //            }
      //      }
            /*if(line.equals("MembershipPlan"))
            {
                while(true)
                {
                    line = scanner.nextLine();
                    if(className.get(line)!= null)
                    {
                        break;
                    }
                    String[] attribute = line.split(",");
                    String member_name = attribute[0];
                    String startDateString = attribute[1];
                    DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
                    Date start_date;
                    try {
                        start_date = df.parse(startDateString);
                        String newDateString = df.format(start_date);
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    String end_date = attribute[0];
                    int number_of_plan = Integer.valueOf(attribute[2]);

                    membershipPlans.add(new MembershipPlan(member_name,start_date ,end_date, number_of_plan));
                }
            }*/
//            if(line.equals("Subscription"))
  //          {
    //            while(true)
      //          {
        //            //line = scanner.nextLine();
          //          if(className.get(line)!= null)
            //        {
              //          break;
//                    }
  //                  String[] attribute = line.split(",");
    //                int coach_id = Integer.valueOf(attribute[0]);
      //              int costumer_id = Integer.valueOf(attribute[1]);
        //            listOfSubscriptions.add(new Subscription(coach_id,costumer_id));
          //      }
//            }
  //          if(line.equals("Customer"))
    //        {
      //          int i = 0;
        //        while(true)
          //      {
            //        //line = scanner.nextLine();
              //      if(className.get(line)!= null)
                //    {
                  //      break;
//                    }
  //                  String[] attribute = line.split(",");
//
  //                  String Name = attribute[0];
    //                int ID = Integer.valueOf(attribute[1]);
      //              String Gender = attribute[2];
        //            String Adress = attribute[3];
          //          int Phone_number =  Integer.valueOf(attribute[4]);
           //         String E_mail = attribute[5];
            //        int coachID =  Integer.valueOf(attribute[6]);
//
  //                  Gym gym = gymObj.get(0);
    //                Subscription sub = listOfSubscriptions.get(0);
      //              i++;
//
  //                  listOfCustomers.add(new Customer(Name, ID, Gender,Adress,
    //                        Phone_number, E_mail, coachID,gym,sub));
      //          }
        ///    }
//
  //          if(line.equals("InBody"))
    //        {
      //          while(true)
        //        {
          //          //line = scanner.nextLine();
            //        if(className.get(line)!= null)
              //      {
                //        break;
                 //   }
//                    String[] attribute = line.split(",");
  //                  double Weight = Double.valueOf(attribute[0]);
    //                double Height = Double.valueOf(attribute[1]);
      //              int Age = Integer.valueOf(attribute[2]);
        //            String Name = attribute[3];
          ///          String Gender = attribute[4];
             //       InBodyList.add(new InBody(Weight,Height,Age,Name,Gender));
               // }
         //   }


         }

    }
        catch (IOException ex) {
            // handle exception...
            System.out.println("Error in file reading");
        }

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
        
        //System.out.println(gymO.toArray().length);
        // Read File
        //ReadFile(file);
        //for(Coach coach: Gym.listOfCoaches){
        //    System.out.println(coach.getName()  );
        //}
        //System.out.println(gymObj.get(0).getAddress());
        //System.out.println(listOfCoaches.toArray().length);
        //System.out.println(gymObj.toArray().length);
        //System.out.println(listOfCustomers.toArray().length);
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
                        coach.readScenario(scan);
                            
    }
                    
                    break;
                case "Stop":
                    run = false;
                    break;
                default:
                    System.out.println("Get out of here !!!");

            }
        }
        // Exception handling for invalid login

        // According to Role, choose functionality
        // close application
        //System.out.println("");
        
    }
}