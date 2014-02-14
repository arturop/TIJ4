/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arturo.pina
 */
public class Pawn {
    private String colour;
    final static String WHITE = "white";
    final static String BLACK = "black";
    
    Pawn() {
        this.colour = WHITE;
    }
    Pawn(String colour) {
        this.colour = colour;
    }
    
    public String getColour() {
        return colour;
    }
}
