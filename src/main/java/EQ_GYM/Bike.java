package EQ_GYM;

public class Bike extends Equipment{
    final int MAX_TIMER = 20;// 20 min

    public Bike(){
        super("Bike");
    }
    public Bike(String name, int quantity,int code){
        super(name, quantity, code);
    }


    public void display(){
        System.out.println("Type: " + this.getName());
        System.out.println("Quantity: " + this.quantity);
        System.out.println("Code: " + this.getCode());
    }


}
