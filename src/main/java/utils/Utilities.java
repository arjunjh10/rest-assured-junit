package utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.util.*;

public class Utilities {
    public static Map<String, List<String>> mapDayToDateBreakDowns(List validDates) throws ParseException {
        List<String> allMondays = new ArrayList<>();
        List<String> allThursdays = new ArrayList<>();
        List<String> allFridays = new ArrayList<>();;
        Map<String, List<String>> dateToDateBreakdowns = new HashMap<>();

        for (Object currentDateValueFromTheSet : validDates) {
            SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
            Date dt1 = format1.parse(currentDateValueFromTheSet.toString());
            DateFormat format2 = new SimpleDateFormat("EEEE");
            String finalDay = format2.format(dt1);
            DayOfWeek dayOfTheWeek = DayOfWeek.valueOf(finalDay.toUpperCase());

            switch(dayOfTheWeek) {
                case MONDAY:
                    allMondays.add(currentDateValueFromTheSet.toString());
                    break;
                case THURSDAY:
                    allThursdays.add(currentDateValueFromTheSet.toString());
                    break;
                case FRIDAY:
                    allFridays.add(currentDateValueFromTheSet.toString());
                    break;
            }
        }

        dateToDateBreakdowns.put("Monday", allMondays);
        dateToDateBreakdowns.put("Thursday", allThursdays);
        dateToDateBreakdowns.put("Friday", allFridays);
        return dateToDateBreakdowns;
    }
}
