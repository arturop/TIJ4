/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package studentinfo;

import java.util.*;
/**
 *
 * @author arturo.pina
 */
public class RosterReporter {
    static final String NEWLINE = System.getProperty("line.separator");
    static final String ROSTER_REPORT_HEADER =
            "Student" + NEWLINE +
            "-" + NEWLINE;
    static final String ROSTER_REPORT_FOOTER =
            NEWLINE + "# students = ";
    
    private CourseSession session;
        
    RosterReporter(CourseSession session) {
        this.session = session;
    }
    
    String getReport() {
        StringBuilder buffer = new StringBuilder();
        
        buffer.append(ROSTER_REPORT_HEADER);
        
        for (Student student: session.getAllStudents()) {
            buffer.append(student.getName());
            buffer.append(NEWLINE);
        }
        
        buffer.append(
                ROSTER_REPORT_FOOTER + session.getAllStudents().size() +
                NEWLINE);
        
        return buffer.toString();
    }
}
