package EQ_GYM;

public class Leg_Press extends Equipment{
    static int q_count=0;
    Leg_Press(){
        super("Leg press");
        quantity=++q_count;

    }

    @Override
    void disp() {

    }

}
