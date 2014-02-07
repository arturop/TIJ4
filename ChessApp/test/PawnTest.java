/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arturo.pina
 */
public class PawnTest extends junit.framework.TestCase {
    public void testCreate() {
        final String whiteColour = "white";
        Pawn firstPawn = new Pawn(whiteColour);
        String firstPawnColour = firstPawn.getColour();
        assertEquals(firstPawnColour, whiteColour);
        
        final String blackColour = "black";
        Pawn secondPawn = new Pawn(blackColour);
        String secondPawnColour = secondPawn.getColour();
        assertEquals(secondPawnColour, blackColour);
    }
}
