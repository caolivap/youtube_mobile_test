package co.com.devco.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/find_a_twitter_user.feature",
        glue = "co.com.devco.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class FindTwitterUserRunner {
}
