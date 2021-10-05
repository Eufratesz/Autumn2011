package introdate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class IntroDateMain {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2021, Month.OCTOBER,5);
        System.out.println(date);

        LocalDate now = LocalDate.now();
        System.out.println(now);

        LocalTime time = LocalTime.of(2, 30);
        System.out.println(time);

        LocalDateTime dateTime = LocalDateTime.of(2021,10,5,16,28);
        System.out.println(dateTime);

        LocalDate anotherDate = LocalDate.of(2021,10,5);
        System.out.println(date.equals(anotherDate));

    }
}
