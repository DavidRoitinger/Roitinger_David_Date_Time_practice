package net.htlgrieskirchen.pos3.timeutil;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.*;

public class TimeUtilProTest {

    @Test
    public void test_IntToLocalDate() {
        System.out.println("IntToLocalDate");
        assertEquals(LocalDate.of(2003, 2,1), TimeUtilPro.intToLocalDate(20030201));


    }

    @org.junit.Test
    public void test_LongToLocalDate() {
        System.out.println("LongToLocalDate");
        assertEquals(LocalDate.of(2003, 2,1), TimeUtilPro.longToLocalDate(200302011234L));

    }

    @org.junit.Test
    public void test_DateToLocalDate() {
        System.out.println("DateToLocalDate");
        assertEquals(LocalDate.of(2003, 2,1), TimeUtilPro.dateToLocalDate(new Date(2003, Calendar.FEBRUARY, 1)));

    }

    @org.junit.Test
    public void test_CalendarToLocalDate() {
        System.out.println("CalendarToLocalDate");
        assertEquals(LocalDate.now(), TimeUtilPro.calendarToLocalDate(Calendar.getInstance()));

    }

    @org.junit.Test
    public void test_IntToLocalDateTime() {
        System.out.println("IntToLocalDateTime");
        assertEquals(LocalDateTime.of(2003, 2,1,0,0), TimeUtilPro.intToLocalDateTime(20030201));
    }

    @org.junit.Test
    public void test_LongToLocalDateTime() {
        System.out.println("LongToLocalDateTime");
        assertEquals(LocalDateTime.of(2003, 2,1,12,34), TimeUtilPro.longToLocalDateTime(200302011234L));

    }

    @org.junit.Test
    public void test_DateToLocalDateTime() {
        System.out.println("DateToLocalDateTime");
        assertEquals(LocalDateTime.of(2003, 2,1,0,0), TimeUtilPro.dateToLocalDateTime(new Date(2003, Calendar.FEBRUARY, 1)));

    }

    @org.junit.Test
    public void test_CalendarToLocalDateTime() {
        System.out.println("CalendarToLocalDateTime");
        Calendar calendar = Calendar.getInstance();
        calendar.set(2003, Calendar.FEBRUARY, 1, 12,34,0);

        assertEquals(LocalDateTime.of(2003,2,1,12,34,0), TimeUtilPro.calendarToLocalDateTime(calendar).minusNanos(TimeUtilPro.calendarToLocalDateTime(calendar).getNano()));

    }

    @org.junit.Test
    public void test_LocalDateToInt() {
        System.out.println("LocalDateToInt");
        assertEquals(20030201, TimeUtilPro.localDateToInt(LocalDate.of(2003, 2,1)));

    }

    @org.junit.Test
    public void test_LocalDateTimeToInt() {
        System.out.println("LocalDateTimeToInt");
        //assertEquals(200302011234, TimeUtilPro.localDateTimeToInt(LocalDateTime.of(2003, 2,1,12,34)));
        //Not possible because the number is too big for Integer!
        fail();
    }

    @org.junit.Test
    public void test_LocalDateToLong() {
        System.out.println("LocalDateToLong");
        assertEquals(20030201L, TimeUtilPro.localDateToLong(LocalDate.of(2003, 2,1)));

    }

    @org.junit.Test
    public void test_LocalDateTimeToLong() {
        System.out.println("LocalDateTimeToLong");
        assertEquals(20030201123400L, TimeUtilPro.localDateTimeToLong(LocalDateTime.of(2003, 2,1,12,34)));
    }

    @org.junit.Test
    public void test_LocalDateToDate() {
        System.out.println("LocalDateToDate");
        assertEquals(new Date(103, Calendar.FEBRUARY, 1), TimeUtilPro.localDateToDate(LocalDate.of(2003, 2,1)));
    }

    @org.junit.Test
    public void test_LocalDateTimeToDate() {
        System.out.println("LocalDateTimeToDate");
        assertEquals(new Date(103, Calendar.FEBRUARY, 1, 12, 34), TimeUtilPro.localDateTimeToDate(LocalDateTime.of(2003, 2,1, 12, 34)));
    }

    @org.junit.Test
    public void test_LocalDateToCalendar() {
        System.out.println("LocalDateToCalendar");
        Calendar calendar = Calendar.getInstance();
        calendar.set(2003, 1, 1, 0 ,0,0);

        assertEquals(calendar.getTime().getTime(), TimeUtilPro.localDateToCalendar(LocalDate.of(2003, 2,1)).getTime().getTime(), 100);
    }

    @org.junit.Test
    public void test_LocalDateTimeToCalendar() {
        System.out.println("LocalDateTimeToCalendar");
        Calendar calendar = Calendar.getInstance();
        calendar.set(2003, 1, 1, 12 ,34,0);

        assertEquals(calendar.getTime().getTime(), TimeUtilPro.localDateTimeToCalendar(LocalDateTime.of(2003, 2,1, 12, 34)).getTime().getTime(), 100);

    }
}