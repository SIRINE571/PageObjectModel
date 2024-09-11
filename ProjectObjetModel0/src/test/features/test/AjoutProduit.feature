@tag
Feature: Automation Exercice
  I want to add products in cart
  
Background:

    Given Saisir l URL suivant "https://automationexercise.com"
    When choisir signup login
    And saisir adresse mail "mohamedmohamed@gmail.com" et le mot de passe "123456"
    And cliquer sur le bouton login
    Then verifier le nom du profil affiché "testtest"

  @tag1
  Scenario: Add products in cart
    When cliquer sur le bouton Products
    And cliquer sur add to product
    And cliquer sur continue shopping
    When cliquer sur add to product1
    And cliquer sur view cart button
    Then verifier le produit1 , le prix1 , la quantité1 , le prix totals1 
    And verifier le produit2 , le prix2 ,la quantité2 , le prix totals2

 