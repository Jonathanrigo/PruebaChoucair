package choucair.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/user_creation.feature",
glue = "choucair.stepdefinitions",
snippets = SnippetType.CAMELCASE)
public class UserCreation {
}

