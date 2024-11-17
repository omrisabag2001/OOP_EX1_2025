import java.util.List;
import java.util.Stack;

public class GameLogic implements PlayableLogic {
    private Player player1;
    private Player player2;
    private Board board;
    private Position position;
    private Disc disc;
    private Move move;
    private Stack<Move> recordedMoves = new Stack<>();
    private Stack<Position> validMovePosition = new Stack<>();


    private int turns;    // control over game turns by mod 2. if mod 2 ==0 player 1  turn else player 2 turn

    public GameLogic() {
        board = new Board();


    }


    @Override
    public boolean locate_disc(Position a, Disc disc) {
        return true;
    }

    @Override
    public Disc getDiscAtPosition(Position position) {
        Disc[][] a = this.board.getBoard();
        return a[position.row()][position.col()];

    }

    @Override
    public int getBoardSize() {
        return Board.colSize;
    }

    @Override
    public List<Position> ValidMoves() {

        return validMovePosition;
    }

    @Override
    public int countFlips(Position a) {
        return 0;
    }

    @Override
    public Player getFirstPlayer() {
        return player1;
    }

    @Override
    public Player getSecondPlayer() {
        return player2;
    }

    @Override
    public void setPlayers(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;


    }

    @Override
    public boolean isFirstPlayerTurn() {
        return player1.isPlayerOne;

    }

    @Override
    public boolean isGameFinished() {
        return false;
    }

    @Override
    public void reset() {
      this.board.newBoard();


    }

    @Override
    public void undoLastMove() {
        recordedMoves.pop();

    }

    public boolean flipCountLogic() {
        return true;

    }
}


//    private boolean isVaildMove(Move move) {
//
//        int row = move.getPosition().getRow();
//        int col = move.getPosition().getcolum();
//        if (getDiscAtPosition(move.getPosition()) == null) {
//            if (validrow(move.getPosition().getRow(), ) == true)
//
//                if (row < 8 && row >= 0 && col < 8 && col >= 0) {
//                    for (int i = 0; i < 8; i++) {
//                        for (int j = 0; j < 8; j++) {
//                            Position position1 = new Position(i, j);
//                            if (getDiscAtPosition(position1) == null) {
//
//                            } else j++;
//                        }
//
//                    }
//                }
//
//
//            return true;
//        } else {
//            return false;
//        }
//
//
//    }

//    private boolean validrow(Move move) {
////        if (move.getPosition().getcolum()==0){
//        for (int i = 1; i < move.getPosition().getcolum(); i++) {
//            Position p = new Position(i, move.getPosition().getcolum());
//
//            if (getDiscAtPosition(p) == null) {
//                i++;
//            }
//            Disc a = getDiscAtPosition(p);
//            Move move1 = new Move(p, a);
//            if (a.getOwner() == move.getDisc().getOwner()) {
//                if (betweenloop(move1, move)) {
//                    return true;
//                }
//                return false;
//            }
//
//
//        }
//        for (int i = move.getPosition().getcolum(); i < 8; i++) {
//
//
//        }
//
//
//    }


//    private boolean betweenloop(Move from, Move to) {
//        for (int i = from.getPosition().getcolum() + 1; i < to.getPosition().getcolum(); i++) {
//            if (from.getDisc().getOwner() != to.getDisc().getOwner()) {
//                return true;
//            } else i++;
//
//        }
//        return false;
//    }
//
//
//}
