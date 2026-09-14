import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        List<Entite> monde = new ArrayList<>();
        monde.add(new Loup(0,0));
        monde.add(new Mouton(5,5));
        monde.add(new Plante(2,2));

        System.out.println("------------ Simulateur d'un écosystème simple ----------------");
        for (int tour = 1; tour <= 10; tour++){
            System.out.println("------ Tour n° "+ tour +" ------");
            for (Entite e : monde){
                e.agir();
                if (e instanceof Deplacable){
                ((Deplacable) e).seDeplacer(1, 1);
                }
                System.out.println(e);
            }
            monde.removeIf(e -> !e.estVivant());
        }
    }
}
