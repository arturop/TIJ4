/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sis;

import junit.framework.TestSuite;
/**
 *
 * @author arturo.pina
 */
public class AllTests {
    public static TestSuite suite() {
        TestSuite suite = new TestSuite();
        suite.addTest(sis.report.AllTests.suite());
        suite.addTest(sis.studentinfo.AllTests.suite());
        return suite;
    }
}
