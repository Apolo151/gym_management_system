package EQ_GYM;

public class Leg_Press extends Equipment{

    public Leg_Press(){
        super("Leg_press");
    }
    public Leg_Press(String name ,int quantity,int code){
        super(name, quantity, code);
    }
    public void display(){
        System.out.println("Type: " + this.getName());
        System.out.println("Quantity: " + this.quantity);
        System.out.println("Code: " + this.getCode());
    }


}
