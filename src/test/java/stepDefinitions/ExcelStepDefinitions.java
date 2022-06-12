package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLOutput;

public class ExcelStepDefinitions {
    Workbook workbook;

    @Given("kullaniciexcel dosyasini kullanilabilir hale getirir")
    public void kullaniciexcel_dosyasini_kullanilabilir_hale_getirir() throws IOException {
        String dosyaYolu="src/test/resources/ulkeler.xlsx";
        FileInputStream fis=new FileInputStream(dosyaYolu);
        workbook= WorkbookFactory.create(fis);

    }
    @Then("{int}.satirdaki {int}.hucreyi yazdirir")
    public void satirdaki_hucreyi_yazdirir(Integer satir, Integer sutun) {
        String istenenHucreyazisi=workbook
                                     .getSheet("Sayfa1")
                                     .getRow(satir-1)
                                     .getCell(sutun-1)
                                     .toString();
        System.out.println(satir+".satir "+sutun+".sutundaki deger : "+istenenHucreyazisi);


    }
    @Then("baskenti Jakarta olan ulke ismini yazdirir")
    public void baskenti_jakarta_olan_ulke_ismini_yazdirir() {
        //for loop ile tum satırları kontrol etmem gerekıyor. 
        //bunun icin de satir sayisina ihtiyacım var
        int satirSayisi=workbook.getSheet("SAyfa1").getLastRowNum();
        for (int i = 0; i <=satirSayisi ; i++) {
            if(workbook.getSheet("Sayfa1").getRow(i).getCell(1).toString().equals("Jakarta")){
                System.out.println("Baskenti Jakarta olan ulke : "+
                        workbook.getSheet("Sayfa1").getRow(i).getCell(0));
            }
            
        }

    }
    @Then("ulke sayisinin {int} oldugunu test eder")
    public void ulke_sayisinin_oldugunu_test_eder(Integer ulkeSayisi) {
        int actualUlkeSayisi=workbook.getSheet("SAyfa1").getLastRowNum();
        Assert.assertEquals( (int) ulkeSayisi, actualUlkeSayisi);


    }
    @Then("fiziki olarak kullanilan satir sayisinin {int} oldugunu test eder")
    public void fiziki_olarak_kullanilan_satir_sayisinin_oldugunu_test_eder(Integer fizikiKullanilanSatir) {

        int actualFizKulSatir=workbook.getSheet("Sayfa1").getPhysicalNumberOfRows();
        Assert.assertEquals( (int) fizikiKullanilanSatir,actualFizKulSatir);

    }

}
