import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateC {
    public static void main(String[] args) {
        LocalDate date= LocalDate.now();
        DateTimeFormatter convert=DateTimeFormatter.ofPattern("d-M-yyyy");
        String dat= date.format(convert);
        System.out.println(dat);

    }
}