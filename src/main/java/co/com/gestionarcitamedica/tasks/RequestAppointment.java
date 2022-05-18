package co.com.gestionarcitamedica.tasks;

import co.com.gestionarcitamedica.model.Information;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.gestionarcitamedica.userinterface.RequestAppointmentPage.*;

public class RequestAppointment implements Task {
    private List<Information> data;

    public RequestAppointment (List<Information> data) {
        this.data = data;
    }
    public static RequestAppointment addThe(List<Information> data){
        return Tasks.instrumented(RequestAppointment.class,data);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SELECT_ADD_APPOINTMENT),
                Enter.theValue(data.get(0).getStrDate()).into(INPUT_DATE),
                Enter.theValue(data.get(0).getStrIdNumberPatient()).into(INPUT_ID_PATIENT),
                Enter.theValue(data.get(0).getStrIdNumberDoctor()).into(INPUT_ID_DOCTOR),
                Enter.theValue(data.get(0).getStrObservations()).into(INPUT_OBSERVATION),
                Click.on(SAVE_APPOINTMENT)

        );
    }
}
