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
 *
 * @author Abdullah Shah
 */
public class Board {
//    private ArrayList<Piece> pieces;

    private Square[][] squares;

    public Board() {
        squares = new Square[8][8];
        for (int i = 0; i < squares.length; i++) {
            for (int j = 0; j < squares.length; j++) {
                squares[i][j] = new Square(i, j);
            }
        }
    }

    public void setPieces(Player play) {

    }
}
