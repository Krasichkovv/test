package ru.company.test.web.screens.spacecrafttype;

import com.haulmont.cuba.gui.screen.*;
import ru.company.test.entity.SpacecraftType;

@UiController("test_SpacecraftType.browse")
@UiDescriptor("spacecraft-type-browse.xml")
@LookupComponent("spacecraftTypesTable")
@LoadDataBeforeShow
public class SpacecraftTypeBrowse extends StandardLookup<SpacecraftType> {
}