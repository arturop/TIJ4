/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arturo.pina
 */
public class Board {
    private int numberOfPawns = 0;
    
    public int getNumberOfPawns() {
        return numberOfPawns;
    }
    
    public void addPawn(Pawn pawn) {
        numberOfPawns = numberOfPawns + 1;
    }
}
