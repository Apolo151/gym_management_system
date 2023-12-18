package EQ_GYM;

public class Leg_Press extends Equipment{
    static int q_count=0;
    public Leg_Press(){
        super("Leg press");
        quantity=++q_count;

    }

    @Override
    public void disp() {

    }

}
