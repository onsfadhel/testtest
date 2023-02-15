package tha9afans.flat_earthers.test.entities;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Personne {
    private int id;
    private String cin,nom,prenom,email,password,telephone,adresse;
    Date date = new Date();
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy/mm/dd");
    String dateNaissance = formatter.format(date);
    private Image photo;
    private Role.Nrole role;
    public Personne(){}

    public Personne(int id, String cin, String nom, String prenom, String email, String password, Role.Nrole role, String telephone, String adresse, String dateNaissance ) {
        this.id = id;
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.password = password;
        this.role = role;
        this.telephone = telephone;
        this.adresse = adresse;
        this.dateNaissance=dateNaissance;
    }

    public Personne(String cin, String nom, String prenom, String email, String password, String telephone, String adresse, String dateNaissance) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.password = password;
        this.telephone = telephone;
        this.adresse = adresse;
        this.dateNaissance = dateNaissance;
    }

    public Personne(String cin, String nom, String prenom, String email, String password, Role.Nrole role, String telephone, String adresse, String dateNaissance) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.password = password;
        this.role=role;
        this.telephone=telephone;
        this.adresse=adresse;
        this.dateNaissance=dateNaissance;

    }

    public Personne(int id, String cin, String nom, String prenom, String email, String password, String telephone, String adresse, Image photo, Role.Nrole role, String dateNaissance) {
        this.id = id;
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.password = password;
        this.telephone = telephone;
        this.adresse = adresse;
        this.photo = photo;
        this.role = role;
        this.dateNaissance=dateNaissance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }



    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Role.Nrole getRole() {
        return role;
    }

    public void setRole(Role.Nrole role) {
        this.role = role;
    }

    public Image getPhoto() {
        return photo;
    }

    public void setPhoto(Image photo) {
        this.photo = photo;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "cin='" + cin + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", telephone='" + telephone + '\'' +
                ", adresse='" + adresse + '\'' +
                ", photo=" + photo +
                ", role=" + role.toString() +
                ", date de naissance="+dateNaissance+
                '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Personne other = (Personne) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
}

