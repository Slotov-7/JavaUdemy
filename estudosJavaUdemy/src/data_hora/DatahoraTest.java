package data_hora;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DatahoraTest {
    public static void main(String[] args) {
        //https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
        LocalDate d04 = LocalDate.parse("2024-07-20");//converte string para data
        LocalDateTime d05 = LocalDateTime.parse("2024-07-20T01:30:26");//converte string para data e hora
        Instant d06 = Instant.parse("2024-07-20T01:30:26Z");//converte string para data e hora de acordo com o GMT

        Date x1 = new Date();

        System.out.println(x1);


    }
}
