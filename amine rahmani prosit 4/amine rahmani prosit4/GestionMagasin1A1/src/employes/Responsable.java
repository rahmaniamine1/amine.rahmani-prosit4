package employes;



public class Responsable extends employe {
    private double prime;

    public Responsable(int id, String nom, String adresse, int nbrHeures, double prime) {
        super(id, nom, adresse, nbrHeures);
        this.prime = prime;
    }

    @Override
    public double calculerSalaire() {
        double salaireBase = 10 * Math.min(super.getNbrHeures(), 160); // Jusqu'à 160h
        double heuresSupp = Math.max(0, super.getNbrHeures() - 160);   // Au-delà de 160h
        double salaireSupp = heuresSupp * 10 * 1.20;         // 20% en plus pour heures supp
        return salaireBase + salaireSupp + prime;
    }

    public double getPrime() {
        return prime;
    }
    public String toString()
    {
        return "id :"+super.getId()+" Nom :"+super.getNom()+" Adresse :"
                +super.getAdresse()+" Nbr d'heure :"+super.getNbrHeures();
    }
    @Override
    public String getDetails() {
        return "Responsable [ID: " + getId() + ", Nom: " + getNom() + ", Adresse: " + getAdresse() +
                ", Nbr Heures: " + getNbrHeures() + ", Prime: " + prime + "]";
    }
}
