package tha9afans.flat_earthers.test.entities;

public class Role {
    public enum Nrole{ administrateur, utilisateur}
    private int id;
    private Nrole nom;
    public Role(String roleName){}
    public Role(Nrole nom){
        this.nom=nom;
    }
    public Role(int id, Nrole nom) {
        this.id = id;
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Nrole getNom() {
        return nom;
    }

    public void setNom(Nrole nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Role{" +
                "nom=" + nom +
                '}';
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
        final Role other = (Role) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }
}
