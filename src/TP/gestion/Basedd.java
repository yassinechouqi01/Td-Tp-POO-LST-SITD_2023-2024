package TP.gestion;

import TP.models.DEpartement;
import TP.models.ENseignant;
import TP.controllers.DepartController;
import TP.services.DepartementServices;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Basedd {
    public static void main(String[] args) {
            String url = "jdbc:mysql://localhost:3307/gestion";
        String user = "root";
        String pwd = "";

        try {
            Connection cx = DriverManager.getConnection(url, user, pwd);
            System.out.println("Good Connection");


//jfnrickfnrck

                    createDepartementsTable(cx);


                   System.out.println("created");


                  createEnseignantsTable(cx);


          System.out.println("created");



            List<DEpartement> departements = getAllDepartements(cx);

            for (DEpartement depart : departements) {
                System.out.println(depart.toString());}
            List<ENseignant> enseignants = getAllEnseignants(cx);
            for (ENseignant enseignant : enseignants) {
                System.out.println(enseignant.toString());}



         /*   DEpartement ud = new DEpartement();
            ud.setId(1);
            ud.setIntitule("GI"); // Updated intitule
            ud.setChef(getENseignantById(1, cx)); // Updated chef

            updateDepartement(ud, cx);
            for (DEpartement depart : departements) {
                System.out.println(depart.toString());}


            System.out.println("Department with ID 1 updated successfully.");*/
            ///////// delete
           deleteDepartement(1,cx);
            for (DEpartement depart : departements) {
                System.out.println(depart.toString());}
            DEpartement d1 = new DEpartement();
            d1.setId(1);

        } catch (SQLException e) {
            System.out.println("Bad Connection");
           e.printStackTrace();
        }



    }

    /* pour bdd d'enseignant*/
    
    public static void insertENseignant(ENseignant enseignant, Connection cx) throws SQLException {
        String query = "INSERT INTO enseignant (nom, prenom, email, grad) VALUES (?, ?, ?, ?)";

        try (PreparedStatement ps = cx.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, enseignant.getNom());
            ps.setString(2, enseignant.getPrenom());
            ps.setString(3, enseignant.getEmail());
            ps.setString(4, enseignant.getGrade());


            ps.executeUpdate();

            try (ResultSet generatedKeys = ps.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    enseignant.setId(generatedKeys.getInt(1));
                } else {
                    throw new SQLException("Creating enseignant failed, no ID obtained.");
                }
            }
        }
    }

    public static void deleteENseignant(int id, Connection cx) throws SQLException {
        String query = "DELETE FROM enseignant WHERE id = ?";

        try (PreparedStatement ps = cx.prepareStatement(query)) {
            ps.setInt(1, id);

    // Check if the record exists
            if (ps.executeUpdate() == 0) {
                throw new SQLException("No record with ID " + id + " found for deletion.");
            }
            ps.executeUpdate();
        }
    }

    public static void updateENseignant(ENseignant enseignant, Connection cx) throws SQLException {
        String query = "UPDATE enseignant" +
                " SET nom = ?, prenom = ?, email = ?, grad = ? WHERE id = ?";

        try (PreparedStatement ps = cx.prepareStatement(query)) {
            ps.setString(1, enseignant.getNom());
            ps.setString(2, enseignant.getPrenom());
            ps.setString(3, enseignant.getEmail());
            ps.setString(4, enseignant.getGrade());
            ps.setInt(6, enseignant.getId());

            ps.executeUpdate();
        }
    }

    public static List<ENseignant> getAllEnseignants(Connection cx) throws SQLException {
        String query = "SELECT * FROM enseignant";
        List<ENseignant> enseignants = new ArrayList<>();

        try (Statement st = cx.createStatement();
             ResultSet r = st.executeQuery(query)) {

            while (r.next()) {
                ENseignant enseignant = new ENseignant();
                enseignant.setId(r.getInt("id"));
                enseignant.setNom(r.getString("nom"));
                enseignant.setPrenom(r.getString("prenom"));
                enseignant.setEmail(r.getString("email"));
                enseignant.setGrade(r.getString("grad"));

                DEpartement dept = new DEpartement();
                dept.setId(r.getInt("id"));
                enseignant.setDept(dept);

                enseignants.add(enseignant);
            }
        }

        return enseignants;
    }

    public static void createEnseignantsTable(Connection cx) throws SQLException {
        String query = "CREATE TABLE IF NOT EXISTS enseignant(\n" +
                "id INT PRIMARY KEY AUTO_INCREMENT,\n" +
                "nom VARCHAR(255),\n" +
                "prenom VARCHAR(255),\n" +
                "email VARCHAR(255),\n" +
                "grad VARCHAR(255)\n" +

                ")";

        try (Statement st = cx.createStatement()) {
            st.execute(query);
        }
    }
    public static ENseignant getENseignantById(int id, Connection cx) throws SQLException {
        String query = "SELECT * FROM enseignant WHERE id = ?";
        ENseignant enseignant = null;

        try (PreparedStatement ps = cx.prepareStatement(query)) {
            ps.setInt(1, id);

            try (ResultSet r = ps.executeQuery()) {
                if (r.next()) {
                    enseignant = new ENseignant();
                    enseignant.setId(r.getInt("id"));
                    enseignant.setNom(r.getString("nom"));
                    enseignant.setPrenom(r.getString("prenom"));
                    enseignant.setEmail(r.getString("email"));
                    enseignant.setGrade(r.getString("grad"));

                    DEpartement dept = new DEpartement();
                    dept.setId(r.getInt("id"));
                    enseignant.setDept(dept);
                }
            }
        }

        return enseignant;
    }
