import java.time.*;

public class TimeZone {
    public static void main(String[] args) {
        Instant minus = Instant.now().minus(Duration.ofHours(6));
        Instant utc = Instant.now();
        ZonedDateTime zonedDateTime = utc.atZone(ZoneId.of("US/Mountain"));
        LocalDate localDate = LocalDate.now(ZoneId.of("US/Mountain"));

        System.out.println(zonedDateTime);
    }
}
