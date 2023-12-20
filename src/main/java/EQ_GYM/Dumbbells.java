package EQ_GYM;

public class Dumbbells extends Equipment{
    double weight;


Dumbbells(){
    super("Dummbbels");
}
Dumbbells(String name,int quantity,int code){
    super(name, quantity, code);

}
    public void setWeight(double weight) {
        this.weight = weight;
    }

    void display(){

    }
}
