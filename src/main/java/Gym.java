import EQ_GYM.Equipment;

public class Gym {

    private String name;
    private String address;
    private long phoneNumber;  // This is not " int " because it won't carry 11 numbers. Also, we can make it String.
    protected Equipment[] sportsEquipment;
    protected Coach[] listOfCoaches;
    protected Subscription[] listOfSubscriptions;

    public Gym(String name, String address, long phoneNumber)
    {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    // not sure about the next methods, we can decide either to keep or delete them in the next meeting.

    public String getName(){
    return name;
    }
    public String getAddress(){
    return address;
    }
    public long getPhoneNumber(){
    return phoneNumber;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setPhoneNumber(long phoneNumber){
        this.phoneNumber = phoneNumber;
    }


}