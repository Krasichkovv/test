package ru.company.test.web.screens.spacecraft;

import com.haulmont.cuba.gui.components.PickerField;
import com.haulmont.cuba.gui.screen.*;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import ru.company.test.entity.Spacecraft;

@UiController("test_Spacecraft.browse")
@UiDescriptor("spacecraft-browse.xml")
@LookupComponent("spacecraftsTable")
@LoadDataBeforeShow
public class SpacecraftBrowse extends StandardLookup<Spacecraft> {
}