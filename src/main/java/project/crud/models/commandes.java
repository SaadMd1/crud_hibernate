package project.crud.models;


import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "tblcommandes")
public class commandes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getID_c() {
        return ID_c;
    }

    public void setID_c(Long ID_c) {
        this.ID_c = ID_c;
    }


    private Long ID_c;
    private String date;
    private String heure;
    private String article;

    @ManyToMany
    @JoinTable(name = "m",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name="command_id")
    )
    private List<produits> prod =new ArrayList<>();


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID")
    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    private Client client;
    private Set<commandes> cmds = new HashSet<commandes>(0);

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "ID_c")
    public Set<commandes> getCmds() {
        return cmds;
    }

    public void setCmds(Set<commandes> cmds) {
        this.cmds = cmds;
    }

   /* @ManyToMany
    private Collection<produits> prods;*/


    public commandes(String date, String heure, String article, Client client) {
        this.ID_c=getID_c();
        this.date = date;
        this.heure = heure;
        this.article = article;
        this.client=client;
    }

    public commandes() {
        this.ID_c=getID_c();
    }



    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHeure() {
        return heure;
    }

    public void setHeure(String heure) {
        this.heure = heure;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }
}
