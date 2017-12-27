import java.time.*;

public class TimeZone {
    public static void main(String[] args) {
        Instant local = Instant.now().minus(Duration.ofHours(6));
        Instant utc = Instant.now();
        LocalDate localDate = LocalDate.now(ZoneId.of("US/Mountain"));

        System.out.println(localDate);
    }
}
