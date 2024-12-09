import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class CalendarExample {
    public static void main(String[] args) {
        // Create a GregorianCalendar instance with the default locale and time zone
        GregorianCalendar calendar = new GregorianCalendar();

        // Display current date and time with the new pattern
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy HH:mm:ss", Locale.getDefault());
        System.out.println("Current Date and Time: " + dateFormat.format(calendar.getTime()));

        // Check if the current year is a leap year
        int year = calendar.get(Calendar.YEAR);
        boolean isLeapYear = calendar.isLeapYear(year);
        System.out.println("Is the current year " + year + " a leap year? " + isLeapYear);
    }
}