package ru.company.test.config;

import com.haulmont.cuba.core.config.Config;
import com.haulmont.cuba.core.config.Source;
import com.haulmont.cuba.core.config.SourceType;
import com.haulmont.cuba.core.config.defaults.Default;
import ru.company.test.entity.SpacecraftType;

@Source(type = SourceType.DATABASE)
public interface SpacecraftTypeConfig extends Config {
    @Default("test_SpacecraftType-f10aeb23-1c29-744a-d478-a6d30bf09d20")
    SpacecraftType getSpacecraftTypeKa();



}