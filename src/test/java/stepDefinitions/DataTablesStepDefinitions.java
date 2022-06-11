package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.DataTablesPage;

public class DataTablesStepDefinitions {
    DataTablesPage dataTablesPage=new DataTablesPage();
    @Then("new butonuna basar")
    public void new_butonuna_basar() {
        dataTablesPage.newButonu.click();

    }
    @Then("isim bolumumune {string} yazar")
    public void isim_bolumumune_yazar(String firstname) {
        dataTablesPage.firstName.sendKeys(firstname);

    }
    @Then("soyisim bolumumune {string} yazar")
    public void soyisim_bolumumune_yazar(String lastname) {
        dataTablesPage.lastName.sendKeys(lastname);

    }
    @Then("position bolumumune {string} yazar")
    public void position_bolumumune_yazar(String position) {
        dataTablesPage.position.sendKeys(position);

    }
    @Then("ofis bolumumune {string} yazar")
    public void ofis_bolumumune_yazar(String office) {
        dataTablesPage.office.sendKeys(office);
    }
    @Then("extension bolumumune {string} yazar")
    public void extension_bolumumune_yazar(String extension) {
        dataTablesPage.extn.sendKeys(extension);

    }
    @Then("startDate bolumumune {string} yazar")
    public void start_date_bolumumune_yazar(String startDate) {
        dataTablesPage.startDate.sendKeys(startDate);
    }
    @Then("salary bolumumune {string} yazar")
    public void salary_bolumumune_yazar(String salary) {
        dataTablesPage.salary.sendKeys(salary);
    }
    @Then("Create tusuna basar")
    public void create_tusuna_basar() {
        dataTablesPage.create.click();

    }
    @When("kullanici {string} ile arama yapar")
    public void kullaniciIleAramaYapar(String firstname) {
        dataTablesPage.search.sendKeys(firstname);
    }


    @Then("isim bolumunde {string} oldugunu dogrular")
    public void isimBolumundeOldugunuDogrular(String firstname) {
        Assert.assertTrue(dataTablesPage.aramaSonucIlkElement.getText().contains(firstname));
    }
}
