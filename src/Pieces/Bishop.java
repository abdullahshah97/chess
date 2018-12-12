/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pieces;

import Game.Player;

/**
 *
 * @author abdullah
 */
public class Bishop extends Piece {

    private Type type;

    public Bishop(int x, int y) {
        super(x, y);
        type = Type.BISHOP;
    }

    @Override
    public boolean isValidPath(int x, int y) {
        if(!super.isValidPath(x, y))
            return false;
        return (Math.abs(x - x_position) == Math.abs(y - y_position));
    }

    @Override
    public void movePiece(int finalX, int finalY) {
        x_position = finalX;
        y_position = finalY;
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public int getX_position() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getY_position() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setX_position(int x_position) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setY_position(int y_position) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isOnBoard() {
        return onBoard;
    }

    @Override
    public void setOnBoard(boolean onBoard) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
