package TP.controllers;

import TP.gestion.Main;
import TP.models.FIliere;
import TP.services.DB;
import TP.services.DepartementServices;
import TP.services.EnseignantServices;
import TP.services.FiliereServices;

public class FiliereController {

    public static void showMenu() {
        System.out.println("-------------------------[ Filieres ]---------------------------");
        System.out.println("1: Pour ajouter une filière");
        System.out.println("2: Pour afficher les filières");
        System.out.println("3: Pour modifier une filière");
        System.out.println("4: Pour supprimer une filière");
        System.out.println("0: Pour retourner au menu principal");

        int option = Main.getIntInput("Veuillez sélectionner une option : ");
        switch (option) {
            case 1:
                createFiliere();
                break;
            case 2:
                showFilieres();
                break;
            case 3:
                editFiliere();
                break;
            case 4:
                destroyFiliere();
                break;
            default:
                Main.showPrincipalMenu();
        }
    }

    public static void showFilieres() {
        for (FIliere filiere : DB.filieres) {
            System.out.print("Id : " + filiere.getId());
            System.out.print(" | Intitulé : " + filiere.getIntitule());
            System.out.print(" | Chef : " + filiere.getChef().getNom() + " " + filiere.getChef().getPrenom());
            System.out.println("");
        }
    }

    public static void createFiliere() {
        String intitule = Main.getStringInput("Entrez l'intitulé :");
        EnsController.showEnseignants();
        int idChef = Main.getIntInput("Sélectionnez un enseignant par id :");
        DepartController.showDepartements();
        int idDept = Main.getIntInput("Sélectionnez un département par id :");

        FiliereServices.addFiliere(intitule, EnseignantServices.getEnsById(idChef), DepartementServices.getDeptById(idDept));

        showFilieres();
        showMenu();
    }

    public static void editFiliere() {
        showFilieres();
        int id = Main.getIntInput("Sélectionnez une filière par id :");
        String intitule = Main.getStringInput("Entrez l'intitulé :");
        EnsController.showEnseignants();
        int idChef = Main.getIntInput("Sélectionnez un enseignant par id :");
        DepartController.showDepartements();
        int idDept = Main.getIntInput("Sélectionnez un département par id :");

        FiliereServices.updateFiliere(id, intitule, EnseignantServices.getEnsById(idChef), DepartementServices.getDeptById(idDept));

        showFilieres();
        showMenu();
    }

    public static void destroyFiliere() {
        showFilieres();
        int id = Main.getIntInput("Sélectionnez une filière par id :");
        FiliereServices.deleteFiliereById(id);
        showFilieres();
    }
}
