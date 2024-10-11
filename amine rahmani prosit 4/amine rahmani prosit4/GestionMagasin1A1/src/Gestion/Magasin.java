package Gestion;

import Entite.Produit;
import java.util.ArrayList;
import employes.employe;
import employes.Vendeur;
import employes.Responsable;
import employes.Caissier;

public class Magasin {

    private int id;

    private String adresse;

    private final int CAPACITE = 50;
    private final int CAPACITE_EMPLOYES = 20;



    private int comp;
    private Produit[] tabprod = new Produit[CAPACITE];
    private static int total;
    private ArrayList<employe> employe = new ArrayList<>();

    public Magasin(int id, String ad) {
        this.id = id;
        adresse = ad;
    }

    public void ajouter(Produit p) {
        if (comp < CAPACITE) {
            if(chercherProduit(p)==false) {
                tabprod[comp] = p;
                comp++;
                total++;
            }else {
                System.out.println("le produit existe déjà");
            }
        } else {

            System.out.println("Magasin plein");
        }
    }


    public static int getTotal(){
        return total;
    }
    public void afficherMarquePro() {
        for (int i = 0; i < comp; i++) {
            System.out.println("Marque :" + tabprod[i].getMarque());
        }

    }

    public String toString() {
        String str = "L'ensemble des produits\n";

        for (int i = 0; i < comp; i++) {
            str += tabprod[i] + "\n";
        }

        return "L'id :" + id + " l'adresse :" + adresse + "\n" + str;
    }

    public boolean chercherProduit(Produit p){
        for (int i=0;i<comp;i++)
        { if(Produit.comparer(p,tabprod[i]))
           // if(p.comparer(tabprod[i]))
                return true;
        }
        return false;
    }



    public Magasin plusProduit(Magasin m)
    {
        if(this.comp<m.comp)
            return m;
        else if (this.comp>m.comp) {
            return this;
        }
        else return null;
    }

    public static Magasin plusProduit(Magasin m1,Magasin m2)
    {
        if(m1.comp<m2.comp)
            return m2;
        else if (m1.comp>m2.comp) {
            return m1;
        }
        else return null;
    }


    public int chercherProduitIndice(Produit p)
    {
     for (int i=0;i<comp;i++)

     {
         if(Produit.comparer(p,tabprod[i]))

             return i;
     }
        return -1;
    }
    public boolean supprimer(Produit p)
    {
        int indice=chercherProduitIndice(p);

        if(indice!=-1)
        {

            for (int i=indice;i<=comp-1;i++)
            {
                tabprod[i]=tabprod[i+1];
            }
            tabprod[comp]=null;
            comp--;
            total--;
        }

        return false;
    }

    public boolean ajouterEmploye(employe e) {
        if (employe.size() < CAPACITE_EMPLOYES) {
            employe.add(e);
            return true;
        } else {
            System.out.println("Le magasin a atteint sa capacité maximale d'employés.");
            return false;
        }
    }




    public void afficherEmployes() {
        for (employe e : employe) {
            System.out.println(e.getDetails());
        }
    }
    public void afficherPrimesResponsables() {
        System.out.println("Primes des responsables du magasin " + this.adresse + ":");
        for (employe emp : employe) {
            if (emp instanceof Responsable) {
                Responsable resp = (Responsable) emp;
                System.out.println(resp.getNom() + " : " + resp.getPrime() + " DT");
            }
        }
    }

    public void afficherEmployes1() {
        System.out.println("Liste des employés du magasin " + this.adresse + ":");
        for (employe emp : employe) {
            System.out.println(emp.toString());
        }
    }


    public void afficherSalaires() {
        System.out.println("Salaires des employés du magasin " + this.adresse + ":");
        for (employe emp : employe) {
            System.out.println(emp.getNom() + " : " + emp.calculerSalaire() + " DT");
        }
    }
}
