package co.com.gestionarcitamedica.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


public class RegisterDoctorPage extends PageObject {

    public static final Target SELECT_ADD_DOCTOR = Target.the("Insert doctor's name").
            located(By.xpath("//a[contains(text(),'Agregar Doctor')]"));
    public static final Target NAME_DOCTOR = Target.the("Insert doctor's name").
            located(By.id("name"));
    public static final Target LASTNAME_DOCTOR = Target.the("Insert doctor's lastname").
            located(By.id("last_name"));
    public static final Target PHONE_NUMBER = Target.the("Insert doctor's phone number").
            located(By.id("telephone"));
    public static final Target IDENTIFICATION_TYPE = Target.the("Open identification type").
            located(By.xpath("//select[@class='form-control']"));
    public static final Target SELECT_IDENTIFICATION_TYPE = Target.the("Select identification type").
            located(By.xpath("//select[@class='form-control']//*[contains(text(),'Pasaportes')]"));
    public static final Target ID_DOCTOR = Target.the("Insert doctor's id document").
            located(By.id("identification"));
    public static final Target SAVE_DOCTOR = Target.the("Save doctor registered").
            located(By.xpath("//a[contains(@class,'btn btn-primary pull-right')]"));


}
