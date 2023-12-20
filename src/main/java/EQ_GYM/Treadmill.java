package EQ_GYM;

public class Treadmill extends Equipment{
    final int MAX_SPEED = 15;

    public Treadmill(){
        super("Treadmill");
    }
    public Treadmill(String name , int quantity,int code){
        super(name, quantity, code);
    }

    public void display(){
        System.out.println("Type: " + this.getName());
        System.out.println("Quantity: " + this.quantity);
        System.out.println("Code: " + this.getCode());
    }

}
