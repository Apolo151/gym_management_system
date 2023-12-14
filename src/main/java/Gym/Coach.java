package Gym;

import java.util.Scanner;

public class Coach extends Person {
    int working_hours;
    int number_of_customers;
    Customer List_of_customers[] = new Customer[10];


    public Coach(String Name , int ID , String Gender ,String Adress ,int Phone_number, String E_mail, int W_H){
        super(Name, ID, Gender, Adress, Phone_number, E_mail);
        this.working_hours = W_H;
    }

    public Coach(){
        this("",0,"","",0,"",0);
    }

    void display (){
        System.out.println("Name: "+Name);
        System.out.println("ID:"+this.getID());
        System.out.println("Gander: " + Gender);
        System.out.println("Adress: "+this.getAdress());
        System.out.println("Pohne_number: "+Phone_number);
        System.out.println("E_mail: "+E_mail);
        System.out.println("Working Hours: "+working_hours);
    }

    public  void read (){
        this.read_data();
        Scanner input = new Scanner (System.in);
        // Read the number of working hours
        System.out.print("How many hours do you work per day?");
        while (true){
            this.working_hours =input.nextInt();
            if(this.working_hours > 10){
                System.out.println("plese enter correct number ");
            }
            else {
                break;
            }

        }
        // Read number of customers
        System.out.print("How many customers are you training?");
        while (true){
            number_of_customers = input.nextInt();
            if(number_of_customers > 10){
                System.out.println("please enter correct number ");
            }
            else {
                break;
            }
         }
    }
    
    void show_customers (){
        for (Customer cu: List_of_customers){
            int i =1 ;
            cu.display();
            i++;
        }
     }
    
    void show_list_of_inbodies (Customer cus){
         for (InBody in : cus.List_of_inbodies){         
             in.Display();     
         }
     }
     
    void show_details_of_Customer (String name){
         for (Customer cu: List_of_customers){
            if(name.equals(cu.Name)){
                 cu.display();
            }
        }
    }
    
    void show_details_of_Customer_gender (String gender){
        for (Customer cu: List_of_customers){
            int i =1 ;
            if(gender.equals(cu.Gender)){
               System.out.println("\t\tcustomer 1");  
                cu.display();
                i++;
            }
        }
    }

}
