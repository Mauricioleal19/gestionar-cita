package co.com.gestionarcitamedica.questions;

import co.com.gestionarcitamedica.userinterface.CheckCreationDoctorPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class CheckCreationDoctor implements Question<Boolean>{
    private String data;

    public CheckCreationDoctor(String data) {
        this.data = data;
    }
    public static CheckCreationDoctor withA(String data){
        return new CheckCreationDoctor(data);
    }
    @Override
    public Boolean answeredBy(Actor actor){
        String message = Text.of(CheckCreationDoctorPage.CHECK_CREATION_DOCTOR).viewedBy(actor).asString();
            return data.equals(message);

    }
}
