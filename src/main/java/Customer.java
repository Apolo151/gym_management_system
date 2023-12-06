import java.util.Scanner;
public class Customer extends person {
    person p;
    int[] List_of_inbodies =new int[2];

    public Customer(){
        super();
        List_of_inbodies[0]=0;
        List_of_inbodies[1]=0;
    }
    public Customer( String Name , int ID , String Gander ,String Adress ,int Phone_number, String E_mail, int List_of_inbodies){
        super( Name ,ID ,Gander ,Adress , Phone_number, E_mail);
        this.List_of_inbodies[0]=List_of_inbodies;
    }
    void display (){
        System.out.println("Name: "+Name);
        System.out.println("ID:"+this.getID());
        System.out.println("Gander: "+Gander);
        System.out.println("Adress: "+this.getAdress());
        System.out.println("Pohne_number: "+Phone_number);
        System.out.println("E_mail: "+E_mail);
        System.out.println("List of inbodies: "+List_of_inbodies[0]);
    }

    void read (){
        Scanner input =new Scanner (System.in);
        this.read_data();
        System.out.println("How many inbody have you ? ");
        int number_of_inbodys=input.nextInt();
        for (int i = 0 ,j =1 ; i > number_of_inbodys ;i++,j++){
            System.out.print("Please Enter your "+ j +" inbody");
            List_of_inbodies[i]=input.nextInt();
        }

    }




}
