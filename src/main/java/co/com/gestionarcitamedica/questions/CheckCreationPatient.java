package co.com.gestionarcitamedica.questions;

import co.com.gestionarcitamedica.userinterface.CheckCreationDoctorPage;
import co.com.gestionarcitamedica.userinterface.CheckCreationPatientPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.Queue;

public class CheckCreationPatient implements Question<Boolean> {
    private String data;

    public CheckCreationPatient(String data) {
        this.data = data;
    }
    public static CheckCreationPatient withA(String data){
        return new CheckCreationPatient(data);
    }
    @Override
    public Boolean answeredBy(Actor actor){
        String message = Text.of(CheckCreationPatientPage.CHECK_CREATION_patient).viewedBy(actor).asString();
        return data.equals(message);

    }
}
