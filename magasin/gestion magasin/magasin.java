public class magasin {

    String adress;
    int id;
    int Capasitee;
    static int nbr;
    Produit[] products;
    employe[]employes;
    String nom;
    magasin (){}

    magasin(String adress,int id,int capasitee,Produit[] p, employe[] e,String nom){
        this.adress=adress;
        this.id=id;
        this.Capasitee=capasitee;
        this.products = new Produit[50];
        this.products=p;
        this. employes= new  employe[20];
        this. employes=e;
        this.nom=nom;
        nbr ++;
    }


    public boolean ajouterEmploye(employe e) {
        if (nbr <20) {
            employes[nbr]=e;
            nbr++;}
        return false;
    }

    void AfficherMagasin(){
        System.out.println(id +" "+ adress +" "+Capasitee);
        for (int i=0;i<products.length;i++){
            if (products[i] != null) {
                products[i].afficherProduit();
            }}
    }
    void AfficherMagasinemployee(){
        for (int j=0;j<employes.length;j++) {
            if (employes[j] != null) {

                employes[j].AfficherEmploye();

            }}}}