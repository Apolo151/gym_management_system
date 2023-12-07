package EQ_GYM;

public class Weight_Bench extends Equipment{
    static int q_count=0;
    Weight_Bench(){
        super("weight_Bench");
        quantity=++q_count;
    }

    @Override
    void disp() {

    }
}
