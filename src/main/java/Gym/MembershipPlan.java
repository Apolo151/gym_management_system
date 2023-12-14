package Gym;

public class MembershipPlan {
    String member_name;
    Date start_date =  new Date();
    Date end_date = new Date();
    final float price_of_month = 300;
    int number_of_plan;
    //
    
    public MembershipPlan (String member_name,  Date start_date,  Date end_date,  int number_of_plan){
        this.member_name = member_name ;
        this.start_date = start_date ;
        this.end_date = end_date ;
        this.number_of_plan =number_of_plan ;

    }
    public MembershipPlan (String member_name   ,  int number_of_plan){
        this.member_name = member_name ;
        this.number_of_plan =number_of_plan ;

    }
    public MembershipPlan (){
            this("",0);
        start_date =new Date();
        end_date = new Date();
    }
    //
    
    public boolean check_is_active (Date day_date , Date end_date){
        boolean check = true ;
        if (end_date.year==day_date.year){
            if (end_date.month== day_date.month){ // 1
                if (end_date.day==day_date.day){ // 2
                    return true;
                }
                else if (end_date.day > day_date.day){
                    return true;
                }
                else if (end_date.day < day_date.day){
                    return  false ;
                }
            } // month
            else if (end_date.month> day_date.month) { // 1 year
                return true;
            }
            else if (end_date.month < day_date.month) {
                return false;
            }
        }

        else if(end_date.year > day_date.year){
            return true;
        }
        else if (end_date.year < day_date.year){
            return false;
        }
        
        return false;
    }
    
    public void updtate_member (Date end_date ,boolean ch ,Date day_date ){
        boolean check = false ;
        if(ch==false){
            switch (number_of_plan){
                case 1:
                    if (check == ch && end_date.month!= 12 ){
                        end_date.month = day_date.month+1;
                    }
                    else if (check == ch && end_date.month == 12 ){
                        end_date.month =1;
                        end_date.year ++;
                    }
                    System.out.println("the next date is " + end_date.month+"\t" + day_date.year);
                    break;
                case 2:

                    if (check == ch && end_date.month<11){
                        end_date.month = day_date.month+2;
                    }
                    else if (check == ch && end_date.month == 12   ){
                        end_date.month =2;
                        end_date.year ++;
                    }
                    else if (check == ch && end_date.month == 11  ){
                        end_date.month =1;
                        end_date.year ++;
                    }
                    System.out.println("the next date is " + end_date.month +"\t" + day_date.year);
                    break;
                case 3:

                    if (check == ch && day_date.month<10){
                        end_date.month = day_date.month+3;
                    }
                    else if (check == ch && day_date.month == 12   ){
                        end_date.month =3;
                        day_date.year ++;
                    }
                    else if (check == ch && day_date.month == 11  ){
                        end_date.month =2;
                        day_date.year ++;
                    }
                    else if (check == ch && day_date.month == 10  ){
                        end_date.month =1;
                        day_date.year ++;
                    }
                    System.out.println("the next date is " + end_date.month +"\t" + day_date.year);
                    break;
                case 4 :
                    if (check == ch && end_date.month<=6){
                        end_date.month = day_date.month+6;
                        if(end_date.month>12){
                            end_date.month = end_date.month-12;
                            day_date.year ++;
                        }
                    }
                    else if (check == ch && end_date.month > 6   ){
                        if(end_date.month==12){
                            end_date.month=6 ;
                            day_date.year ++;
                        }
                        else {
                            end_date.month =end_date.month % 6 ;
                            day_date.year ++;
                        }
                    }
                    System.out.println("the next date is " + end_date.month + "\t" +day_date.year );
                    break;
                case 5 :
                    end_date.year =day_date.year +1 ;
                    System.out.println("the next date is " + end_date.month+"\t" + end_date.year);
                    break;
                default:
                    System.out.println("any way case ");
                    break;
            }
        }
        else {
            System.out.println("not need active");
        }
    }
    
    public float discount_price ( int number_of_plan ) {
        float price_member =0 ;
        switch (number_of_plan){
            case 1:
                price_member =price_of_month ; // 1month                        300
                break;
                case 2:
                price_member =price_of_month * 2 ; // 2 month                   600
                break;
                case 3:
                    price_member =price_of_month * (8/3); // 3 month            800
                    break;
                case 4 :
                    price_member = price_of_month * (16/3) ; // 6 month         1600
                    break;
                case 5 :
                    price_member = price_of_month * 10 ; // 1 year              3000
                    break;
            default:
                System.out.println("any way case ");
                break;
            }

            return price_member ;
    }

    public  void display () {
        System.out.println("Name: " + member_name);
        System.out.println("Number of plan: " + number_of_plan);
        System.out.println("Day: " + end_date.day+"\tmonth: " + end_date.month+"\tYear: " + end_date.year);
    }
}