/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arturo.pina
 */
public class BoardTest extends junit.framework.TestCase {
    public void testCreate() {
        Board board = new Board();
        assertEquals(board.getNumberOfPawns(), 0);
    }
    public void testAddPawns() {
        Board board = new Board();
        
        Pawn whitePawn = new Pawn(Pawn.WHITE);
        board.addPawn(whitePawn);
        assertEquals(board.getNumberOfPawns(), 1);
        
        Pawn blackPawn = new Pawn(Pawn.BLACK);
        board.addPawn(blackPawn);
        assertEquals(board.getNumberOfPawns(), 2);
    }
}
