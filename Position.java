public class Position {

    private int colume;
    private int row;


    public Position(int row , int col){
        if (col < 8 && col>=0 && row <8 && row >= 0) {
            this.colume = col;
            this.row = row;
        }
        else {throw new RuntimeException("un valid position!");

        }

    }


    public int col(){
        return this.colume;
    }

    public int row(){
        return this.row;
    }



    }




