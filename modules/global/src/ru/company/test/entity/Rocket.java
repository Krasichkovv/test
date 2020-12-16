package ru.company.test.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "TEST_ROCKET")
@Entity(name = "test_Rocket")
@NamePattern("%s|name")
public class Rocket extends StandardEntity {
    private static final long serialVersionUID = 5798721778647695148L;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DIAMETER")
    private String diameter;

    public String getDiameter() {
        return diameter;
    }

    public void setDiameter(String diameter) {
        this.diameter = diameter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}