public class BombDisc extends SimpleDisc {


    BombDisc(Player owner) {
        super(owner);
    }

    @Override
    public String getType() {
        return  "💣";
    }



}
