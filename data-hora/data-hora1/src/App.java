import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) throws Exception {

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();
        Instant d04 = Instant.parse("2003-12-18T17:00:00Z");
        LocalDate d05 = LocalDate.parse("18/12/2003", fmt1);
        LocalDateTime d06 = LocalDateTime.parse("18/12/2003 13:30", fmt2);
        LocalDate d07 = LocalDate.of(2003, 12, 18);
        LocalDateTime d08 = LocalDateTime.of(2003, 12, 18, 13, 44);
        

        System.out.println(d01);
        System.out.println(d02);
        System.out.println(d03);
        System.out.println(d04);
        System.out.println(fmt3.format(d04));
        System.out.println(d05.format(fmt1));
        System.out.println(d06.format(fmt2));
        System.out.println(d07);
        System.out.println(d08);

        System.out.println("Fuso horário do sistema: " + ZoneId.systemDefault());

        
    }
}
