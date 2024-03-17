public class workingdays{
    enum days{
          monday,
        tuesday,
        wednesday,
        thursday,
        friday,
        saturday,
        sunday
    }
public static void main(String args[]){
    for(days d : days.values()){
        weekend(d);
    }
}
    private static void weekend(days d){
        if(d == days.sunday){
             System.out.println("value = " + d + " is a holiday");
        }
        else{
 System.out.println("value = " + d + " is a working day");
        }
    }


}