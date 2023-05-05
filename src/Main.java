import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        DayOfWeek dayOfWeek= DayOfWeek.valueOf(scanner.nextLine().toUpperCase());
        switch (dayOfWeek){
            case MONDAY:
                DayOfWeek.MONDAY.dayofweek();
                break;
            case TUESDAY:
                DayOfWeek.TUESDAY.dayofweek();
                break;
            case WEDNESDAY:
                DayOfWeek.WEDNESDAY.dayofweek();
                break;
            case THURSDAY:
                DayOfWeek.THURSDAY.dayofweek();
                break;
            case FRIDAY:
                DayOfWeek.FRIDAY.dayofweek();
                break;
            case SATURDAY:
                DayOfWeek.SATURDAY.dayofweek();
            case SUNDAY:
                DayOfWeek.SUNDAY.dayofweek();
                break;
            default:
                System.out.println("Мындай кун жок!");
        }

    }
}