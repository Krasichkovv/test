package ru.company.test.web.screens.booster;

import com.haulmont.cuba.gui.screen.*;
import ru.company.test.entity.Booster;

@UiController("test_Booster.browse")
@UiDescriptor("booster-browse.xml")
@LookupComponent("boostersTable")
@LoadDataBeforeShow
public class BoosterBrowse extends StandardLookup<Booster> {
}