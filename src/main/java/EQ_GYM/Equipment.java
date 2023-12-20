package EQ_GYM;

import java.util.Scanner;

public abstract class Equipment {
    private String name;
    protected int quantity;
    private int code;
    Equipment(String name){
        this.name=name;
    }
    Equipment(){

    }

    Equipment(String name,int quantity,int code){
        this.name=name;
        this.quantity=quantity;
        this.code=code;
    }
    Equipment(Equipment e){
        this.name=e.name;
        this.quantity=e.quantity+e.quantity;
    }


    public void setCode(int code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }
    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    // Function to add equipment based on user input
    public static Equipment addEquipment(Scanner input) {
        System.out.println("Choose the type of equipment:");
        System.out.println("1. Bike");
        System.out.println("2. Dumbells");
        System.out.println("3. Treadmill");
        System.out.println("4. Leg Press");
        System.out.println("5. Weight Bench");

        int choice = input.nextInt();
        input.nextLine(); // Consume the newline character

        switch (choice) {
            case 1:
                return new Bike();
            case 2:
                return new Dumbbells();
            case 3:
                return new Treadmill();
            case 4:
                return new Leg_Press();
            case 5:
                return new Weight_Bench();
            default:
                System.out.println("Invalid choice. Returning null.");
                return null;
        }
    }

    abstract void display();

}