package TP.models;

public class NOte {
	
	    private float note;
	    private ETudiant etudiant;
	    private FIliere filiere;

	    public NOte() {
	    }

	    public NOte(float note, ETudiant etudiant, FIliere filiere) {
	        this.note = note;
	        this.etudiant = etudiant;
	        this.filiere = filiere;
	    }

	    public float getNote() {
	        return note;
	    }

	    public void setNote(float note) {
	        this.note = note;
	    }

	    public ETudiant getEtudiant() {
	        return etudiant;
	    }

	    public void setEtudiant(ETudiant etudiant) {
	        this.etudiant = etudiant;
	    }

	    public FIliere getFiliere() {
	        return filiere;
	    }

	    public void setFiliere(FIliere filiere) {
	        this.filiere = filiere;
	    }
	}


