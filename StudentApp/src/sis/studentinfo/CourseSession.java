package sis.studentinfo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Provides a representation of a single-semester
 * session of a specific university course.
 * @author arturo.pina
 */
import java.util.*;

public class CourseSession {
    private String department;
    private String number;
    private ArrayList<Student> students = new ArrayList<Student>();
    private Date startDate;
    
    CourseSession(Date startDate) {
        this.startDate = startDate;
    }
    
    public CourseSession(String department, String number, Date startDate) {
        this.department = department;
        this.number = number;
        this.startDate = startDate;
    }
    
    String getDepartment() {
        return department;
    }
    
    String getNumber() {
        return number;
    }
    
    int getNumberOfStudents() {
        return students.size();
    }
    
   public void enroll(Student student) {
        students.add(student);
    }
    
    Student get(int index) {
        return students.get(index);
    }
    
    Date getStartDate() {
        return startDate;
    }
    
    public ArrayList<Student> getAllStudents() {
        return students;
    }
    
    Date getEndDate() {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(startDate);
        final int sessionLength = 16;
        final int daysInWeek = 7;
        final int daysFromFridayToMonday = 3;
        int numberOfDays = sessionLength * daysInWeek - daysFromFridayToMonday;
        calendar.add(Calendar.DAY_OF_YEAR, numberOfDays);
        return calendar.getTime();
    }
    
}
