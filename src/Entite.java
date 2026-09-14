public abstract class Entite {

    // Atribut de base 
    private String nom;
    private int energie;
    protected int x; 
    protected int y; 

    public Entite(String nom, int energie, int x, int y) {
        this.nom = nom; 
        this.energie = energie;
        this.x = x; 
        this.y = y; 
    }

    public abstract void agir();

    // Créer un getPosition qui retourne les valeurs x et y 
    //  -> Sous forme de list ou array

    public String getNom() {
        return this.nom;
    }

    public int getEnergie() {
        return this.energie;
    }

    @Override
    public String toString () {
        return this.nom +" [x="+ this.x +" , y="+ this.y +" , energie="+ this.energie +" ]";
    }

//    public void seDeplacer(int dx,int dy){
//        if (estVivant()) {
//            // Utiliser un getPosition pour calculer la distance destination 
//            //  distance = Math.sqrt(Math.pow(this.x - dx, 2) + Math.pow(this.y - dy, 2))
//           this.x += dx;
//            this.y += dy;
//            // this.consommerEnergie(5*distance)
//            this.consommerEnergie(5);
//        }
//    }

    public void consommerEnergie(int quantite){
        if (this.energie - quantite < 0) {
            this.energie = 0;
            return;
        }
        this.energie = this.energie - quantite;
    }

    public boolean estVivant(){
        return energie > 0;
    }

    public void gagnerEnergie(int quantite){
        if (quantite > 0){
        this.energie += quantite;
        }
    }

    public boolean estSurLaMemeCase(Entite autre){ 
        if (autre == null) {
            return false;
        }
        return (this.x == autre.x && this.y == autre.y); 
    }

 


}
