package co.com.gestionarcitamedica.tasks;

import co.com.gestionarcitamedica.model.Information;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.gestionarcitamedica.userinterface.RegisterPatientPage.*;

public class RegisterPatient implements Task {
    private List<Information> data;

    public RegisterPatient(List<Information> data) {
        this.data = data;
    }
    public static RegisterPatient withThe(List<Information> data){
        return Tasks.instrumented(RegisterPatient.class,data);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SELECT_ADD_PATIENT),
                Enter.theValue(data.get(0).getStrName()).into(INPUT_NAME),
                Enter.theValue(data.get(0).getStrLastName()).into(INPUT_LASTNAME),
                Enter.theValue(data.get(0).getStrPhoneNumber()).into(INPUT_PHONE),
                Click.on(IDENTIFICATION_TYPE),
                Click.on(SELECT_IDENTIFICATION_TYPE),
                Enter.theValue(data.get(0).getStrIdNumber()).into(INPUT_IDENTIFICATION_NUMBER),
                Click.on(SELECT_PREPAID),
                Click.on(SAVE_PATIENT)

        );
    }
}
