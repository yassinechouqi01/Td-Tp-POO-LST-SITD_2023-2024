package TP.controllers;

import TP.gestion.Main;
import TP.services.DepartementServices;
import TP.models.DEpartement;
import TP.models.ENseignant;
import TP.services.DB;
import TP.services.EnseignantServices;

public class EnsController {

    public static void showMenu() {
        System.out.println("-------------------------[ Enseignants ]---------------------------");
        System.out.println("1: Pour ajouter un enseignant");
        System.out.println("2: Pour afficher les enseignants");
        System.out.println("3: Pour modifier un enseignant");
        System.out.println("4: Pour supprimer un enseignant");
        System.out.println("0: Pour retourner au menu principal");
        int option = Main.getIntInput("Veuillez sélectionner une option : ");

        switch (option) {
            case 1:
                createEnseignant();
                break;
            case 2:
                showEnseignants();
                break;
            case 3:
                editEnseignant();
                break;
            case 4:
                destroyEnseignant();
                break;
            default:
                Main.showPrincipalMenu();
        }
    }

    public static void showEnseignants() {
        for (ENseignant enseignant : DB.enseignants) {
            System.out.print("Id : " + enseignant.getId());
            System.out.print(" | Nom : " + enseignant.getNom());
            System.out.print(" | Prénom : " + enseignant.getPrenom());
            System.out.print(" | Email : " + enseignant.getEmail());
            System.out.println("");
        }
    }

    public static void createEnseignant() {
        String nom = Main.getStringInput("Entrez le nom :");
        String prenom = Main.getStringInput("Entrez le prénom :");
        String email = Main.getStringInput("Entrez l'email :");
        String grade = Main.getStringInput("Entrez le grade :");
        DepartController.showDepartements();
        int depId = Main.getIntInput("Sélectionnez une Département par id :");
        
        DEpartement dep = DepartementServices.getDeptById(depId);
        
        EnseignantServices.addEns(nom, prenom, email, grade, dep);

        showEnseignants();
        showMenu();
    }

    public static void editEnseignant() {
        showEnseignants();
        int id = Main.getIntInput("Sélectionnez un enseignant par id :");
        String nom = Main.getStringInput("Entrez le nom :");
        String prenom = Main.getStringInput("Entrez le prénom :");
        String email = Main.getStringInput("Entrez l'email :");
        String grade = Main.getStringInput("Entrez le grade :");
        int depId = Main.getIntInput("Sélectionnez une Département par id :");
        DepartController.showDepartements();
        DEpartement dep = DepartementServices.getDeptById(depId);
        

 
        EnseignantServices.updateEns(id, nom, prenom, email, grade, dep);

        showEnseignants();
        showMenu();
    }

    public static void destroyEnseignant() {
        showEnseignants();
        int id = Main.getIntInput("Sélectionnez un enseignant par id :");
        EnseignantServices.deleteEnsById(id);
        showEnseignants();
    }

   
}
