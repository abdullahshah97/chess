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
public class King extends Piece {

    private Type type;

    public King(int x, int y) {
        super(x, y);
        type = Type.KING;
    }

    @Override
    public boolean isValidPath(int x, int y) {
        if (!super.isValidPath(x, y)) {
            return false;
        }
        return Math.abs(x - x_position) < 2 && Math.abs(y - y_position) < 2;
    }

    @Override
    public void movePiece(int finalX, int finalY) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Type getType() {
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setOnBoard(boolean onBoard) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
