 
@tag
Feature: Authentification automation exercice
   

  @tag1
  Scenario: Connexion à l application
    Given Saisir l URL suivant "https://automationexercise.com/"
    When choisir signup login
    And saisir adresse mail "mohamedmohamed@gmail.com" et le mot de passe "123456"
    And cliquer sur le bouton login
    Then verifier le nom du profil affiché "testtest"
    

 

    