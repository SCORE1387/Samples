package tk.sekol.samples.java8.datetime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;
import java.util.Locale;

/**
 * @author kolesnikov
 */
public class Samples {

    public static void main(String[] agrs) {
        clock();
        timeZones();
        localTime();
        localDate();
        localDateTime();
    }

    private static void clock() {
        Clock clock = Clock.systemDefaultZone();
        System.out.println(clock.millis());
    }

    private static void timeZones() {
        System.out.println(ZoneId.getAvailableZoneIds());

        ZoneId zone1 = ZoneId.of("Europe/Berlin");
        ZoneId zone2 = ZoneId.of("Brazil/East");
        ZoneId systemZone = ZoneId.systemDefault();
        System.out.println(zone1.getRules());
        System.out.println(zone2.getRules());
        System.out.println(systemZone.getRules());
    }

    private static void localTime() {
        ZoneId zone1 = ZoneId.of("Europe/Berlin");
        ZoneId zone2 = ZoneId.of("Brazil/East");
        LocalTime now1 = LocalTime.now(zone1);
        LocalTime now2 = LocalTime.now(zone2);

        System.out.println(now1.isBefore(now2));

        long hoursBetween = ChronoUnit.HOURS.between(now1, now2);
        long minutesBetween = ChronoUnit.MINUTES.between(now1, now2);

        System.out.println(hoursBetween);
        System.out.println(minutesBetween);
    }

    private static void localDate() {
        LocalDate today = LocalDate.now();
        LocalDate tomorrow = today.plus(1, ChronoUnit.DAYS);
        LocalDate yesterday = tomorrow.minusDays(2);

        LocalDate myBirthDay = LocalDate.of(1992, Month.DECEMBER, 29);
        DayOfWeek dayOfWeek = myBirthDay.getDayOfWeek();
        System.out.println(dayOfWeek);

        DateTimeFormatter germanFormatter =
                DateTimeFormatter
                        .ofLocalizedDate(FormatStyle.MEDIUM)
                        .withLocale(Locale.GERMAN);

        LocalDate victoryDay = LocalDate.parse("09.05.2014", germanFormatter);
        System.out.println(victoryDay);

        LocalDate payday = today.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(payday);
    }

    private static void localDateTime() {
        LocalDateTime sylvester = LocalDateTime.of(2014, Month.DECEMBER, 31, 23, 59, 59);

        DayOfWeek dayOfWeek = sylvester.getDayOfWeek();
        System.out.println(dayOfWeek);

        Month month = sylvester.getMonth();
        System.out.println(month);

        long minuteOfDay = sylvester.getLong(ChronoField.MINUTE_OF_DAY);
        System.out.println(minuteOfDay);

        Instant instant = sylvester
                .atZone(ZoneId.systemDefault())
                .toInstant();
        Date legacyDate = Date.from(instant);
        System.out.println(legacyDate);

        DateTimeFormatter formatter =
                DateTimeFormatter
                        .ofPattern("MM dd, yyyy - HH:mm");
        LocalDateTime parsed = LocalDateTime.parse("10 03, 2014 - 07:13", formatter);
        System.out.println(parsed);

    }

}
