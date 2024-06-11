package flowchart;

public class LeapYear {

    static boolean checkyear(int year){

        if(year % 400 == 0 )
            return false;
        if (year % 100 ==0)
            return false;

        if (year % 4 == 0)
            return true;
        return false;

    }

    public static void main(String[] args) {
        int year = 366;

        System.out.println(checkyear(366)? "Leap year": "not a leap Year");
    }
}
