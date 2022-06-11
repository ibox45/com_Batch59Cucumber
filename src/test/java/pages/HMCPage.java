package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HMCPage {
    public HMCPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement loginButonu;

    @FindBy(xpath = "//input[@id='UserName']")
    public WebElement userNameKutusu;

    @FindBy(xpath = "//input[@id='Password']")
    public WebElement passwordKutusu;

    @FindBy(xpath = "//input[@id='btnSubmit']")
    public WebElement loginButonu2;

    @FindBy(xpath = "//a[@id='menuHotels']")
    public WebElement hotelManagement;

    @FindBy(xpath = "//a[@href='/admin/HotelAdmin']")
    public WebElement hotelList;

    @FindBy(xpath = "//span[@class='hidden-480']")
    public WebElement addHotel;

    @FindBy(xpath = "//input[@id='Code']")
    public WebElement codeKutusu;

}
