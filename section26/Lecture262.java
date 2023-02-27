package section26;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Lecture262 {
    public static void main(String[] args) {

        GregorianCalendar gregorianCalendar = new GregorianCalendar();
//        System.out.println(gregorianCalendar.isLeapYear(2020));
//        System.out.println(gregorianCalendar.get(Calendar.YEAR));
//        System.out.println(gregorianCalendar.get(Calendar.MONTH));
//        System.out.println(gregorianCalendar.get(Calendar.DAY_OF_MONTH));
//        System.out.println(gregorianCalendar.get(Calendar.DAY_OF_YEAR));
//        System.out.println(gregorianCalendar.get(Calendar.WEEK_OF_MONTH));

        TimeZone timeZone = gregorianCalendar.getTimeZone();
        System.out.println(timeZone);

    }
}
