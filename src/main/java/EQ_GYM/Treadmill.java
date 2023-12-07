package EQ_GYM;

public class Treadmill extends Equipment{
    static int q_count=0;
    Treadmill(){
        super("Treadmill");
        quantity=++q_count;
    }



    void disp(){
        for (int i=0; i<quantity;i++){
            System.out.println();
        }
    }


}
