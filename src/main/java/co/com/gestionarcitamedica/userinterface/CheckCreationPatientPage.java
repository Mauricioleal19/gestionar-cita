package co.com.gestionarcitamedica.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CheckCreationPatientPage extends PageObject {
    public static final Target CHECK_CREATION_patient = Target.the("Verify the creation of the patient").
            located(By.xpath("//div[@class='panel-body']/p"));
}
