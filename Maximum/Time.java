package Maximum;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Time {
    public static void Local_Date() {
        LocalDate local_date = LocalDate.now();
        System.out.println(local_date);
    }

    public static void Local_Time() {
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
    }

    public static void Local_date_time() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
    }

    public static void main(String[] args) {
        Local_Date();
        Local_date_time();
        Local_Time();
    }


}
