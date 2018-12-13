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
public class Queen extends Piece {

    private Type type;

    public Queen(int x, int y) {
        super(x, y);
        type = Type.QUEEN;
    }

    @Override
    public boolean isValidPath(int x, int y) {
        //move like rook or move like bishop, not both
        if (!super.isValidPath(x, y)) {
            return false;
        }
        if (Math.abs(x - x_position) == Math.abs(y - y_position)) {
            return true;
        } else if (y == y_position && x != x_position) {
            return true;
        } else if (y != y_position && x == x_position) {
            return true;
        }
        return false;
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
