package co.com.gestionarcitamedica.tasks;

import co.com.gestionarcitamedica.userinterface.OpenPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class Open implements Task {
    private OpenPage openPage;

    public static Open hospitalAdministration(){
        return Tasks.instrumented(Open.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(net.serenitybdd.screenplay.actions.Open.browserOn(openPage));

    }
}
