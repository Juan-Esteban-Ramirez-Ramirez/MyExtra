package co.proyectobase.myextra.stepdefinitions;

import co.proyectobase.myextra.questions.LaRespuesta;
import co.proyectobase.myextra.tasks.Abrir;
import co.proyectobase.myextra.tasks.Loguearse;
import co.proyectobase.myextra.tasks.Navegar;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class MyExtraStepDefinition {

//    @Managed(driver = "chrome")
//    private WebDriver suNavegador;
//    private Actor geovany = Actor.named("Geovany");
    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Dado("^que (.*) desea realizar consultas en AS400, Geovany abre my extra$")
    public void queGeovanyDeseaRealizarConsultasEnASGeovanyAbreMyExtra(String actor) {
        theActorCalled(actor).attemptsTo(Abrir.myExtra());
    }


    @Cuando("^el ingresa sus credenciales$")
    public void elIngresaSusCredenciales() {
        theActorInTheSpotlight().attemptsTo(Loguearse.enMyExtra());
    }

    @Cuando("^navega en un menu$")
    public void navegaEnUnMenu() {
        theActorInTheSpotlight().attemptsTo(Navegar.aUnMenu());
    }

    @Entonces("^verifica que inicio sesion correctamente$")
    public void verificaQueInicioSesionCorrectamente() {
        theActorInTheSpotlight().should(
                seeThat(LaRespuesta.es())
        );
    }
}
