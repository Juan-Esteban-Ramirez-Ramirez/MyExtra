package co.proyectobase.myextra.tasks;

import co.proyectobase.myextra.interactions.Digitar;
import co.proyectobase.myextra.interactions.Escribir;
import co.proyectobase.myextra.interactions.Ir;
import co.proyectobase.myextra.model.Tecla;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static co.proyectobase.myextra.userinterface.LoginPage.*;

public class Loguearse implements Task {

    public static Loguearse enMyExtra() {
        return Tasks.instrumented(Loguearse.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Escribir.elTexto("GOQUENDO").en(USUARIO),
                Escribir.elTexto("SUFIBC16").en(PASSWORD),
                Digitar.laTecla(Tecla.ENTER.getTecla()),
                Digitar.laTecla(Tecla.ENTER.getTecla()),
                Ir.hastaVerTexto("Menú principal de IBM i").en(UBICACION)
        );

    }
}
