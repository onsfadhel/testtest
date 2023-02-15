package tha9afans.flat_earthers.test.services;

import tha9afans.flat_earthers.test.entities.Personne;
import tha9afans.flat_earthers.test.entities.Role;
import tha9afans.flat_earthers.test.utils.DataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ServicePersonne implements IService<Personne>{
    Connection cnx = DataSource.getInstance().getCnx();


    @Override
    public void ajouter(Personne p) {
        try {
            String req = "INSERT INTO `personnes` (`cin`,`nom`, `prenom`,`email`,`password`,`telephone`,`adresse`,`dateNaissance`) VALUES ('" + p.getCin() + "','" + p.getNom() + "', '" + p.getPrenom() + "', '" + p.getEmail() + "', '" + p.getPassword() +
                    "', '" + p.getTelephone() + "', '" + p.getAdresse() +"','" +p.getDateNaissance()+ "')";
            Statement st = cnx.createStatement();
            st.executeUpdate(req);
            System.out.println("Personne created !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    @Override
    public void supprimer(int id) {
        try {
            String req = "DELETE FROM `personnes` WHERE id = " + id;
            Statement st = cnx.createStatement();
            st.executeUpdate(req);
            System.out.println("Personne deleted !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    @Override
    public void modifier(Personne p) {
        try {
            String req = "UPDATE `personnes` SET `cin` = '" + p.getCin() + "', `nom` = '" + p.getNom() + "', `prenom` = '" + p.getPrenom() +"', `email` = '" + p.getEmail() +
                    "', `password` = '" + p.getPassword() +"', `role` = '" + p.getRole()+"', `telephone` = '" + p.getTelephone() +
                    "', `adresse` = '" + p.getAdresse() +"' WHERE `personnes`.`id` = " + p.getId();
            Statement st = cnx.createStatement();
            st.executeUpdate(req);
            System.out.println("Personne updated !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }


    @Override
    public List<Personne> getAll() {
        List<Personne> list = new ArrayList<>();
        try {
            String req = "Select * from personnes";
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery(req);
            while (rs.next()) {
                Personne p = new Personne(rs.getInt(1),rs.getString(2),rs.getString(3),
                        rs.getString(4),rs.getString(5),rs.getString(6),Role.Nrole.valueOf(rs.getString(7)),
                        rs.getString(8),rs.getString(9),rs.getString(10));
                list.add(p);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return list;
    }

    @Override
    public Personne getOneById(int idu) {
        Personne p = null;
        try {
            String req = "Select * from personnes WHERE `id`= '" + idu + "'";
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery(req);
            while (rs.next()) {
                p = new Personne(rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),
                        Role.Nrole.valueOf(rs.getString(7)),rs.getString(8),rs.getString(9),rs.getString(10));
            }


        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return p;
    }
    public List<Personne> getPersonByNomPrenom(String name) {
        Personne p = null;
        List<Personne> list = new ArrayList<>();
        try {
            String req = "Select * from personnes WHERE `nom`= '" + name + "' OR  `prenom`='"+ name+ "'";
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery(req);
            while (rs.next()) {
                p = new Personne(rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),
                        Role.Nrole.valueOf(rs.getString(7)),rs.getString(8),rs.getString(9),rs.getString(10));
                list.add(p);
            }


        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return list;
    }
    public List<Personne> getPersonByAdresse(String adresse) {
        Personne p = null;
        List<Personne> list = new ArrayList<>();
        try {
            String req = "Select * from personnes WHERE `adresse`= '" + adresse + "' ";
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery(req);
            while (rs.next()) {
                p = new Personne(rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),
                        Role.Nrole.valueOf(rs.getString(7)),rs.getString(8),rs.getString(9),rs.getString(10));
                list.add(p);
            }


        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return list;
    }

}
