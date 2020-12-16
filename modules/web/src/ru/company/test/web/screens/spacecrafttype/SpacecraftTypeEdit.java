package ru.company.test.web.screens.spacecrafttype;

import com.haulmont.cuba.gui.screen.*;
import ru.company.test.entity.SpacecraftType;

@UiController("test_SpacecraftType.edit")
@UiDescriptor("spacecraft-type-edit.xml")
@EditedEntityContainer("spacecraftTypeDc")
@LoadDataBeforeShow
public class SpacecraftTypeEdit extends StandardEditor<SpacecraftType> {
}