package TP.services;

import TP.models.ENseignant;
import TP.models.FIliere;
import TP.models.MOdule;

import java.util.ArrayList;

public class ModulesServices {

    public static MOdule addModule(String intitule, ENseignant chef, FIliere filiere) {
        return new MOdule(intitule, chef, filiere);
    }

   public static MOdule updateModule(int id, String intitule, ENseignant chef,  FIliere filiere){
        MOdule module = getModuleById(id);
        if (module != null) {
            module.setIntitule(intitule);
            module.setChef(chef);
            module.setFiliere(filiere);
        }
        return module;
    }

 public static ArrayList<MOdule> deleteModuleById(int id){
        MOdule module = getModuleById(id);
        if (module != null) {
            DB.modules.remove(module);
        }
        return DB.modules;
    }

    public static MOdule getModuleById(int id){
        for (MOdule module : DB.modules) {
            if (module.getId() == id) return module;
        }
        return null;
    }

    public static ArrayList<MOdule> getAllModule(){
        return DB.modules;
    }
}
