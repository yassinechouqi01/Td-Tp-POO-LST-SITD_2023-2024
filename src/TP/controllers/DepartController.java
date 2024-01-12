package TP.controllers;
import TP.gestion.Main;
import TP.models.DEpartement;
import TP.models.ENseignant;
import TP.services.DB;
import TP.services.DepartementServices;
import TP.services.EnseignantServices;

import java.util.ArrayList;

public class DepartController {


    public static void showMenu(){
        System.out.println("-------------------------[ Départements ]---------------------------");


        System.out.println("1: Pour ajouter un département");
        System.out.println("2: Pour afficher les départements");
        System.out.println("3: Pour modifier un département");
        System.out.println("4: Pour supprimer un département");
        System.out.println("0: Pour retourner au menu principal");

        //"Veuillez sélectionner une option : ")
        
        
       int option = Main.getIntInput("Veuillez sélectionner une option : ");

        switch(option) {
            case 1:
               DepartController.createDepartement();
                break;
            case 2:
                DepartController.showDepartements();
                break;
            case 3:
                editDepartement();
                break;
            case 4:
                DepartController.destroyDepartement();
                break;
            default:
                Main.showPrincipalMenu();
        }
        } 
    
    public static void showDepartements(){
        for (DEpartement departement : DB.departements) {
            System.out.print("Id : " + departement.getId());
            System.out.print(" | Intitulé : " + departement.getIntitule());
            if (! Main.isNull(departement.getChef())) {
                System.out.print(" | Chef : " + departement.getChef().getNom() + " " + departement.getChef().getPrenom());
            }
            System.out.println("");
        }

    }
    public static void createDepartement(){
        String intitule = Main.getStringInput("Entrez l'intitulé :");
        EnsController.showEnseignants();
        int id = Main.getIntInput("Sélecionnez un enseignant par id :");
        ENseignant chef = EnseignantServices.getEnsById(id);

        DepartementServices.addDept(intitule,chef);

        showDepartements();
        showMenu();


    }
    public static void editDepartement(){
        showDepartements();
        int id = Main.getIntInput("Sélecionnez un departement par id :");
        String intitule =  Main.getStringInput("Entrez l'intitulé :");
        EnsController.showEnseignants();
        int idEns = Main.getIntInput("Sélecionnez un enseignant par id :");

        DepartementServices.updateDept(id, intitule, EnseignantServices.getEnsById(idEns));

        showDepartements();
        showMenu();
    }
    public static void destroyDepartement(){
        showDepartements();
        int id = Main.getIntInput("Sélecionnez un departement par id :");
        DepartementServices.deleteDeptById(id);
        showDepartements();

    }
    //i use This method cuz it simply returns the list of departments stored in the DB.departements.
    //It provides a way to access the list of departments for other parts of the application.
    public static ArrayList<DEpartement> getAllDept() {
        return DB.departements;
    }
}
