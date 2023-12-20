package EQ_GYM;

public class Weight_Bench extends Equipment {

    Weight_Bench(){
        super("Weight_Bench");
    }
    public Weight_Bench(String name ,int quantity,int code){
        super(name,quantity,code);
    }


    public void display(){
        System.out.println("Type: " + this.getName());
        System.out.println("Quantity: " + this.quantity);
        System.out.println("Code: " + this.getCode());
    }

}