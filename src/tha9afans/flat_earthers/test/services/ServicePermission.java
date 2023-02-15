package tha9afans.flat_earthers.test.services;

import tha9afans.flat_earthers.test.utils.DataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ServicePermission implements PermissionsAbilityGroup{
    Connection cnx = DataSource.getInstance().getCnx();

    @Override
    public boolean isAdministrateur(int id) {
        try {

            String req="select * FROM personnes WHERE id ='" + id + "' ";
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery(req);
            while (rs.next()) {
                if (rs.getString("role").equals("administrateur")) {
                    return true;
                } else
                    return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    @Override
    public boolean isUtiisateur(int id) {
        try {

            String req="select * FROM personnes WHERE id ='" + id + "' ";
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery(req);
            while (rs.next()) {
                if (rs.getString("role").equals("utilisateur")) {
                    return true;
                } else
                    return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }


}
