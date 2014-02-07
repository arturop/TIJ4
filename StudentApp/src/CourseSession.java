/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arturo.pina
 */
public class CourseSession {
    private String department;
    private String number;
    
    CourseSession(String department, String number) {
        this.department = department;
        this.number = number;
    }
    
    String getDepartment() {
        return department;
    }
    
    String getNumber() {
        return number;
    }
}
