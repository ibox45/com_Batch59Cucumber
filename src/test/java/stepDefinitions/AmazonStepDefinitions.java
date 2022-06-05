package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {
    AmazonPage amazonPage=new AmazonPage();
    @Given("kullanici amazon anasayfasinda")
    public void kullanici_amazon_anasayfasinda() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

    }
    @Then("kullanici Nutella icin arama yapar")
    public void kullanici_nutella_icin_arama_yapar() {
        amazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);


    }
    @Then("sonuclarin Nutella icerdigini test eder")
    public void sonuclarin_nutella_icerdigini_test_eder() {
        String arananKelime="Nutella";
        String actualAramaSonucuStr=amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualAramaSonucuStr.contains(arananKelime));

    }
    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();

    }

    @Then("kullanici Java icin arama yapar")
    public void kullaniciJavaIcinAramaYapar() {
        amazonPage.aramaKutusu.sendKeys("Java"+ Keys.ENTER);

    }

    @And("sonuclarin Java icerdigini test eder")
    public void sonuclarinJavaIcerdiginiTestEder() {
        String arananKelime="Java";
        String actualAramaSonucuStr=amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualAramaSonucuStr.contains(arananKelime));
    }

    @And("kullanici iphone icin arama yapar")
    public void kullaniciIphoneIcinAramaYapar() {
        amazonPage.aramaKutusu.sendKeys("iphone"+ Keys.ENTER);
    }

    @Then("sonuclarin iphone icerdigini test eder")
    public void sonuclarinIphoneIcerdiginiTestEder() {
        String arananKelime="iphone";
        String actualAramaSonucuStr=amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualAramaSonucuStr.contains(arananKelime));
    }
}
