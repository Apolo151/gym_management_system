package EQ_GYM;

public abstract class Equipment {
   private String name;
    protected int quantity;
    private int code;
    private static int count=0 ; // to give code unique number;

 Equipment(String name,int quantity){
     this.name=name;
     this.quantity=quantity;
     code=++count;
}
Equipment(String name){
     this.name=name;
    code=++count;
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

    void add_equipment(Equipment e){
     e.setName(name);
     e.quantity++;
}
abstract void disp();



}
