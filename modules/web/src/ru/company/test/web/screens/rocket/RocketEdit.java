package ru.company.test.web.screens.rocket;

import com.haulmont.cuba.gui.screen.*;
import ru.company.test.entity.Rocket;

@UiController("test_Rocket.edit")
@UiDescriptor("rocket-edit.xml")
@EditedEntityContainer("rocketDc")
@LoadDataBeforeShow
public class RocketEdit extends StandardEditor<Rocket> {
}