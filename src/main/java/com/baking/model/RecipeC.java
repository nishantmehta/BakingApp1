package com.baking.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;


@Entity
@Table(name="PERSON_COPY")
public class RecipeC implements Serializable {
    private static final long serialVersionUID = -3009157732242241606L;
    @Id
    private  int id;
    @Column(name = "name")
    private String name;
    @Column(name = "author")
    private String author;

    protected RecipeC() {

    }
    public RecipeC(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "RecipeC{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
