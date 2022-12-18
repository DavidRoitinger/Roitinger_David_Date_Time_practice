package net.htlgrieskirchen.pos3.timeutil;

import java.time.*;
import java.time.temporal.TemporalField;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;


public class TimeUtilPro
{   
    private TimeUtilPro() {
    }

    // ########## LOCALDATE METHODS ##########
    
    public static LocalDate intToLocalDate(int date) {
        String str = date+"";

        return LocalDate.parse(str.substring(0,4)+"-"+str.substring(4,6)+"-"+str.substring(6, 8));
    }

    public static LocalDate longToLocalDate(long dateTime) {
        String str = dateTime+"";

        return LocalDate.parse(str.substring(0,4)+"-"+str.substring(4,6)+"-"+str.substring(6, 8));
    }
    
    public static LocalDate dateToLocalDate(Date dateTime) {
        return LocalDate.of(dateTime.getYear(), dateTime.getMonth()+1, dateTime.getDate());
    }
    
    public static LocalDate calendarToLocalDate(Calendar dateTime) {
        return LocalDate.ofInstant(dateTime.getTime().toInstant(), ZoneId.systemDefault());
    }
    
    // ########## LOCALDATETIME METHODS ##########
            
    public static LocalDateTime intToLocalDateTime(int date) {
        String str = date+"";

        return LocalDateTime.parse(str.substring(0,4)+"-"+str.substring(4,6)+"-"+str.substring(6, 8)+"T00:00:00");
    }
    
    public static LocalDateTime longToLocalDateTime(long dateTime) {
        String str = dateTime+"";

        return LocalDateTime.parse(str.substring(0,4)+"-"+str.substring(4,6)+"-"+str.substring(6, 8)+"T"+str.substring(8, 10)+":"+str.substring(10, 12)+":00");
    }
    
    public static LocalDateTime dateToLocalDateTime(Date dateTime) {
        return LocalDateTime.of(dateTime.getYear(), dateTime.getMonth()+1, dateTime.getDate(), 0, 0);
    }
    
    public static LocalDateTime calendarToLocalDateTime(Calendar dateTime) {
        return LocalDateTime.ofInstant(dateTime.getTime().toInstant(), ZoneId.systemDefault());
    }
           
    // ########## INT METHODS ##########
    
    public static int localDateToInt(LocalDate date) {
        StringBuilder sB = new StringBuilder();
        sB.append(date.getYear());
        sB.append(String.format("%02d", date.getMonth().ordinal()+1));
        sB.append(String.format("%02d", date.getDayOfMonth()));
        return Integer.parseInt(sB.toString());
    }

    public static int localDateTimeToInt(LocalDateTime dateTime) {
        StringBuilder sB = new StringBuilder();
        sB.append(dateTime.getYear());
        sB.append(String.format("%02d", dateTime.getMonth().ordinal()+1));
        sB.append(String.format("%02d", dateTime.getDayOfMonth()));
        sB.append(String.format("%02d", dateTime.getHour()));
        sB.append(String.format("%02d", dateTime.getMinute()));
        sB.append(String.format("%02d", dateTime.getSecond()));
        return Integer.parseInt(sB.toString());
    }

    // ########## LONG METHODS ##########
    
    public static long localDateToLong(LocalDate date) {
        StringBuilder sB = new StringBuilder();
        sB.append(date.getYear());
        sB.append(String.format("%02d", date.getMonth().ordinal()+1));
        sB.append(String.format("%02d", date.getDayOfMonth()));
        return Long.parseLong(sB.toString());
    }

    public static long localDateTimeToLong(LocalDateTime dateTime) {
        StringBuilder sB = new StringBuilder();
        sB.append(dateTime.getYear());
        sB.append(String.format("%02d", dateTime.getMonth().ordinal()+1));
        sB.append(String.format("%02d", dateTime.getDayOfMonth()));
        sB.append(String.format("%02d", dateTime.getHour()));
        sB.append(String.format("%02d", dateTime.getMinute()));
        sB.append(String.format("%02d", dateTime.getSecond()));
        return Long.parseLong(sB.toString());
    }

    // ########## DATE METHODS ##########
    
    @SuppressWarnings("deprecation")
    public static Date localDateToDate(LocalDate date) {
        return Date.from(Instant.ofEpochSecond(date.toEpochSecond(LocalTime.of(0,0,0), ZoneId.systemDefault().getRules().getOffset(Instant.now()))));
    }

    @SuppressWarnings("deprecation")
    public static Date localDateTimeToDate(LocalDateTime dateTime) {
        return Date.from(Instant.ofEpochSecond(dateTime.toEpochSecond(ZoneId.systemDefault().getRules().getOffset(Instant.now()))));
    }

    // ########## CALENDAR METHODS ##########
    
    public static Calendar localDateToCalendar(LocalDate date) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(date.getYear(), date.getMonth().ordinal(), date.getDayOfMonth(), 0 ,0,0);
        return calendar;
    }

    public static Calendar localDateTimeToCalendar(LocalDateTime dateTime) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(dateTime.getYear(), dateTime.getMonth().ordinal(), dateTime.getDayOfMonth(), dateTime.getHour(), dateTime.getMinute(), dateTime.getSecond());
        return calendar;
    }

}
