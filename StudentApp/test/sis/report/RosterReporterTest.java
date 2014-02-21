/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sis.report;

import sis.studentinfo.*;
import junit.framework.*;

/**
 *
 * @author arturo.pina
 */
public class RosterReporterTest extends TestCase {
    public void testRosterReport() {
        CourseSession session =
            new CourseSession("ENGL", "101",
                new DateUtil().createDate(2003, 1, 6));
        
        session.enroll(new Student("A"));
        session.enroll(new Student("B"));
        String rosterReport = new RosterReporter(session).getReport();
        assertEquals(
            RosterReporter.ROSTER_REPORT_HEADER +
            "A" + RosterReporter.NEWLINE +
            "B" + RosterReporter.NEWLINE +
            RosterReporter.ROSTER_REPORT_FOOTER + "2" +
            RosterReporter.NEWLINE, rosterReport);
    }
    
}
