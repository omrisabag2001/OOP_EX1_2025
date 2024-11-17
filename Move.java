import java.util.Stack;

public class Move {
    private Position position;
    private Disc disc;

    public void makeMove(Disc[][] board , Disc disc , Position position){
        board[position.row()][position.col()] = disc;

    }

    public Move(Position p){
        this.position = p;
    }


    public Position position(){
        return null;

    }
    public Disc disc(){
        return null;
    }
}
