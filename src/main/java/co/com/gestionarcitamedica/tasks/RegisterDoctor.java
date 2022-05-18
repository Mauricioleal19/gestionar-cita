package co.com.gestionarcitamedica.tasks;

import co.com.gestionarcitamedica.model.Information;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.gestionarcitamedica.userinterface.RegisterDoctorPage.*;

public class RegisterDoctor implements Task {
    private List<Information> data;

    public RegisterDoctor(List<Information> data) {
        this.data = data;
    }
    public static RegisterDoctor withThe(List<Information> data){
        return Tasks.instrumented(RegisterDoctor.class,data);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SELECT_ADD_DOCTOR),
                Enter.theValue(data.get(0).getStrName()).into(NAME_DOCTOR),
                Enter.theValue(data.get(0).getStrLastName()).into(LASTNAME_DOCTOR),
                Enter.theValue(data.get(0).getStrPhoneNumber()).into(PHONE_NUMBER),
                Click.on(IDENTIFICATION_TYPE),
                Click.on(SELECT_IDENTIFICATION_TYPE),
                Enter.theValue(data.get(0).getStrIdNumber()).into(ID_DOCTOR),
                Click.on(SAVE_DOCTOR)


        );
    }
}
