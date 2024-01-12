package TP.gestion;



import TP.controllers.*;
import TP.models.DEpartement;
import TP.models.ENseignant;
import TP.services.DB;
import TP.gestion.Basedd;
import java.util.Scanner;

public class Main {

    public static boolean isNull(Object ob) {
        return ob == null ;
    }
    public static int getIntInput(String... msg) {
        Scanner sc = new Scanner(System.in);
        String message = "Entrez un nombre entier : ";
        if (msg.length > 0 )
            message = msg[0];
        System.out.print(message);


        int num = sc.nextInt();

        //  scan.close();
        return num;
    }

    public static String getStringInput(String... msg) {
        Scanner sc = new Scanner(System.in);
        String message = "Entrez un texte : ";
        if (msg.length > 0 )
            message = msg[0] ;
        System.out.print(message);

        String str = sc.nextLine();

        //  scan.close();
        return str;

    }




    public static void showPrincipalMenu(){
        System.out.println("-------------------------[ Bienvenu ]---------------------------");


        System.out.println("1: Pour gérer les départements");
        System.out.println("2: Pour gérer les filières");
        System.out.println("3: Pour gérer les enseignants");
        System.out.println("4: Pour gérer les modules");
        System.out.println("5: Pour gérer les étudiants");
        System.out.println("0: Pour sortir");

        //"Veuillez sélectionner une option : ")
        int option = getIntInput("Veuillez sélectionner une option : ");
        switch(option) {
            case 1:
                DepartController.showMenu();
                break;
            case 2:
                FiliereController.showMenu();
                break;
            case 3:
                EnsController.showMenu();
                break;
            case 4:
                ModuleController.showMenu();
                break;
            case 5:
                EtudiantController.showMenu();
                break;
            default:
                // code block
        }

    }
    public static void main(String[] args) {
        ENseignant enseignant = new ENseignant();
        enseignant.setNom("Mehdi");
        enseignant.setPrenom("Ait Said");
        enseignant.setEmail("teeest@gmail.com");
        enseignant.setGrade("prof");
        enseignant.setId(DB.getEnsId());
        DB.enseignants.add(enseignant);
        showPrincipalMenu();


        ENseignant enseignant2 = new ENseignant();
        enseignant2.setNom("wafaa");
        enseignant2.setPrenom(" dachry");
        enseignant2.setEmail("teeest@gmail.com");
        enseignant2.setGrade("prof");
        enseignant2.setId(DB.getEnsId());
        DB.enseignants.add(enseignant2);
        showPrincipalMenu();

        DEpartement d1 = new DEpartement();
        d1.setId(1);
        d1.setIntitule(" MIP");
        d1.setChef(enseignant);
        DB.departements.add(d1);
        showPrincipalMenu();
    }

}
