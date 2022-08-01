package com.e2etests.automation.step_definitions;

import org.apache.log4j.Logger;

import org.junit.Assert;

import com.e2etests.automation.page_objects.AuthenticationPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthenticationStepDefinition {

	private AuthenticationPage authenticationPage;
	static Logger logger = Logger.getLogger(AuthenticationStepDefinition.class);

	public AuthenticationStepDefinition() {
		this.authenticationPage = new AuthenticationPage();
	}

	/* Login */
	@Given("Je me connecte a l application OrangeHRM")
	public void jeMeConnecteALApplicationOrangeHRM() {
		// Setup.driver.get("https://opensource-demo.orangehrmlive.com/");
		authenticationPage.goToUrl();
		logger.info("Je me connecte a l application OrangeHRM");		
	}

	@When("Je saisie le username {string}")
	public void jeSaisieLeUsername(String username) {
		authenticationPage.fillUsername(username);
		logger.info("Je saisie le username");
	}

	@When("Je saisie le mot de passe {string}")
	public void jeSaisieLeMotDePasse(String password) {
		authenticationPage.fillPassword(password);
		logger.info("Je saisie le mot de passe");
	}

	@When("Je clique sur le bouton login")
	public void jeCliqueSurLeBoutonLogin() {
		authenticationPage.clickOnBtnLogin();
		logger.info("Je clique sur le bouton login");

	}

	@Then("Je me redirige vers la page home {string}")
	public void jeMeRedirigeVersLaPageHome(String msg) {
		String message = AuthenticationPage.homePage.getText();
		Assert.assertTrue(message.contains(msg));
		logger.info("Je me redirige vers la page home");

	}

	/* Logout */
	@When("Je clique sur l icone logout")
	public void jeCliqueSurLIconeLogout() {
		authenticationPage.clickOnIconLogut();
		logger.info("Je clique sur l icone logout");
	}

	@When("Je clique sur le bouton logout")
	public void jeCliqueSurLeBoutonLogout() throws InterruptedException {
		Thread.sleep(2000);
		authenticationPage.clickOnBtnLogout();
		logger.info("Je clique sur le bouton logout");
	}

}
