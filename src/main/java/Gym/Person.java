package Gym;

import java.util.Scanner;


public  abstract class Person {
    public String Name ;
    private int ID ;
    String Gender ;
    private String Adress ;
    int Phone_number ;
    protected String E_mail;

    public Person (String Name , int ID , String Gender ,String Adress ,int Phone_number, String E_mail){
        this.Name =Name;
        this.ID =ID;
        this.Gender =Gender;
        this.Adress=Adress;
        this.Phone_number =Phone_number;
        this.E_mail=E_mail;
    }

    public Person (){ //defalt constractor
        this("",0,"","",0,"");
    }

    public int getID() {
        return ID;
    }

    public String getAdress() {
        return Adress;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setAdress(String Adress) {
        this.Adress = Adress;
    }

    abstract void display ();



    public void  read_data(){
        Scanner read =new Scanner (System.in);
        System.out.println("\t\t\tHallo");
        System.out.println("\t\t\t-----");
        System.out.print("Please Enter your Name: ");
        Name = read.next() ;
        System.out.print("Please Enter your ID: ");
        ID = read.nextInt() ;
        System.out.print("Please Enter your Adress: ");
        Adress = read.next() ;
        System.out.print("Please Enter your Phone Number: ");
        Phone_number = read.nextInt() ;
        System.out.println("Please Enter your  Gander\t\t\t(male / female)");
        while(true){
            Gender = read.next() ;
            String g_m ="male";
            String g_f ="female";
            if (Gender.equals(g_f) || Gender.equals(g_m)){
                break;
            }
            else {
                System.out.print("Please Enter your Gander\t\t\t(male / female)");
            }
        }

        System.out.print("Please Enter your E-mail: ");
        while(true){
            E_mail= read.next() ;
            String gmail ="@gmail.com";
            if ( E_mail.contains(gmail) ){
                break;
            }
            else {
                System.out.print("Please Enter your corect E-mail ");
            }
        }
        System.out.println("congratulations Now you have an accont ");
    }
}