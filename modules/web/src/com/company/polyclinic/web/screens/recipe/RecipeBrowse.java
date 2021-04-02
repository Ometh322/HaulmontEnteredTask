package com.company.polyclinic.web.screens.recipe;

import com.company.polyclinic.entity.Recipe;
import com.haulmont.cuba.gui.screen.*;

@UiController("polyclinic_Recipe.browse")
@UiDescriptor("recipe-browse.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class RecipeBrowse extends MasterDetailScreen<Recipe> {

}