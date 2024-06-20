package collection;

import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TimeZones {
    public static void main(String[] args) {
        ZonedDateTime currentDateTime = ZonedDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");

        ZonedDateTime chicagoDateTime = currentDateTime.withZoneSameInstant(ZoneId.of("America/Chicago"));

        ZonedDateTime sydneyDateTime = currentDateTime.withZoneSameInstant(ZoneId.of("Australia/Sydney"));

        System.out.println("Current Date and Time (Default Timezone): " + currentDateTime.format(formatter));
        System.out.println("Current Date and Time in Chicago: " + chicagoDateTime.format(formatter));
        System.out.println("Current Date and Time in Sydney: " + sydneyDateTime.format(formatter));
    }
}

