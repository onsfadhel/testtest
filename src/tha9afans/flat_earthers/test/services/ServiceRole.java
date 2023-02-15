package tha9afans.flat_earthers.test.services;

import tha9afans.flat_earthers.test.entities.Role;
import tha9afans.flat_earthers.test.utils.DataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ServiceRole implements IService<Role>{
    Connection cnx = DataSource.getInstance().getCnx();

    @Override
    public void ajouter(Role r) {
        try {
            String req = "INSERT INTO `roles` (`nom`,) VALUES ('" + r.getNom() +  "')";
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
            String req = "DELETE FROM `roles` WHERE id = " + id;
            Statement st = cnx.createStatement();
            st.executeUpdate(req);
            System.out.println("role deleted !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }


    }

    @Override
    public void modifier(Role r) {
        try {
            String req = "UPDATE `roles` SET `nom` = '" + r.getNom()  + "' WHERE `roles`.`id` = " + r.getId();
            Statement st = cnx.createStatement();
            st.executeUpdate(req);
            System.out.println("Role updated !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    @Override
    public List<Role> getAll() {

        List<Role> list = new ArrayList<>();
        try {
            String req = "Select * from roles";
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery(req);
            while (rs.next()) {
                Role r = new Role(rs.getInt(1),Role.Nrole.valueOf(rs.getString(2)));
                list.add(r);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return list;
    }

    @Override
    public Role getOneById(int id) {
        Role r = null;
        try {
            String req = "Select * from roles WHERE `id`= '" + id + "'";
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery(req);
            while (rs.next()) {
                r = new Role(rs.getInt(1),Role.Nrole.valueOf(rs.getString(2)));;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return r;

    }
}
