Feature: US1009 Datatables sitesine 5 farkli giris yapalim
@datatable
  Scenario Outline: TC14 kullanici 5 farkli kayit girisi yapabilmeli

    When kullanici "datatablesUrl" anasayfasinda
    Then new butonuna basar
    And isim bolumumune "<firstname>" yazar
    And kullanici 1 sn bekler
    And soyisim bolumumune "<lastname>" yazar
    And kullanici 1 sn bekler
    And position bolumumune "<position>" yazar
    And kullanici 1 sn bekler
    And ofis bolumumune "<office>" yazar
    And kullanici 1 sn bekler
    And extension bolumumune "<extension>" yazar
    And kullanici 1 sn bekler
    And startDate bolumumune "<startDate>" yazar
    And kullanici 1 sn bekler
    And salary bolumumune "<salary>" yazar
    And kullanici 1 sn bekler
    And Create tusuna basar
    And kullanici 1 sn bekler
    When kullanici "<firstname>" ile arama yapar
    And kullanici 1 sn bekler
    Then isim bolumunde "<firstname>" oldugunu dogrular
    And kullanici 1 sn bekler
    And sayfayi kapatir

    Examples:
    |firstname|lastname|position|office|extension|startDate|salary|
    |Alim     |Alim    |qa      |ankara|UI       |2021-10-11|10000|
    |Berk     |Can     |tester  |ankara|api      |2022-05-05|11000|
    |huseyin  |Kacmaz  |BA      |berlin|-        |2022-07-10|40000|
    |fatih    |Sahin   |PO      |berlin|-        |2022-03-12|45000|
    |Ahmet    |Kaya    |Tester  |ankara|database |2022-06-06|11000|

