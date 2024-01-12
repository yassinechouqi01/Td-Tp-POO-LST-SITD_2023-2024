package TP.controllers;

import TP.gestion.Main;
import TP.models.ETudiant;
import TP.models.FIliere;
import TP.services.DB;
import TP.services.EtudiantServices;
import TP.services.FiliereServices;

public class EtudiantController {

    public static void showMenu() {
        System.out.println("-------------------------[ Étudiants ]---------------------------");
        System.out.println("1: Pour ajouter un étudiant");
        System.out.println("2: Pour afficher les étudiants");
        System.out.println("3: Pour modifier un étudiant");
        System.out.println("4: Pour supprimer un étudiant");
        System.out.println("0: Pour retourner au menu principal");

        int option = Main.getIntInput("Veuillez sélectionner une option : ");
        switch (option) {
            case 1:
                createEtudiant();
                break;
            case 2:
                showEtudiants();
                break;
            case 3:
                editEtd();
                break;
            case 4:
                destroyEtd();
                break;
            default:
                Main.showPrincipalMenu();
        }
    }

    public static void showEtudiants() {
        for (ETudiant etudiant : DB.etudiants) {
            System.out.print("Id : " + etudiant.getId());
            System.out.print(" | Nom : " + etudiant.getNom());
            System.out.print(" | Prénom : " + etudiant.getPrenom());
            System.out.println("");
        }
    }

    public static void createEtudiant() {
        String nom = Main.getStringInput("Entrez le nom :");
        String prenom = Main.getStringInput("Entrez le prénom :");
        String email = Main.getStringInput("Entrez l'email :");
        int apogee = Main.getIntInput("Entrez l'apogée :");

        // Display existing filieres to choose from
        FiliereController.showFilieres();

        int filiereId = Main.getIntInput("Sélectionnez une filière par id :");
        FIliere filiere = FiliereServices.getFiliereById(filiereId);

        EtudiantServices.addEtd(nom, prenom, email, apogee, filiere);

        showEtudiants();
        showMenu();
    }
    public static void editEtd() {
        showEtudiants();
        int id = Main.getIntInput("Sélectionnez un étudiant par id :");
        String nom = Main.getStringInput("Entrez le nom :");
        String prenom = Main.getStringInput("Entrez le prénom :");
        String email = Main.getStringInput("Entrez l'email :");
        int apogee = Main.getIntInput("Entrez l'apogée :");
        int filiereId = Main.getIntInput("Sélectionnez une filière par id :");
        FIliere filiere = FiliereServices.getFiliereById(filiereId);
        EtudiantServices.updateEtd(id, nom, prenom, email, apogee,filiere);

        showEtudiants();
        showMenu();
    }

    public static void destroyEtd() {
        showEtudiants();
        int id = Main.getIntInput("Sélectionnez un étudiant par id :");
        EtudiantServices.deleteEtdById(id);
        showEtudiants();
    }
}
