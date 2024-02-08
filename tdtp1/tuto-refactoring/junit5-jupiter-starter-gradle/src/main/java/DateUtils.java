import java.time.LocalDate;

public class DateUtils {
    public static boolean isNowBetween(LocalDate startingDate, LocalDate endingDate) {
        return isDateBetween(LocalDate.now(), startingDate, endingDate, true);
    }

    public static boolean isDateBetween(LocalDate date, LocalDate startingDate,
                                        LocalDate endingDate, boolean inclusive) {
        if (inclusive) {
            return date.isBefore(endingDate.plusDays(1)) && date.isAfter(startingDate.minusDays(1));
        }
        return date.isBefore(endingDate) && date.isAfter(startingDate);
    }

    public static boolean isDateOutside(LocalDate date, LocalDate startingDate,
                                       LocalDate endingDate) {
        return !isDateBetween(date, startingDate, endingDate, true);
    }
}