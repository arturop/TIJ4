/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chess;

import pieces.PawnTest;
import junit.framework.TestSuite;

/**
 *
 * @author arturo.pina
 */
public class AllTests extends junit.framework.TestSuite {
    public static TestSuite suite() {
        TestSuite suite = new TestSuite();
        suite.addTestSuite(PawnTest.class);
        suite.addTestSuite(BoardTest.class);
        return suite;
    }
}
