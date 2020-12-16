package ru.company.test.web.screens.booster;

import com.haulmont.cuba.gui.screen.*;
import ru.company.test.entity.Booster;

@UiController("test_Booster.edit")
@UiDescriptor("booster-edit.xml")
@EditedEntityContainer("boosterDc")
@LoadDataBeforeShow
public class BoosterEdit extends StandardEditor<Booster> {
}