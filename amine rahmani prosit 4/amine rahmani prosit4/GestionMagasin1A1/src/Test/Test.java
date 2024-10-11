package Test;

import Entite.Produit;
import Gestion.Magasin;
import employes.employe;
import employes.Caissier;
import employes.Vendeur;
import employes.Responsable;

import java.sql.SQLOutput;
import java.util.Date;
public class Test {
    public static void main(String[] args) {
        // Créer deux magasins
        Magasin carrefour = new Magasin(1, "Centre-Ville");
        Magasin monoprix = new Magasin(2, "Menzah 6");

        // Créer des employés pour Carrefour (2 caissiers, 1 vendeur, 1 responsable)
        Caissier caissier1 = new Caissier(101, "Ahmed", "Tunis", 160, 1);
        Caissier caissier2 = new Caissier(102, "Ali", "Tunis", 160, 2);
        Vendeur vendeur1 = new Vendeur(103, "Sami", "Tunis", 160, 0.05);
        Responsable responsable1 = new Responsable(104, "Sonia", "Tunis", 180, 500.0);

        // Ajouter les employés au magasin Carrefour
        carrefour.ajouterEmploye(caissier1);
        carrefour.ajouterEmploye(caissier2);
        carrefour.ajouterEmploye(vendeur1);
        carrefour.ajouterEmploye(responsable1);

        // Créer des employés pour Monoprix (1 caissier, 3 vendeurs, 1 responsable)
        Caissier caissier3 = new Caissier(105, "Nour", "Ariana", 160, 3);
        Vendeur vendeur2 = new Vendeur(106, "Khaled", "Ariana", 160, 0.07);
        Vendeur vendeur3 = new Vendeur(107, "Lina", "Ariana", 160, 0.06);
        Vendeur vendeur4 = new Vendeur(108, "Imen", "Ariana", 160, 0.08);
        Responsable responsable2 = new Responsable(109, "Hana", "Ariana", 180, 700.0);

        // Ajouter les employés au magasin Monoprix
        monoprix.ajouterEmploye(caissier3);
        monoprix.ajouterEmploye(vendeur2);
        monoprix.ajouterEmploye(vendeur3);
        monoprix.ajouterEmploye(vendeur4);
        monoprix.ajouterEmploye(responsable2);

        // Afficher les caractéristiques des employés de Carrefour
        System.out.println("Employés de Carrefour :");
        carrefour.afficherEmployes();

        // Afficher les caractéristiques des employés de Monoprix
        System.out.println("\nEmployés de Monoprix :");
        monoprix.afficherEmployes();

        Date date=new Date();
        // Créer et ajouter des produits pour Carrefour
        Produit prod1 = new Produit(201,"Lait","Delice",2.3f,date);
        Produit prod2 = new Produit(202, "Pain", "Baguette",2.3f,date);
        Produit prod3 = new Produit(203, "Jus", "Cappy",2.3f,date);
        carrefour.ajouter(prod1);
        carrefour.ajouter(prod2);
        carrefour.ajouter(prod3);

        // Créer et ajouter des produits pour Monoprix
        Produit prod4 = new Produit(204, "Pâtes", "Barilla",2.3f,date);
        Produit prod5 = new Produit(205, "Chocolat", "Milka",2.3f,date);
        Produit prod6 = new Produit(206, "Café", "Nespresso",2.3f,date);
        monoprix.ajouter(prod4);
        monoprix.ajouter(prod5);
        monoprix.ajouter(prod6);

        // Afficher tous les détails de Carrefour
        System.out.println("Détails du magasin Carrefour :");
        System.out.println(carrefour);

        // Afficher tous les détails de Monoprix
        System.out.println("\nDétails du magasin Monoprix :");
        System.out.println(monoprix);

        // Création de magasins et d'employés ici...

        // Afficher les salaires des employés
        carrefour.afficherSalaires();
        monoprix.afficherSalaires();

        // Afficher les primes des responsables
        carrefour.afficherPrimesResponsables();
        monoprix.afficherPrimesResponsables();

        // Afficher tous les employés
        carrefour.afficherEmployes1();
        monoprix.afficherEmployes1();
        // Comparaison des deux employés avec equals
        if (vendeur2.equals(vendeur2)) {
            System.out.println("Les deux employés sont identiques.");
        } else {
            System.out.println("Les deux employés sont différents.");
        }

    }
}
