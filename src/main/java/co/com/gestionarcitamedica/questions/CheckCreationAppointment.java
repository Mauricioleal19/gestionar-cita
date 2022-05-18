package co.com.gestionarcitamedica.questions;

import co.com.gestionarcitamedica.userinterface.CheckCreationAppointmentPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class CheckCreationAppointment implements Question<Boolean> {
    private String data;

    public CheckCreationAppointment(String data) {
        this.data = data;
    }
    public static CheckCreationAppointment withA(String data){
        return new CheckCreationAppointment(data);
    }
    @Override
    public Boolean answeredBy(Actor actor){
        String message = Text.of(CheckCreationAppointmentPage.CHECK_APPOINTMENT).viewedBy(actor).asString();
        return data.equals(message);

    }
}
