package sis.studentinfo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arturo.pina
 */
import sis.studentinfo.CourseSession;
import java.util.*;
import junit.framework.TestCase;


public class CourseSessionTest extends TestCase {
    private CourseSession session;
    private Date startDate;
    
    Date createDate(int year, int month, int date) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.clear();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.DAY_OF_MONTH, date);
        return calendar.getTime();
    }
    
    public void setUp() {
        startDate = new DateUtil().createDate(2003, 1, 6);
        session = new CourseSession("ENGL", "101", startDate);
    }
    public void testCreate() {
        assertEquals("ENGL", session.getDepartment());
        assertEquals("101", session.getNumber());
        assertEquals(0, session.getNumberOfStudents());
        assertEquals(startDate, session.getStartDate());
    }
    
    public void testEnrollStudents() {    
        Student student1 = new Student("Cain DiVoe");
        session.enroll(student1);
        assertEquals(1, session.getNumberOfStudents());
        assertEquals(student1, session.get(0));
        
        Student student2 = new Student("Coralee DeVaughn");
        session.enroll(student2);
        assertEquals(2, session.getNumberOfStudents());
        assertEquals(student1, session.get(0));
        assertEquals(student2, session.get(1));
    }
    
    public void testCourseDates() {
        Date sixteenWeeksOut = new DateUtil().createDate(2003, 4, 25);
        assertEquals(sixteenWeeksOut, session.getEndDate());
    }
    
}