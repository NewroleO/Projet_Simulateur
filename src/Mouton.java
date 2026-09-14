public class Mouton extends Entite {

    public Mouton(int x, int y) {
        super("Mouton", 50, x, y);
    }

    @Override public void agir (){
        if (this.estVivant()){
        this.gagnerEnergie(1);
        }
    }
}