public class Loup extends Entite implements Deplacable {

    public Loup(int x, int y) {
        super("Loup",100, x, y);


    }

    @Override
    public void seDeplacer (int dx, int dy)
    {
        if (this.estVivant()){
        this.x += dx;
        this.y += dy;
        this.consommerEnergie(5);
        }
    }

    @Override public void agir (){
      //  this.seDeplacer(1,1);
        this.consommerEnergie(2);
    }

    public boolean chasser (Entite cible){
        if (this.estVivant() && cible.estVivant() && this != cible){
            cible.consommerEnergie(cible.getEnergie());
            this.gagnerEnergie(20);
            return true;
        }
        return false;
    }

}
