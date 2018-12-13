/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import Pieces.Piece;

/**
 *
 * @author abdullah
 */
public class Square {

    private Piece piece;
    public int x;
    public int y;

    /**
     * Square constructor represents a checkered square on the chess board, and
     * can have a piece or be empty
     *
     * @param x row of square
     * @param y column of square
     */
    public Square(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Piece getPiece() {
        return piece;
    }

    /**
     * if the spot is empty, then place this piece here
     *
     * @param piece
     */
    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    /**
     * checks if the square is empty,
     *
     * @param piece
     * @return true or false if square is empty or not
     */
    public boolean isEmpty(Piece piece) {
        if (this.piece == null) {
            return true;
        }
        return false;
    }

    /**
     * take a piece and replace with current piece
     *
     * @param piece piece which is going to move to occupied spot
     * @return piece that has been replaced
     */
    public Piece replacePiece(Piece piece) {
        Piece retPiece = this.piece;
        this.piece = piece;
        return retPiece;
    }

    /**
     * empties the piece from the square, square now has no piece
     *
     * @return piece that was in the spot
     */
    public Piece emptySquare() {
        Piece retPiece = this.piece;
        this.piece = null;
        return retPiece;
    }
}
