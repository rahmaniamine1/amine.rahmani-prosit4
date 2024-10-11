package employes;

public abstract class employe {
    private int id;
    private String nom;
    private String adresse;
    private int nbrHeures;

    public employe(int id, String nom, String adresse, int nbrHeures) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.nbrHeures = nbrHeures;
    }

    public abstract double calculerSalaire();

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getNbrHeures() {
        return nbrHeures;
    }

    public abstract String getDetails();

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        employe otherEmploye = (employe) o;

        return id == otherEmploye.id &&
                nom.equals(otherEmploye.nom) &&
                adresse.equals(otherEmploye.adresse) &&
                nbrHeures == otherEmploye.nbrHeures;
    }
    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + nom.hashCode();
        result = 31 * result + adresse.hashCode();
        result = 31 * result + nbrHeures;
        return result;
    }

    public String toString()
    {
        return "id :"+getId()+" Nom :"+getNom()+" Adresse :"
                +getAdresse()+" Nbr d'heure :"+getNbrHeures();
    }


}
