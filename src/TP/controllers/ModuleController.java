package TP.controllers;

import TP.gestion.Main;
import TP.models.MOdule;
import TP.services.DB;
import TP.services.EnseignantServices;
import TP.services.FiliereServices;
import TP.services.ModulesServices;

public class ModuleController {

    public static void showMenu() {
        System.out.println("-------------------------[ Modules ]---------------------------");
        System.out.println("1: Pour ajouter un module");
        System.out.println("2: Pour afficher les modules");
        System.out.println("3: Pour modifier un module");
        System.out.println("4: Pour supprimer un module");
        System.out.println("0: Pour retourner au menu principal");

        int option = Main.getIntInput("Veuillez sélectionner une option : ");
        switch (option) {
            case 1:
                createModule();
                break;
            case 2:
                showModules();
                break;
            case 3:
                editModule();
                break;
            case 4:
                destroyModule();
                break;
            default:
                Main.showPrincipalMenu();
        }
    }

    public static void showModules() {
        for (MOdule module : DB.modules) {
            System.out.print("Id : " + module.getId());
            System.out.print(" | Intitulé : " + module.getIntitule());
            System.out.print(" | Chef : " + module.getChef().getNom() + " " + module.getChef().getPrenom());
            System.out.println("");
        }
    }

    public static void createModule() {
        String intitule = Main.getStringInput("Entrez l'intitulé :");
        EnsController.showEnseignants();
        int idChef = Main.getIntInput("Sélectionnez un enseignant par id :");
        FiliereController.showFilieres();
        int idFiliere = Main.getIntInput("Sélectionnez une filière par id :");

        ModulesServices.addModule(intitule, EnseignantServices.getEnsById(idChef), FiliereServices.getFiliereById(idFiliere));

        showModules();
        showMenu();
    }

    public static void editModule() {
        showModules();
        int id = Main.getIntInput("Sélectionnez un module par id :");
        String intitule = Main.getStringInput("Entrez l'intitulé :");
        EnsController.showEnseignants();
        int idChef = Main.getIntInput("Sélectionnez un enseignant par id :");
        FiliereController.showFilieres();
        int idFiliere = Main.getIntInput("Sélectionnez une filière par id :");

        ModulesServices.updateModule(id, intitule, EnseignantServices.getEnsById(idChef), FiliereServices.getFiliereById(idFiliere));

        showModules();
        showMenu();
    }

    public static void destroyModule() {
        showModules();
        int id = Main.getIntInput("Sélectionnez un module par id :");
        ModulesServices.deleteModuleById(id);
        showModules();
    }
}
