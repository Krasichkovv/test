package ru.company.test.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;

@Table(name = "TEST_SPACECRAFT")
@Entity(name = "test_Spacecraft")
@NamePattern("%s|name")
public class Spacecraft extends StandardEntity {
    private static final long serialVersionUID = 256142468493376803L;

    @Column(name = "NAME")
    private String name;

    @Column(name = "ROCKET")
    private String rocket;

    @Column(name = "BOOSTER")
    private String booster;

    @Column(name = "LENGHT")
    private Integer nolenght;

    @Column(name = "DIAMETR")
    private Integer diameter;

    @Column(name = "WEIGHT")
    private Integer weight;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TYPE_ID")
    private SpacecraftType type;

    public void setNolenght(Integer nolenght) {
        this.nolenght = nolenght;
    }

    public Integer getNolenght() {
        return nolenght;
    }

    public void setDiameter(Integer diameter) {
        this.diameter = diameter;
    }

    public Integer getDiameter() {
        return diameter;
    }

    public String getBooster() {
        return booster;
    }

    public void setBooster(String booster) {
        this.booster = booster;
    }

    public String getRocket() {
        return rocket;
    }

    public void setRocket(String rocket) {
        this.rocket = rocket;
    }

    public SpacecraftType getType() {
        return type;
    }

    public void setType(SpacecraftType type) {
        this.type = type;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}