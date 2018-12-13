/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pieces;

import Game.Player;

/**
 * Created : 10/12/18
 *
 * @author Abdullah Shah
 */
public class Pawn extends Piece {

    private final Type type;
    private boolean firstMove = true;

    public Pawn(int x, int y) {
        super(x, y);
        type = Type.PAWN;
    }

    /**
     * checks if valid move
     *
     * @param x should equal current x
     * @param y should be less than 3 and more than 0 need to include en-passant
     * @return
     */
    @Override
    public boolean isValidPath(int x, int y) {
        if (!super.isValidPath(x, y)) {
            return false;
        }
        if (Math.abs(y - y_position) == 1 && x == x_position) {
            return true;
        } else if (Math.abs(y - y_position) == 2 && firstMove == true && x == x_position) {
            return true;
        }
        return false;
    }

    @Override
    public void movePiece(int finalX, int finalY) {
        this.x_position = finalX;
        this.y_position = finalY;
    }

    @Override
    public Type getType() {
        return this.type;
    }

    public boolean isFirstMove() {
        return firstMove;
    }

    public void setFirstMove(boolean firstMove) {
        this.firstMove = firstMove;
    }

    @Override
    public void setX_position(int x_position) {
        this.x_position = x_position;
    }

    @Override
    public void setY_position(int y_position) {
        this.y_position = y_position;
    }

    @Override
    public boolean isOnBoard() {
        return onBoard;
    }

    @Override
    public void setOnBoard(boolean onBoard) {
        this.onBoard = onBoard;
    }

}
