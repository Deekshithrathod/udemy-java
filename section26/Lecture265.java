package section26;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Lecture265 {
    public static void main(String[] args) {

//        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
        String s = localDateTime.format(dateTimeFormatter);
        System.out.println(s);

    }
}
