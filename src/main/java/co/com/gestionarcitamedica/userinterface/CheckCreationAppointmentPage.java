package co.com.gestionarcitamedica.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckCreationAppointmentPage {
    public static final Target CHECK_APPOINTMENT = Target.the("Verify appointment creation").
            located(By.xpath("//div[@class='panel-body']//*[contains(text(),'Datos guardados correctamente.')]"));
}
