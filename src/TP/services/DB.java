package TP.services;

import TP.models.*;

import java.util.ArrayList;

public class DB {
    public static int DEPT_ID = 0;
    public static int ENS_ID = 0;
    public static int ETD_ID = 0;
    public static int FIL_ID = 0;
    public static int MOD_ID = 0;
    public static ArrayList<DEpartement> departements = new ArrayList<DEpartement>();
    public static ArrayList<ENseignant> enseignants = new ArrayList<ENseignant>();
    public static ArrayList<FIliere> filieres = new ArrayList<FIliere>();
    public static ArrayList<MOdule> modules = new ArrayList<MOdule>();
    public static ArrayList<ETudiant> etudiants = new ArrayList<ETudiant>();
    public static ArrayList<NOte> notes = new ArrayList<NOte>();

    public  static int getDeptId(){
        DEPT_ID++;
        return DEPT_ID;
    }
    public  static int getEnsId(){
        ENS_ID++;
        return ENS_ID;
    }

}
