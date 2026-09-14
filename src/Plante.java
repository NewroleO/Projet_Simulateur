public class Plante extends Entite  {


    public Plante (int x, int y){
        super("Plante",30,x,y);
    }

    @Override
    public void agir () {
        if (this.estVivant()){
            this.gagnerEnergie(2);
        }

    }
}
