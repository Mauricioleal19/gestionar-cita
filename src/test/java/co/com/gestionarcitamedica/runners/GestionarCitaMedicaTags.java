package co.com.gestionarcitamedica.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/gestionar_cita_medica.feature",
        tags = "@scenario3",
        glue = "co.com.gestionarcitamedica.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class GestionarCitaMedicaTags {
}
