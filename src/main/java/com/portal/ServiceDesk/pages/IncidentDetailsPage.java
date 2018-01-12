package com.portal.ServiceDesk.pages;

import com.portal.ServiceDesk.support.BaseClass;
import com.portal.ServiceDesk.support.ElementsUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IncidentDetailsPage extends BaseClass {
    ElementsUtils utils = new ElementsUtils();

    @FindBy(xpath="//span[contains(text(),'Please select an Incident Type')]")
    WebElement INCIDENT_TYPE_VALIDATION;

    @FindBy(xpath="//span[contains(text(),'Please select an appropriate Symptom for this Incident')]")
    WebElement INCIDENT_SYMPTOM_VALIDATION;

    @FindBy(xpath="//span[contains(text(),'Please enter a Priority level for this Incident')]")
    WebElement INCIDENT_PRIORITY_VALIDATION;

    @FindBy(id="wizardButton_SaveIncident")
    WebElement SAVE_BUTTON;

    @FindBy(xpath="//a[contains(text(),'Next')]")
    WebElement NEXT_BUTTON;

    @FindBy(id="IncidentType")
    WebElement INCIDENT_TYPE_DROPDOWN;

    @FindBy(id="IncidentSymptom")
    WebElement INCIDENT_SYMPTOM_DROPDOWN;

    @FindBy(id="IncidentCategory")
    WebElement INCIDENT_CATEGORY_DROPDOWN;

    @FindBy(id="IncidentSummary")
    WebElement INCIDENT_SUMMARY;

    @FindBy(xpath="//span[contains(text(),'The Summary must be no more than 256 characters')]")
    WebElement INCIDENT_NONOPENREACH_SUMMARY_VALIDATION;

    @FindBy(xpath="//span[contains(text(),'The Summary must be no more than 80 characters')]")
    WebElement INCIDENT_OPENREACH_SUMMARY_VALIDATION;

    @FindBy(id="IncidentNotes")
    WebElement INCIDENT_NOTES;

    @FindBy(id="IncidentOwner")
    WebElement INCIDENT_OWNER;

    @FindBy(id="IncidentPriority")
    WebElement INCIDENT_PRIORITY;

    @FindBy(xpath="//small[contains(text(),'View and Amend Details')]")
    WebElement VIEW_AND_AMEND_HEADER;

    @FindBy(xpath="//legend[contains(text(),'Line and installation details')]")
    WebElement INSTALLATION_DETAILS_HEADER;

    public IncidentDetailsPage(){
        PageFactory.initElements(driver,this);
    }

    public boolean incidentPageValidation(String owner){
        if(utils.getSelectedOption(INCIDENT_OWNER).equals(owner)) {
            SAVE_BUTTON.click();
            utils.waitForElementVisibility(INCIDENT_TYPE_VALIDATION);
            utils.waitForElementVisibility(INCIDENT_SYMPTOM_VALIDATION);
            utils.waitForElementVisibility(INCIDENT_PRIORITY_VALIDATION);
            return true;
        }
        else{return false;}
    }

    public void nonOpenReachIncident(String incidentType,String incidentSymptom,String incidentCategory,String priority,String notes,String summary){
        utils.selectByVisibleText(INCIDENT_TYPE_DROPDOWN, incidentType);
        utils.selectByVisibleText(INCIDENT_SYMPTOM_DROPDOWN,incidentSymptom);
        utils.selectByVisibleText(INCIDENT_CATEGORY_DROPDOWN,incidentCategory);
        utils.selectByVisibleText(INCIDENT_PRIORITY,priority);
        INCIDENT_SUMMARY.sendKeys("ReallyLot ReallyLot ReallyLot ReallyLot ReallyLot ReallyLot ReallyLot ReallyLot ReallyLot ReallyLot ReallyLot ReallyLot ReallyLot ReallyLot ReallyLot ReallyLot ReallyLot ReallyLot ReallyLot ReallyLot ReallyLot ReallyLot ReallyLot ReallyLot ReallyLot ReallyLot ");
        INCIDENT_NOTES.sendKeys(notes);
        utils.waitForElementVisibility(INCIDENT_NONOPENREACH_SUMMARY_VALIDATION);
        INCIDENT_SUMMARY.clear();
        INCIDENT_SUMMARY.sendKeys(summary);
        SAVE_BUTTON.click();
        utils.waitForElementVisibility(VIEW_AND_AMEND_HEADER);
    }

    public boolean openReachIncident(String incidentType,String incidentSymptom,String incidentCategory,String priority,String notes,String summary)
    {
        utils.selectByVisibleText(INCIDENT_TYPE_DROPDOWN, incidentType);
        utils.selectByVisibleText(INCIDENT_SYMPTOM_DROPDOWN,incidentSymptom);
        utils.selectByVisibleText(INCIDENT_PRIORITY,priority);
        if(utils.getSelectedOption(INCIDENT_CATEGORY_DROPDOWN).equals(incidentCategory)){
            INCIDENT_SUMMARY.sendKeys("ReallyLot ReallyLot ReallyLot ReallyLot ReallyLot ReallyLot ReallyLot ReallyLot Really");
            INCIDENT_NOTES.sendKeys(notes);
            utils.waitForElementVisibility(INCIDENT_OPENREACH_SUMMARY_VALIDATION);
            INCIDENT_SUMMARY.clear();
            INCIDENT_SUMMARY.sendKeys(summary);
            NEXT_BUTTON.click();
            INSTALLATION_DETAILS_HEADER.click();
            return true;
        }
        else{return false;}
    }
}
