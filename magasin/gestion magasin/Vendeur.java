public class Vendeur extends employe {
    double tauxDeVente;
    public  Vendeur(int identifiant, String nom, String adresse, int nbr_heures,double tauxDeVente) {
        super(identifiant, nom, adresse, nbr_heures);

        this.tauxDeVente = tauxDeVente;
    }
    public double calculsalaire(){
        return (tauxDeVente *450);
    }
}

