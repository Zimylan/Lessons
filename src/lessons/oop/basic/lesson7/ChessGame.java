package lessons.oop.basic.lesson7;

import java.util.Arrays;

public class ChessGame {
    public static void main(String[] args) {
        ChessPiece chessPiece = new ChessPiece("white", "bishop", "0, 0");
        System.out.println(chessPiece);

        chessPiece.setColor("white");
        System.out.println(chessPiece.getColor());

        chessPiece.movePiece(chessPiece.getType());

        String pieceIsTouched = chessPiece.touch(true);
        System.out.println(pieceIsTouched);

        chessPiece.feed("bishop", "funny bunny", "crocodile");

        ChessPiece[] chessPiecesArray = new ChessPiece[11];
        for (int i = 0; i < 11; i++) {
            ChessPiece chessPieceI = new ChessPiece();
            chessPiecesArray[i] = chessPieceI;
        }

        ChessPiece.piecesList(); //Class method, there is no need to initialize an instance of the Class
        System.out.println(ChessPiece.GAME_DESCRIPTION);
        //ChessPiece.GAME_DESCRIPTION = "It is final!"; // Can't change final variable

        System.out.println(Arrays.toString(ChessPiece.PIECES_DESCRIPTION));
    }
}
