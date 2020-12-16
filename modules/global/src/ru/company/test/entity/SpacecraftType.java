package ru.company.test.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "TEST_SPACECRAFT_TYPE")
@Entity(name = "test_SpacecraftType")
@NamePattern("%s|name")
public class SpacecraftType extends StandardEntity {
    private static final long serialVersionUID = -2567136470741067358L;

    @Column(name = "NAME")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}