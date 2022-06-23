package project.crud.models;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "tblproduits")
public class produits {
    public produits() {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getID_p() {
        return ID_p;
    }

    public void setID_p(Long ID_p) {
        this.ID_p = ID_p;
    }


    private Long ID_p;
    private String produit;
    private int prix;
    @ManyToMany(mappedBy = "prod")
    private List<commandes> cmds=new ArrayList<>();

    public  void addcmds(commandes command)
    {
        cmds.add(command);
    }

   /* @ManyToMany
    private Collection<commandes> cmds;*/


    public produits(String produit, int prix) {
        this.ID_p=getID_p();
        this.produit = produit;
        this.prix = prix;
    }

    public String getProduit() {
        return produit;
    }

    public void setProduit(String produit) {
        this.produit = produit;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }
}
