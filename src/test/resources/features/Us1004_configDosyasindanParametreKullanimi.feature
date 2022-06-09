Feature: US1004 Kullanici parametre ile configuration file'i kullanabilmeli

  Scenario: TC07 configuration properties dosyasından parametre kullanimi

    Given kullanici "techproeducationUrl" anasayfasinda
    Then kullanici 10 sn bekler
    And url'nin "techproeducation" icerdigini test eder
    Then sayfayi kapatir
