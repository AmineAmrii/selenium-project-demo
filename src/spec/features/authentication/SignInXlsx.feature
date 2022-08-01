@signInXlsx
Feature: Je me connecte a l application OrangeHRM avec un fichier excel
  En tanque utilisateur je souhaite m athentifier a l application OrangeHRM

  @signIn
  Scenario: Authentification a l application OrangeHRM via fichier excel
    Given Je me connecte a l application OrangeHRM
    When Je m authentifier avec un fichier excel
