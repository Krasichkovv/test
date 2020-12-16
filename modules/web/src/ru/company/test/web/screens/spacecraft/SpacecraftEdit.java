package ru.company.test.web.screens.spacecraft;

import com.haulmont.cuba.gui.model.InstanceContainer;
import com.haulmont.cuba.gui.screen.*;
import ru.company.test.entity.Spacecraft;

@UiController("test_Spacecraft.edit")
@UiDescriptor("spacecraft-edit.xml")
@EditedEntityContainer("spacecraftDc")
@LoadDataBeforeShow
public class SpacecraftEdit extends StandardEditor<Spacecraft> {


    
}