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
        Pawn firstPawn = new Pawn(Pawn.WHITE);
        String firstPawnColour = firstPawn.getColour();
        assertEquals(firstPawnColour, Pawn.WHITE);
        
        Pawn secondPawn = new Pawn(Pawn.BLACK);
        String secondPawnColour = secondPawn.getColour();
        assertEquals(secondPawnColour, Pawn.BLACK);
    }
    
    public void testDefaultPawn() {
        Pawn pawn = new Pawn();
        String pawnColour = pawn.getColour();
        assertEquals(pawnColour, Pawn.WHITE);
    }
}
