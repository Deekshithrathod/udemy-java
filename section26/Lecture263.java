package section26;

import java.time.Clock;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Lecture263 {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println(LocalDate.now(Clock.systemDefaultZone()));
        System.out.println(LocalDate.of(2020,12,24));
        System.out.println(LocalDate.ofEpochDay(1));

    }
}
