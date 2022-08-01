@buzz
Feature: Je me connecte a l application OrangeHRM
  En tant que utilisateur je souhaite ajouter un post dans le module Buzz

  Background: 
    Given Je me connecte a l application OrangeHRM
    When Je saisie le username "Admin"
    And Je saisie le mot de passe "admin123"
    And Je clique sur le bouton login
    Then Je me redirige vers la page home "Welcome"

  @add_post_ok
  Scenario: Ajouter un post dans le champ what is in your mind
    When Je clique sur le module Buzz
    Then Je me redirige vers la page Buzz "MOST LIKED POSTS"
    When Je saisie un message dans le champ what s in your mind "Hello Selenium"
    And Je clique sur le bouton post
    Then Je verifie l affichage de mon post "Hello Selenium"

  @deconnexion
  Scenario: Verifier la deconnexion
    When Je clique sur l icone logout
    And Je clique sur le bouton logout