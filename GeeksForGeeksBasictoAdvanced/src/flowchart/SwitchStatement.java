package flowchart;

public class SwitchStatement {
    public static void main(String[] args) {

        int day = 5;

        String dayString ;

        switch (day){
            case 1:
            dayString = "monday";
            break;

            case 2:
            dayString = "Tuesday";
            break;

            case 3 :
                dayString= "Wednesday";
                break;

            case 4 :
                dayString = "Thursday";
                break;
            case 5:
                dayString = " friday";
                break;

            default:
                dayString = "invalid days";
                        break;}

                System.out.println(dayString);


        }
    }


