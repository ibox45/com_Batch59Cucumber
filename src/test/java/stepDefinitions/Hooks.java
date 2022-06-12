package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {
    /*
    Cucumber'da step Definitions package'i icerisinde
    @before , @after gibi notasyon varsa
    extends testBase dememize gerek kalmadan
    her scenario'dan once ve/veya sonra bu methodlar calısacaktır

    Bu dda bizim isteyecegimiz bir durum degildir

    Cucumber'da @before, @after kullanma ihtiyacimiz olursa
    bunu stepdefinitions package'i altında olusturcagimiz hooks class'ina koyarız

    biz her scenario'dan sonra test sonucunu kontrol edip
    failed olan scenariolar icin screenshot almasi amaciyla
    @after method'u kullancagiz.
     */

    @After
    public void tearDown(Scenario scenario){
        final byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()) {
            scenario.attach(screenshot, "image/png","screenshots");
        }
        Driver.closeDriver();
    }
}