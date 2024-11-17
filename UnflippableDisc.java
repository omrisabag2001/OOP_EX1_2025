public class UnflippableDisc extends SimpleDisc {

    UnflippableDisc(Player owner) {
        super(owner);
    }

     @Override
     public String getType() {
         return "⭕" ;
     }
}
