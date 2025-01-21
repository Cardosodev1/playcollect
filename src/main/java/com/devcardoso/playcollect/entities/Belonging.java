package com.devcardoso.playcollect.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "tb_belonging")
public class Belonging {
    @EmbeddedId
    private BelongingPK id = new BelongingPK();
    private Integer poisition;

    public Belonging() {
    }

    public Belonging(Game game,GameList list, Integer poisition) {
        this.id.setGame(game);
        this.id.setList(list);
        this.poisition = poisition;
    }

    public BelongingPK getId() {
        return id;
    }

    public void setId(BelongingPK id) {
        this.id = id;
    }

    public Integer getPoisition() {
        return poisition;
    }

    public void setPoisition(Integer poisition) {
        this.poisition = poisition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Belonging belonging = (Belonging) o;
        return Objects.equals(id, belonging.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
