package ru.company.test.web.screens.rocket;

import com.haulmont.cuba.gui.screen.*;
import ru.company.test.entity.Rocket;

@UiController("test_Rocket.browse")
@UiDescriptor("rocket-browse.xml")
@LookupComponent("rocketsTable")
@LoadDataBeforeShow
public class RocketBrowse extends StandardLookup<Rocket> {
}