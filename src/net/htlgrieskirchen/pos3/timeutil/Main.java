package net.htlgrieskirchen.pos3.timeutil;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args){
        System.out.println(TimeUtilPro.intToLocalDate(20030201));
        System.out.println(TimeUtilPro.longToLocalDate(200302011234L));
        System.out.println(TimeUtilPro.dateToLocalDate(new Date(2003, Calendar.FEBRUARY, 1)));
        System.out.println(TimeUtilPro.calendarToLocalDate(Calendar.getInstance()));
        System.out.println(TimeUtilPro.intToLocalDateTime(20030201));
        System.out.println(TimeUtilPro.longToLocalDateTime(200302011234L));
        System.out.println(TimeUtilPro.dateToLocalDateTime(new Date(2003, Calendar.FEBRUARY, 1)));
        System.out.println(TimeUtilPro.calendarToLocalDateTime(Calendar.getInstance()));
        System.out.println(TimeUtilPro.localDateToInt(LocalDate.now()));
        //System.out.println(TimeUtilPro.localDateTimeToInt(LocalDateTime.now())); to big for int
        System.out.println(TimeUtilPro.localDateToLong(LocalDate.now()));
        System.out.println(TimeUtilPro.localDateTimeToLong(LocalDateTime.now()));
        System.out.println(TimeUtilPro.localDateToDate(LocalDate.now()));
        System.out.println(TimeUtilPro.localDateTimeToDate(LocalDateTime.now()));
        System.out.println(TimeUtilPro.localDateToCalendar(LocalDate.now()).getTime());
        System.out.println(TimeUtilPro.localDateTimeToCalendar(LocalDateTime.now()).getTime());


    }
}
