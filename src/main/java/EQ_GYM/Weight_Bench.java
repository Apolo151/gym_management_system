package EQ_GYM;

public class Weight_Bench extends Equipment{
    static int q_count=0;
    public Weight_Bench(){
        super("weight_Bench");
        quantity=++q_count;
    }

    @Override
    public void disp() {

    }
}
