package chess;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arturo.pina
 */
import pieces.Pawn;
import java.util.ArrayList;

public class Board {
    private int numberOfPawns = 0;
    private ArrayList<Pawn> piecesInBoard = new ArrayList<Pawn>();
    
    public int getNumberOfPawns() {
        return piecesInBoard.size();
    }
    
    public void addPawn(Pawn pawn) {
        piecesInBoard.add(pawn);
    }
    
    public Pawn get(int position) {
        return piecesInBoard.get(position);
    }
}
