package TP.models;
import java.util.ArrayList;

public class ENseignant {

    private int id;
    private String nom;
    private String prenom;
    private String email;
    private String grade;
    private DEpartement dept;
    ArrayList<Module> modules = new ArrayList<Module>();


    public ENseignant() {
    }

    public ENseignant(String nom, String prenom, String email, String grade, DEpartement dept) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.grade = grade;
        this.dept = dept;
    }

    
    public DEpartement getDept() {
		return dept;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public DEpartement getDEpt() {
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


    public boolean equals(ENseignant obj) {
        if (obj == null) {
            return false;
        }



        if (obj.getId() != this.id) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ENseignant{id=").append(id);
        sb.append(", nom='").append(nom).append('\'');
        sb.append(", prenom='").append(prenom).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", grade='").append(grade).append('\'');
        if (dept != null) {
            sb.append(", dept=").append(dept.getId());
        } else {
            sb.append(", dept=null");
        }
        sb.append('}');
        return sb.toString();
    }
}
