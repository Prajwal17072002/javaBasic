package enumdemo;

import java.util.Random;

enum WeekDays{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}


public class Holidays {
    Random r1 = new Random();
    WeekDays ask(){

        int num = (int) (100* r1.nextDouble());
        //Get the input data from user

        if (num < 10)
            return WeekDays.MONDAY;

        else if (num < 20)
            return WeekDays.TUESDAY;

        else if (num < 30)
            return WeekDays.WEDNESDAY;

        else if (num < 40)
            return WeekDays.THURSDAY;

        else if (num < 50)
            return WeekDays.FRIDAY;

        else if (num < 60)
            return WeekDays.SATURDAY;

        else
            return WeekDays.SUNDAY;
    }

}

class Ask {
    static void weekdays(WeekDays result){
        switch(result){
            case MONDAY:
                System.out.println("Monday is holiday");
                break;

            case TUESDAY:
                System.out.println("Tuesday is holiday");
                break;

            case WEDNESDAY:
                System.out.println("Wednesday is holiday");
                break;

            case THURSDAY:
                System.out.println("Thursday is holiday");
                break;

            case FRIDAY:
                System.out.println("Friday is holiday");
                break;

            case SATURDAY:
                System.out.println("Saturday is holiday");
                break;

            case SUNDAY:
                System.out.println("Sunday is holiday");
                break;
        }
    }

     public static void main(String[] args) {
        Holidays h = new Holidays();
        weekdays(h.ask());
         weekdays(h.ask());
         weekdays(h.ask());
         weekdays(h.ask());
         weekdays(h.ask());
    }

}