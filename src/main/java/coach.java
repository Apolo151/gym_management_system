import java.util.Scanner;

public class coach extends Person {
         int working_hours;
         int number_of_customer ;
             Customer List_of_customer[] =new Customer[10];
       

          public coach( String Name , int ID , String Gander ,String Adress ,int Phone_number, String E_mail, int working_hours){
    super( Name ,ID ,Gander ,Adress , Phone_number, E_mail);
    
    this.working_hours=working_hours;
}
          
               public coach(){
   this("",0,"","",0,"",0);
} 
               
   void display (){
        System.out.println("Name: "+Name);
        System.out.println("ID:"+this.getID());
        System.out.println("Gander: "+Gander);
        System.out.println("Adress: "+this.getAdress());
        System.out.println("Pohne_number: "+Phone_number);
        System.out.println("E_mail: "+E_mail);
        System.out.println("Working Hours: "+working_hours);
   }       
          
     public  void read (){
		this.read_data();
             Scanner input =new Scanner (System.in);
             System.out.print("How many hours work in day ? ");
           while (true){
               number_of_customer =input.nextInt();
               if(number_of_customer> 10){
               System.out.println("plese enter corect number ");
               }
               else {
                   break;
               }
                        }
          System.out.print("How many customer are you train ? ");
           while (true){
              working_hours =input.nextInt();
               if(working_hours> 10){
               System.out.println("plese enter corect number ");
               }
               else {
                   break;
               }
           }
        
        }    
     void show_customer (){
         for (Customer cu :List_of_customer ){
             int i =1 ;
             System.out.print("customer "+ i + " " +cu.Name+"\t");
             System.out.println("customer "+ i + " " +cu.Phone_number);
                i++;
                        }
     }
     void show_list_of_inbodys (Customer cus){
         for (int cu :cus.List_of_inbodies ){
            
             System.out.print("Inbody 1 "  +cu+ "\t" );
             System.out.println("Date of inbody 1 " + " ");  
                
         }
     }
      void show_details_of_Customer (String name){
         for (Customer cu :List_of_customer ){
            if(name.equals(cu.Name)){
                 cu.display();
            }
            }
            }
            void show_details_of_Customer_gander (String gander){
         for (Customer cu :List_of_customer ){
             int i =1 ;
            if(gander.equals(cu.Gander)){
               System.out.println("\t\tcustomer 1");  
                 cu.display();
                 i++;
            }
            }
            }

}
