package lessons.oop.basic.lesson7;

import java.util.Arrays;

public class ChessPiece {
    private String color = "white"; //default is "default", but programmers should use "private" for all variables
    private String type = "pawn";
    private String position = "0, 0";
    public int chessPiecesCounter = 0;
    public static int chessPiecesStaticCounter = 0;
    public final static String GAME_DESCRIPTION = "This is a chess game";
    public final static String PIECE_DESCRIPTION_PAWN = "A pawn can move one square forward";
    public final static String PIECE_DESCRIPTION_BISHOP = "A bishop can move diagonally";
    public final static String PIECE_DESCRIPTION_KNIGHT = "A knight moves in an 'L-shape'";
    public final static String PIECE_DESCRIPTION_ROOK = "A rook can move horizontally and vertically";
    public final static String PIECE_DESCRIPTION_QUEEN = "A queen can move horizontally, vertically and diagonally";
    public final static String PIECE_DESCRIPTION_KING = "A king can move one square horizontally, vertically and diagonally";
    public final static String[] PIECES_DESCRIPTION = new String[6];

    //Initialization block. The code in "{}" brackets will be executed when the object is created/
    {
        chessPiecesCounter++;
        chessPiecesStaticCounter++;
        System.out.println(chessPiecesCounter);
        System.out.println(chessPiecesStaticCounter);
    }

    //Static initialisation (for class). Initialized when the class first appears
    static {
        PIECES_DESCRIPTION[0] = PIECE_DESCRIPTION_PAWN;
        PIECES_DESCRIPTION[1] = PIECE_DESCRIPTION_BISHOP;
        PIECES_DESCRIPTION[2] = PIECE_DESCRIPTION_KNIGHT;
        PIECES_DESCRIPTION[3] = PIECE_DESCRIPTION_ROOK;
        PIECES_DESCRIPTION[4] = PIECE_DESCRIPTION_QUEEN;
        PIECES_DESCRIPTION[5] = PIECE_DESCRIPTION_KING;
        System.out.println(Arrays.toString(PIECES_DESCRIPTION));
    }
    //Static methods
    public static void piecesList() {
        System.out.println("Pieces list: pawn, bishop, knight, rook, queen, king");
        //this.color //this.... don't work, because it isn't an instance of the class
    }


    //Setters
    public void setColor(String pieceColor) {
        if (pieceColor.equals("white")) {
            this.color = pieceColor;
        } else if (pieceColor.equals("black")) {
            this.color = pieceColor;
        } else {
            System.out.println("Color must be white or black!");
        }
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    //Getters
    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    //Constructor (default values)
    public ChessPiece () {
    }

    //Constructor overload
    public ChessPiece(String colorName, String typeName, String piecePosition) {
        this.color = colorName;
        this.type = typeName;
        this.position = piecePosition;
    }

    public void movePiece(String pieceType) { //keyword void mean what you can't pass result to variable
        System.out.printf("You can't move %s, because it is glued!\n", pieceType);
    }

    public String touch(boolean isTouched) {
      if (isTouched) {
          return "Yes";
      }
      return "No";
    }

    //varArgs "..."
    //Must be the last argument of the method
    public void feed(String ...pieceTypeToFeed) {
        System.out.printf("\nI feeding %s", Arrays.toString(pieceTypeToFeed));
    }

    @Override
    public String toString() {
        return "ChessPiece{" +
                "colour='" + color + '\'' +
                ", type='" + type + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
