package rpgcollectionrevive.rpgcollectionrevive.model;

import javax.persistence.*;

@Entity
@Table
public class RPG {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    @Column
    private String support;
    private String genre;
    private String developer;

    public RPG(){

    }
    public RPG(String name, String support, String genre, String developer) {
        this.name = name;
        this.support = support;
        this.genre = genre;
        this.developer = developer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSupport() {
        return support;
    }

    public void setSupport(String support) {
        this.support = support;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }
}
