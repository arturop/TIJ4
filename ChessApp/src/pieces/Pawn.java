package pieces;

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
    public final static String WHITE = "white";
    public final static String BLACK = "black";
    
    public Pawn() {
        this.colour = WHITE;
    }
    public Pawn(String colour) {
        this.colour = colour;
    }
    
    public String getColour() {
        return colour;
    }
}
