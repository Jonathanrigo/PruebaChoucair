package choucair.stepdefinitions;

import choucair.tasks.UserRegistration;
import choucair.utils.MiDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class UserCreationStepDefinitions {
    private Actor usuario = Actor.named("usuario");
    @Given("^el usuario se encuentra en la pagina choucair$")
    public void elUsuarioSeEncuentraEnLaPaginaChoucair() {
        usuario.can(BrowseTheWeb.with(MiDriver.aChromeDriver().inTheWebPage("https://www.choucairtesting.com")));
    }

    @When("^El usuario se registra en la pagina$")
    public void elUsuarioSeRegistraEnLaPagina() {
        usuario.attemptsTo(UserRegistration.userRegistration());
    }
    //Assert.assertEquals
}
