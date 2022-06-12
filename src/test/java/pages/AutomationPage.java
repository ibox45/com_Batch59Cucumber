package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationPage {
    public AutomationPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[@class='login']")
    public WebElement signInButonu;

    @FindBy(xpath = "//input[@id='email_create']")
    public WebElement emailKutucugu;

    @FindBy(xpath = "//button[@id='SubmitCreate']")
    public WebElement createButonu;


    @FindBy(xpath = "//input[@id='id_gender1']")
    public WebElement mrButonu;


    @FindBy(xpath = "//button[@id='submitAccount']")
    public WebElement registerButonu;

    @FindBy(xpath = "//p[text()='Welcome to your account. Here you can manage all of your personal information and orders.']")
    public WebElement positiveResultText;




}
