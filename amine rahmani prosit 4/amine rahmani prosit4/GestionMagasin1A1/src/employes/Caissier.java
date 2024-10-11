package employes;

public class Caissier extends employe {
    private int numeroDeCaisse;

    public Caissier(int id, String nom, String adresse, int nbrHeures, int numeroDeCaisse) {
        super(id, nom, adresse, nbrHeures);
        this.numeroDeCaisse = numeroDeCaisse;
    }

    @Override
    public double calculerSalaire() {
        double salaireBase = 5 * Math.min(super.getNbrHeures(), 180); // Jusqu'à 180h
        double heuresSupp = Math.max(0, super.getNbrHeures() - 180);  // Au-delà de 180h
        double salaireSupp = heuresSupp * 5 * 1.15;         // 15% en plus pour heures supp
        return salaireBase + salaireSupp;
    }

    public int getNumeroDeCaisse() {
        return numeroDeCaisse;
    }

    public String toString()
    {
        return "id :"+super.getId()+" Nom :"+super.getNom()+" Adresse :"
                +super.getAdresse()+" Nbr d'heure :"+super.getNbrHeures();
    }

    @Override
    public String getDetails() {
        return "Caissier [ID: " + getId() + ", Nom: " + getNom() + ", Adresse: " + getAdresse() +
                ", Nbr Heures: " + getNbrHeures() + ", Numéro de Caisse: " + numeroDeCaisse + "]";
    }
}
