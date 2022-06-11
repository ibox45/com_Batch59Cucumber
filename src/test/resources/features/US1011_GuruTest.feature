Feature: US1011 Web tablosundaki istenen sutunu yazdirma

  Scenario: TC kullanici sutun basligi ile liste alabilmeli


    Given kullanici "guruUrl" anasayfasinda
    And "Company", sutunundaki tum degerleri yazdirir
    Then sayfayi kapatir