package project.crud.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tblclient")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }


    private Long ID;
    private String nom;
    private String prenom;
    private String tele;

    private Set<commandes> cmds= new HashSet<commandes>(0);

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "client")
    public Set<commandes> getCmds() {
        return cmds;
    }

    public void setCmds(Set<commandes> cmds) {
        this.cmds = cmds;
    }

    public Client(String nom, String prenom, String tele) {
        this.ID=getID();
        this.nom = nom;
        this.prenom = prenom;
        this.tele = tele;
    }

    public Client(String nom,  String tele) {
        this.ID=getID();
        this.nom = nom;
        this.tele = tele;
    }

    public Client() {}




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

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }
}
