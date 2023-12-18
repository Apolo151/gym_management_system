package EQ_GYM;

public class Dumbbels extends Equipment{
    static int q_count=0;
    public Dumbbels(){
        super("Dumbbels");
        quantity=++q_count;

    }

    @Override
    public void disp() {

    }
}
