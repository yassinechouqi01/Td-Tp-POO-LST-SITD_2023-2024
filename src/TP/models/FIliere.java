// FIliere.java

package TP.models;

import java.util.ArrayList;

public class FIliere {

    private int id;
    private String intitule;
    private ENseignant chef;
    private DEpartement dept;

    ArrayList<Module> modules = new ArrayList<Module>();

    public FIliere() {
    }

    public FIliere(String intitule, ENseignant chef, DEpartement dept) {
        this.intitule = intitule;
        this.chef = chef;
        this.dept = dept;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public ENseignant getChef() {
        return chef;
    }

    public void setChef(ENseignant chef) {
        this.chef = chef;
    }

    public DEpartement getDept() {
        return dept;
    }

    public void setDept(DEpartement dept) {
        this.dept = dept;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
/*
    public boolean meetsConditions() {
        return modules.size() >= 12 && "prof".equalsIgnoreCase(chef.getGrade());
    }*/
}
