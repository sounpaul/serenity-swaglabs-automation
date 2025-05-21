package com.swaglabs.automation.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends PageObject {

    @FindBy(xpath = "//*[text()='Sauce Labs Onesie']")
    WebElementFacade SauceLabsOnesie;

    @FindBy(xpath = "//*[text()='Sauce Labs Bike Light']")
    WebElementFacade SauceLabsBikeLight;

    @FindBy(xpath = "//*[text()='Sauce Labs Bolt T-Shirt']")
    WebElementFacade SauceLabsBoltTShirt;

    @FindBy(xpath = "//*[text()='Sauce Labs Fleece Jacket']")
    WebElementFacade SauceLabsFleeceJacket;

    @FindBy(xpath = "//*[text()='Sauce Labs Backpack']")
    WebElementFacade SauceLabsBackpack;

    @FindBy(xpath = "//*[text()='Test.allTheThings() T-Shirt (Red)']")
    WebElementFacade TestAllTheThingsTShirtRed;

    @FindBy(id = "back-to-products")
    WebElementFacade backToProducts;
    
    @FindBy(className = "product_sort_container")
    WebElementFacade sortBy;

    @FindBy(xpath = "/html/body/div/div/div/div[2]/div/div/div[2]/div[1]")
    WebElementFacade productDescription;
}
