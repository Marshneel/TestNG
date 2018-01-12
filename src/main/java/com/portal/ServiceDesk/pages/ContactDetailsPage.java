package com.portal.ServiceDesk.pages;


import com.portal.ServiceDesk.support.BaseClass;
import com.portal.ServiceDesk.support.ElementsUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ContactDetailsPage extends BaseClass {
    ElementsUtils utils = new ElementsUtils();

    @FindBy(xpath="//ul[@class='pager wizard']//following::a[contains(text(),'Next')]")
    WebElement NEXT_BUTTON;

    @FindBy(id="ContactId")
    WebElement SELECT_CONTACT_DROPDOWN;

    @FindBy(xpath="//p[contains(text(),'Please select a contact or specify that the caller is third party')]")
    WebElement ACCOUNT_CONTACT_VALIDATION;

    @FindBy(xpath="//span[contains(text(),'Please enter a contact name')]")
    WebElement CONTACT_NAME_VALIDATION;

    @FindBy(xpath="//span[contains(text(),'Name must not be more than 40 characters')]")
    WebElement INCORRECT_NAME_VALIDATION;

    @FindBy(id="ContactEmailAddress")
    WebElement CONTACT_EMAIL;

    @FindBy(xpath="//span[contains(text(),'Please enter a contact telephone number')]")
    WebElement CONTACT_TELEPHONE_VALIDATION;

    @FindBy(id="ContactIsThirdParty")
    WebElement THIRD_PARTY_CHECKBOX;

    @FindBy(id="ContactName")
    WebElement CONTACT_NAME;

    @FindBy(id="ContactTelephoneNumber")
    WebElement CONTACT_TELEPHONE_NUMBER;

    @FindBy(xpath="//span[contains(text(),'The telephone number should be between 7 and 17 characters')]")
    WebElement INCORRECT_TELEPHONE_VALIDATION;

    @FindBy(xpath=".//*[@id='newincidentForm_IncidentType']//following::legend[contains(text(),'Incident Details')]")
    WebElement INCIDENT_DETAILS_HEADER;

    public ContactDetailsPage(){
        PageFactory.initElements(driver,this);
    }

    public void contactPageValidations(){

        NEXT_BUTTON.click();
        utils.waitForElementVisibility(ACCOUNT_CONTACT_VALIDATION);
        utils.waitForElementVisibility(CONTACT_NAME_VALIDATION);
        utils.waitForElementVisibility(CONTACT_TELEPHONE_VALIDATION);
        THIRD_PARTY_CHECKBOX.click();
        utils.waitForElementVisibility(CONTACT_NAME_VALIDATION);
        utils.waitForElementVisibility(CONTACT_TELEPHONE_VALIDATION);
        THIRD_PARTY_CHECKBOX.click();
    }

    public void selectContactWithTelephone(String contactOption){
        utils.selectByVisibleText(SELECT_CONTACT_DROPDOWN,contactOption);
        NEXT_BUTTON.click();
        utils.waitForElementVisibility(INCIDENT_DETAILS_HEADER);
    }

    public void incorrectTelephoneValidation(){
        CONTACT_TELEPHONE_NUMBER.sendKeys("020");
        NEXT_BUTTON.click();
        utils.waitForElementVisibility(INCORRECT_TELEPHONE_VALIDATION);
        CONTACT_TELEPHONE_NUMBER.clear();
        CONTACT_TELEPHONE_NUMBER.sendKeys("020112233445566778");
        NEXT_BUTTON.click();
        utils.waitForElementVisibility(INCORRECT_TELEPHONE_VALIDATION);
        CONTACT_TELEPHONE_NUMBER.clear();
        CONTACT_TELEPHONE_NUMBER.sendKeys("020112233");
        NEXT_BUTTON.click();
        utils.waitForElementVisibility(INCIDENT_DETAILS_HEADER);

    }

    public void selectContactWithoutTelephone(String contactOption){
        utils.selectByVisibleText(SELECT_CONTACT_DROPDOWN,contactOption);
        NEXT_BUTTON.click();
        utils.waitForElementVisibility(CONTACT_TELEPHONE_VALIDATION);
        incorrectTelephoneValidation();

    }

    public void selectThirdPartyContact(){
        THIRD_PARTY_CHECKBOX.click();
        CONTACT_NAME.sendKeys("Marshneel Marshneel Marshneel Marshneel Mar");
        NEXT_BUTTON.click();
        utils.waitForElementVisibility(INCORRECT_NAME_VALIDATION);
        CONTACT_NAME.clear();
        CONTACT_NAME.sendKeys("Rihanna Rocks");
        CONTACT_EMAIL.sendKeys("rihanna@gmail.com");
        incorrectTelephoneValidation();
    }



}
