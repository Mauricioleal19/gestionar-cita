package co.com.gestionarcitamedica.stepdefinitions;

import co.com.gestionarcitamedica.model.Information;
import co.com.gestionarcitamedica.questions.CheckCreationDoctor;
import co.com.gestionarcitamedica.questions.CheckCreationPatient;
import co.com.gestionarcitamedica.tasks.Open;
import co.com.gestionarcitamedica.tasks.RegisterDoctor;
import co.com.gestionarcitamedica.tasks.RegisterPatient;
import co.com.gestionarcitamedica.tasks.RequestAppointment;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class GestionarCitaMedicaStepDefinition {

    @Before
    public void setStage() {
        setTheStage(new OnlineCast());
    }

    @Given("^that carlos needs to register users in the platform$")
    public void thatCarlosNeedsToRegisterUsersInThePlatform() {
        theActorCalled("carlos").wasAbleTo(Open.hospitalAdministration());
    }


    @When("^he registers the doctor it in the Hospital Administration application$")
    public void heRegistersTheDoctorItInTheHospitalAdministrationApplication(List<Information> information) {
        theActorInTheSpotlight().attemptsTo(RegisterDoctor.withThe(information));

    }

    @Then("^verify that it was created with the message Data saved successfully$")
    public void verifyThatItWasCreatedWithTheMessageDataSavedSuccessfully(List<Information> message) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(CheckCreationDoctor.withA(message.get(0).getStrSave())));
    }


    @When("^he registers the patient it in the Hospital Administration application$")
    public void heRegistersThePatientItInTheHospitalAdministrationApplication(List<Information> information) {
        theActorInTheSpotlight().attemptsTo(RegisterPatient.withThe(information));
    }
    @Then("^verify that it was created the patient with the message Data saved successfully$")
    public void verifyThatItWasCreatedThePatientWithTheMessageDataSavedSuccessfully(List<Information> message) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(CheckCreationPatient.withA(message.get(0).getStrSavePatient())));

    }
    @Given("^that carlos needs to go to the doctor$")
    public void thatCarlosNeedsToGoToTheDoctor() {
        theActorCalled("carlos").wasAbleTo(Open.hospitalAdministration());
    }

    @When("^he does the scheduling of the appointment$")
    public void heDoesTheSchedulingOfTheAppointment(List<Information> information) {
        theActorInTheSpotlight().attemptsTo(RequestAppointment.addThe(information));
    }

    @Then("^Verify that the appointment was created with the message Data saved successfully$")
    public void verifyThatTheAppointmentWasCreatedWithTheMessageDataSavedSuccessfully(List<Information> message) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(CheckCreationPatient.withA(message.get(0).getStrSaveAppointment())));

    }


}
