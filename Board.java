public class Board {
    public static final int colSize = 8;
    public static final int rowSize = 8;
    public Disc[][] board;
    private Player player1;
    private Player player2;



    public Board(){
        this.board = new Disc[rowSize][colSize];
    }

    public Disc[][] getBoard() {
        return this.board;
    }

    public void newBoard(){
        this.board = new Disc[8][8];
        this.board[4][4] = new SimpleDisc(this.player1);
        this.board[3][3] = new SimpleDisc(this.player1);
        this.board[4][3] = new SimpleDisc(this.player1);
        this.board[3][4] = new SimpleDisc(this.player1);


    }



}
