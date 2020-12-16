package ru.company.test.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "TEST_BOOSTER")
@Entity(name = "test_Booster")
@NamePattern("%s|name")
public class Booster extends StandardEntity {
    private static final long serialVersionUID = -8399087202475608356L;

    @Column(name = "NAME")
    private String name;

    @Column(name = "LENGHT")
    private Integer lenght;

    public Integer getLenght() {
        return lenght;
    }

    public void setLenght(Integer lenght) {
        this.lenght = lenght;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}