import java.util.Scanner;
public class Coach extends Person {
    Person p;
    int W_H;


    public Coach(String Name , int ID , String Gender ,String Adress ,int Phone_number, String E_mail, int W_H){
        super(Name, ID, Gender, Adress, Phone_number, E_mail);

        this.W_H=W_H;
    }

    public Coach(){
        this("",0,"","",0,"",0);
    }

    void display (){
        System.out.println("Name: "+Name);
        System.out.println("ID:"+this.getID());
        System.out.println("Gander: "+Gender);
        System.out.println("Adress: "+this.getAdress());
        System.out.println("Phone_number: "+Phone_number);
        System.out.println("E_mail: "+E_mail);
        System.out.println("Working Hours: "+W_H);
    }

    public  void read (){
        this.read_data();
        Scanner input =new Scanner (System.in);
        System.out.print("How many hours work in day ? ");
        while (true){
            W_H =input.nextInt();
            if(W_H > 10){
                System.out.println("plese enter correct number ");
            }
            else {
                break;
            }

        }


    }

}
