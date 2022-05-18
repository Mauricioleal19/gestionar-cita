package co.com.gestionarcitamedica.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class RequestAppointmentPage extends PageObject {

    public static final Target SELECT_ADD_APPOINTMENT = Target.the("Enter date the appointment").
            located(By.xpath("//div[@class='list-group']//*[contains(text(),'Agendar Cita')]"));
    public static final Target INPUT_DATE = Target.the("Enter date the appointment").
            located(By.id("datepicker"));
    public static final Target INPUT_ID_PATIENT = Target.the("Enter identification patient").
            located(By.xpath("//input[@placeholder='Ingrese el documento de identidad del paciente']"));
    public static final Target INPUT_ID_DOCTOR = Target.the("Enter identificacion doctor").
            located(By.xpath("//input[@placeholder='Ingrese el documento de identidad del doctor']"));
    public static final Target INPUT_OBSERVATION = Target.the("Enter observations").
            located(By.xpath("//textarea[@class='form-control']"));
    public static final Target SAVE_APPOINTMENT = Target.the("Save the appointment").
            located(By.xpath("//a[contains(@class,'btn btn-primary pull-right')]"));


}
