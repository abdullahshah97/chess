/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author abdullah
 */
class OutOfBoardException extends Exception {
    public OutOfBoardException(){
    }
    
    @Override
    public String getMessage(){
        return "destination square is off the board";
    }
}
