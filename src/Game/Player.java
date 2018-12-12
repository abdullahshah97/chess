/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import Pieces.Pawn;
import Pieces.Piece;
import java.util.ArrayList;

/**
 * Created : 10/12/18
 * @author Abdullah Shah
 */
public class Player {
    private String name;
    private ArrayList<Piece> pieces;
    private Colour colour;
    
    public Player(String name, Colour col){
        this.name = name;
        this.colour = col;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Piece> getPieces() {
        return pieces;
    }

    public Colour getColour() {
        return colour;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPieces(ArrayList<Piece> pieces) {
      /*  for(int i = 0; i < 2; i++){
            switch(this.getColour()){
            case BLACK:
                for(int j = 0; j < 8; j++){
                    pieces.add(new Pawn(1,j,this));
                }
            case WHITE:
                for(int j = 0; j < 8; j++){
                    pieces.add(new Pawn(6,j,this));
                }
            }
        }*/
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }
    
    
}
