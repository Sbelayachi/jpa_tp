package org.example.entity.oneToMany;

import javax.persistence.*;

@Entity
@Table(name="EMP") // EMP = nom de la table employés

public class Employee {
    @Id
    private int id;

    @ManyToOne
    @JoinColumn(name="DEPT_ID")

    private Department d;


// Constructeur vide (par défaut si on en met pas d'autre JAVA fournit un constructeur vide)

    public Department getD() {
        return d;
    }

    public void setD(Department d) {
        this.d = d;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
