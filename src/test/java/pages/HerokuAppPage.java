package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HerokuAppPage {
    public HerokuAppPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[@onclick='addElement()']")
    public WebElement AddElementButonu;

    @FindBy(xpath = "//button[@onclick='deleteElement()']")
    public WebElement DeleteButonu;

    @FindBy(xpath = "//button[@onclick='deleteElement()']")
    public List<WebElement> deleteListesi;

}
