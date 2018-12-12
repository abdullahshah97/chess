/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pieces;

import Game.Player;
import Exceptions.*;
import Game.Square;

/**
 * Created : 10/12/18
 * @author Abdullah Shah
 */
public abstract class Piece {
    public int x_position;
    public int y_position;
    public boolean onBoard;
    
    /**
     * Constructor for a piece
     * @param x initial x position of piece 
     * @param y initial y position of piece
     * @param player the player that owns the piece
     */
    public Piece(int x, int y){
        x_position = x;
        y_position = y;
        onBoard = true;
    }
    
    /**
     * isValidPath checks that the new position is legal for that piece
     * @param x the proposed final X
     * @param y the proposed final Y
     * @return a boolean which tells if the path is valid
     */
    public boolean isValidPath(int x, int y){
        if(x_position == x && y_position == y){
            return false;
        }
        else if (x < 0 || y < 0 || x > 7 || y > 7)
            return false;
        return true;
    }
    
    /**
     * 
     * @param startX
     * @param startY
     * @param finalX
     * @param finalY
     * @return 
     */
    public abstract void movePiece(int finalX, int finalY);
    
    /**
     * getType returns type of piece
     * @return type of piece
     */
    public abstract Type getType();

    public abstract int getX_position();

    public abstract int getY_position();

    public abstract void setX_position(int x_position);

    public abstract void setY_position(int y_position);

    public abstract boolean isOnBoard();
    
    public abstract void setOnBoard(boolean onBoard);
    
}
