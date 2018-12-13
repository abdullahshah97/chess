/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

/**
 *
 * @author abdullah
 */
public class Chess {

    public static void main(String[] args) {

        Board board = new Board();

        Player A = new Player("Batman", Colour.BLACK);
        Player B = new Player("Superman", Colour.WHITE);

        initialiseBoard(A, B, board);
    }

    public static void initialiseBoard(Player A, Player B, Board board) {
        A.initiliasePieces();
        B.initiliasePieces();
        for (int i = 0; i < A.getPieces().size(); i++) {
            board.getSquares()[A.getPieces().get(i).getX_position()][A.getPieces().get(i).getX_position()].setPiece(A.getPieces().get(i));
        }
        for (int i = 0; i < B.getPieces().size(); i++) {
            board.getSquares()[B.getPieces().get(i).getX_position()][B.getPieces().get(i).getX_position()].setPiece(B.getPieces().get(i));
        }
    }
}
