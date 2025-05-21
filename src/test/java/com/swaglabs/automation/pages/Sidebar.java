package com.swaglabs.automation.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class Sidebar {

    @FindBy(id = "react-burger-menu-btn")
    WebElementFacade menu;

    @FindBy(id = "inventory_sidebar_link")
    WebElementFacade allItems;

    @FindBy(id = "about_sidebar_link")
    WebElementFacade about;

    @FindBy(id = "logout_sidebar_link")
    WebElementFacade logout;


}