/*pour bdd de departement*/ 
    public static void insertDepartement(DEpartement departement, Connection cx) throws SQLException {
        String query = "INSERT INTO departement (intitule, chef_id) VALUES (?,?)";

        try (PreparedStatement ps = cx.prepareStatement(query)) {
            ps.setString(1, departement.getIntitule());
            ps.setInt(2, departement.getChef().getId());
            ps.executeUpdate();
        }
    }

    public static void updateDepartement(DEpartement departement, Connection cx) throws SQLException {
        String query = "UPDATE departement SET intitule = ?, chef_id = ? WHERE id = ?";

        try (PreparedStatement ps = cx.prepareStatement(query)) {
            ps.setString(1, departement.getIntitule());
            ps.setInt(2, departement.getChef().getId());
            ps.setInt(3, departement.getId());
            ps.executeUpdate();
        }
    }

    public static void deleteDepartement(int id, Connection cx) throws SQLException {
        String query = "DELETE FROM departement WHERE id = ?";

        try (PreparedStatement ps = cx.prepareStatement(query)) {
            ps.setInt(1, id);

// Check if the record exists
            if (ps.executeUpdate() == 0) {
                throw new SQLException("No record with ID " + id + " found for deletion.");
            }
            ps.executeUpdate();
        }
    }

    public static List<DEpartement> getAllDepartements(Connection cx) throws SQLException {
        String query = "SELECT * FROM departement";
        List<DEpartement> departements = new ArrayList<>();

        try (Statement st = cx.createStatement();
             ResultSet r = st.executeQuery(query)) {
            while (r.next()) {
                DEpartement departement = new DEpartement();
                departement.setId(r.getInt("id"));
                departement.setIntitule(r.getString("intitule"));

                int chefId = r.getInt("chef_id");
                if (!r.wasNull()) {
                    ENseignant chef = getENseignantById(chefId, cx); // Fetch ENseignant from DB
                    departement.setChef(chef);
                }

                departements.add(departement);
            }

        }

        return departements;
    }

    public static void createDepartementsTable(Connection cx) throws SQLException {
        String query = "CREATE TABLE IF NOT EXISTS departement (\n" +
                "id INT PRIMARY KEY AUTO_INCREMENT,\n" +
                "intitule VARCHAR(255),\n" +
                "chef_id INT,\n" +
                "FOREIGN KEY (chef_id) REFERENCES enseignant(id)\n" +
                ")";

        try (Statement st = cx.createStatement()) {
            st.execute(query);
        }
    }
//////////////////////////////////












}
