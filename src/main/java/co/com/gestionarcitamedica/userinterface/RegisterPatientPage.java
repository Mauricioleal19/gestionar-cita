package co.com.gestionarcitamedica.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class RegisterPatientPage extends PageObject {
    public static final Target SELECT_ADD_PATIENT = Target.the("Select add patient").
            located(By.xpath("//div[@class='list-group']//*[contains(text(),' Agregar Paciente')]"));
    public static final Target INPUT_NAME = Target.the("Enter patient name").
            located(By.name("name"));
    public static final Target INPUT_LASTNAME = Target.the("Enter patient lastname").
            located(By.name("last_name"));
    public static final Target INPUT_PHONE = Target.the("Enter patient phone number").
            located(By.name("telephone"));
    public static final Target IDENTIFICATION_TYPE = Target.the("Select the identification type list").
            located(By.name("identification_type"));
    public static final Target SELECT_IDENTIFICATION_TYPE = Target.the("Select list identification type").
            located(By.xpath("//select[@name='identification_type']//*[contains(text(),'Pasaportes')]"));
    public static final Target INPUT_IDENTIFICATION_NUMBER = Target.the("Enter identification number").
            located(By.name("identification"));
    public static final Target SELECT_PREPAID = Target.the("Select the prepaid health option").
            located(By.name("prepaid"));

    public static final Target SAVE_PATIENT = Target.the("Select save patient").
            located(By.xpath("//a[contains(@class,'btn btn-primary pull-right')]"));



}
