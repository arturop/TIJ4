package chess;

import pieces.Pawn;

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
    Board board;
    
    public void setUp() {
        board = new Board();
    }
    public void testCreate() {
        assertEquals(board.getNumberOfPawns(), 0);
    }
    public void testAddPawns() {
        
        Pawn whitePawn = new Pawn(Pawn.WHITE);
        board.addPawn(whitePawn);
        assertEquals(board.getNumberOfPawns(), 1);
        assertEquals(board.get(0), whitePawn);
        
        Pawn blackPawn = new Pawn(Pawn.BLACK);
        board.addPawn(blackPawn);
        assertEquals(board.getNumberOfPawns(), 2);
        assertEquals(board.get(1), blackPawn);
        
    }
}
