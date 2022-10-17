package td1.exo3;


import td1.exo3.Generique.Arbre;
import td1.exo3.Generique.Chaine;
import td1.exo3.Generique.Entier;
import td1.exo3.Generique.Feuille;

public class Main {

    public static void main(String[] args) {

        Entier e1 = new Entier(1);
        Entier e2 = new Entier(25);
        Entier e3 = new Entier(3);
        
        System.out.println(e1.sommer(e2.sommer(e3)));
        Chaine a=new Chaine("a");
        Chaine b=new Chaine("b");
        Chaine c=new Chaine("c");

        System.out.println(a.sommer(b.sommer(c)));

    }
}