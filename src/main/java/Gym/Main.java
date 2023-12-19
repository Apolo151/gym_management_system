package Main;
import EQ_GYM.*;
import Gym.*;

import java.io.FileWriter;
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

import static Gym.Gym.listOfCustomers;
import static Gym.Gym.listOfSubscriptions;
import static Gym.Gym.listOfCoaches;
import static Gym.Gym.sportsEquipment;

public class Main {
    static File output = new File("output.csv");
    static ArrayList<Gym> gymObj = new ArrayList<>();
    static ArrayList<MembershipPlan> membershipPlans = new ArrayList<>();
    static ArrayList<InBody> InBodyList = new ArrayList<>();
    static Map<String, Boolean> className = new HashMap<String, Boolean>();
    
    public static void ReadFile(String file)
    {
        File newFile = new File(file);
        try (Scanner scanner = new Scanner(Paths.get(file)))
        {
            while (scanner.hasNextLine()) {

                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                if(line.equals("Gym"))
                {
                    while(true)
                    {
                        line = scanner.nextLine();
                        if(className.get(line)!= null)
                        {
                            break;
                        }
                        String[] attribute = line.split(",");
                        System.out.println(attribute.length);
                        String name = attribute[0];
                        String address = attribute[1];
                        long phoneNumber = Long.valueOf(attribute[2]);

                        gymObj.add(new Gym(name, address, phoneNumber));
                    }
                }
                if(line.equals("Equipment"))
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
                }

                if(line.equals("Coach"))
                {
                    while(true)
                    {
                        line = scanner.nextLine();
                        if(className.get(line)!= null)
                        {
                            break;
                        }
                        String[] attribute = line.split(",");

                        String Name = attribute[0];
                        int ID = Integer.valueOf(attribute[1]);
                        String Gender = attribute[2];
                        String Adress = attribute[3];
                        int Phone_number =  Integer.valueOf(attribute[4]);
                        String E_mail = attribute[5];
                        int W_H =  Integer.valueOf(attribute[6]);

                        listOfCoaches.add(new Coach(Name, ID, Gender,Adress, Phone_number,E_mail, W_H));
                    }
                }
                
                if(line.equals("Subscription"))
                {
                    while(true)
                    {
                        line = scanner.nextLine();
                        if(className.get(line)!= null)
                        {
                            break;
                        }
                        String[] attribute = line.split(",");
                        int coach_id = Integer.valueOf(attribute[0]);
                        int costumer_id = Integer.valueOf(attribute[1]);
                        MembershipPlan membershipPlan = membershipPlans.get(0);

                        listOfSubscriptions.add(new Subscription(coach_id,costumer_id));
                    }
                }
                if(line.equals("Customer"))
                {
                    int i = 0;
                    while(true)
                    {
                        line = scanner.nextLine();
                        if(className.get(line)!= null)
                        {
                            break;
                        }
                        String[] attribute = line.split(",");

                        String Name = attribute[0];
                        int ID = Integer.valueOf(attribute[1]);
                        String Gender = attribute[2];
                        String Adress = attribute[3];
                        int Phone_number =  Integer.valueOf(attribute[4]);
                        String E_mail = attribute[5];
                        int coachID =  Integer.valueOf(attribute[6]);

                        Gym gym = gymObj.get(0);
                        Subscription sub = listOfSubscriptions.get(i);
                        i++;

                        listOfCustomers.add(new Customer(Name, ID, Gender,Adress,
                                Phone_number, E_mail, coachID,gym,sub));
                    }
                }

                if(line.equals("InBody"))
                {
                    while(true)
                    {
                        line = scanner.nextLine();
                        if(className.get(line)!= null)
                        {
                            break;
                        }
                        String[] attribute = line.split(",");
                        double Weight = Double.valueOf(attribute[0]);
                        double Height = Double.valueOf(attribute[1]);
                        int Age = Integer.valueOf(attribute[2]);
                        String Name = attribute[3];
                        String Gender = attribute[4];
                        InBodyList.add(new InBody(Weight,Height,Age,Name,Gender));
                    }
                }


            }

        }
        catch (Exception e)
        {
            System.out.println("Error: " + e.getMessage());
        }

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
        className.put("Gym",true);
        className.put("Equipment", true);
        className.put("Customer", true);
        className.put("Coach", true);
        className.put("Subscription", true);
        className.put("MembershipPlan", true);
        className.put("InBody", true);
        className.put("Admin", true);
        className.put("Exit",true);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the file path");
        String file = input.nextLine();
        
        // Read File
        ReadFile(file);
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
                        System.out.println("What do you want to do?");
                        String function = input.nextLine();
                        i++;
                        switch (function) {
                            case "Get coach info":
                                WriteFile(listOfCustomers.get(i).displayCoachInfo());

                                break;
                            case "Display gym equipment":
                                WriteFile(listOfCustomers.get(i).displayGymEquipment());
                                break;
                            case "Display membership plan detail":
                                WriteFile(listOfCustomers.get(i).displayMembershipPlan());
                                break;
                            case "Display in-body information":
                                System.out.println("enter date");
                              //  String date = input.nextLine();
                                // WriteFile(listOfCustomers.get(i).displayInBodyAtDate);
                                break;
                            case "How many kilos need to be reduced":
                                // WriteFile(listOfCustomers.get(i).displayHowManyKilosToReduce);
                                break;
                            case "Stop":
                                nextFunction = false;
                                break;
                            default:
                                System.out.println("Invalid functionality");
                        }
                    }
                    break;
                case "Coach":
                    while(nextFunction)
                    {
                        System.out.println("What do you want to do?");
                        String function = input.nextLine();
                        switch (function) {
                            case "Show a list of all my customers.":

                                break;
                            case "Get the inbody history of any of my customers.":

                                break;
                            case "Get all the details of a customer by his name.":

                                break;
                            case "Show a list of all his female/male customers.":

                                break;
                            case "Stop":
                                nextFunction = false;
                                break;
                            default:
                                System.out.println("Invalid functionality");
                        }
                    }
                    break;
                case "Admin":
                    while(nextFunction)
                    {
                        System.out.println("What do you want to do?");
                        String function = input.nextLine();
                        switch (function) {
                            case "add/edit/delete coaches, types of equipment, and customers to the gym.":

                                break;
                            case "Show the subscription history for a customer.":

                                break;
                            case "Display the GYM income in a given month.":

                                break;
                            case "Display the coaches sorted in terms of the most assigned number of\n" +
                                    "customers to the coaches.":

                                break;
                            case "Display all the customers that subscribed to the gym in a given month/day.":

                                break;
                            case "Display all the customers of a specific coach.":

                                break;
                            case "Stop":
                                nextFunction = false;
                                break;
                            default:
                                System.out.println("Invalid functionality");
                        }

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
        
        // Save
        WriteFile(gymObj.get(0).getAddress());
        // close application
        System.out.println("");
        
    }


}