package co.com.gestionarcitamedica.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


public class CheckCreationDoctorPage extends PageObject {
    public static final Target CHECK_CREATION_DOCTOR = Target.the("Verify the creation of the doctor.").
            located(By.xpath("//div[@class='panel-body']/p"));
}
