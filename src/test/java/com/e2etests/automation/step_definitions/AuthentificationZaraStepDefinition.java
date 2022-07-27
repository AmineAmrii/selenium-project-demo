package com.e2etests.automation.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.page_objects.AuthentificationZaraPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthentificationZaraStepDefinition {
	
	private AuthentificationZaraPage authentificationZaraPage;

	public AuthentificationZaraStepDefinition() {
		this.authentificationZaraPage = new AuthentificationZaraPage();
	}

	@Given("Je me connecte sur l aplication Zara {string}")
	public void jeMeConnecteSurLApplicationZara(String url) throws InterruptedException {
		authentificationZaraPage.goToUrl(url);
		Thread.sleep(3000);
	}
	@When("Je clique sur se connecter")
	public void jeCliqueSurSeConnecter() {
		authentificationZaraPage.clickOnbtnSeConnecter();
	    
	}
	@Then("Je me redirige vers la page {string}")
	public void jeMeRedirigeVersLaPageDemarrerLaSession(String text) {
		String titlePage = AuthentificationZaraPage.pageConnexion.getText();
		System.out.println("xxxxxxxxxxxxxxx " +titlePage);
		Assert.assertTrue(titlePage.contains(text));
	    
	}
	@When("Je saisie l adresse mail {string}")
	public void jeSaisieLAdresseMail(String email) {
		authentificationZaraPage.fillEmail(email);
	    
	}
	@When("Je sasie le mot de passe {string}")
	public void jeSasieLeMotDePasse(String password) {
		authentificationZaraPage.fillPassword(password);
	   
	}

}
