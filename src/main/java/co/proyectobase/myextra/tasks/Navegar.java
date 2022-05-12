package co.proyectobase.myextra.tasks;

import co.proyectobase.myextra.interactions.Digitar;
import co.proyectobase.myextra.interactions.Escribir;
import co.proyectobase.myextra.interactions.Ir;
import co.proyectobase.myextra.model.Tecla;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static co.proyectobase.myextra.userinterface.LoginPage.UBICACION;
import static co.proyectobase.myextra.userinterface.MenuPage.*;
import static co.proyectobase.myextra.userinterface.SQLPage.TITULO_SQL_PAGE;

public class Navegar implements Task {

    public static Navegar aUnMenu() {
        return Tasks.instrumented(Navegar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Escribir.elTexto("CALL PINISERS").en(AMBIENTE_PRUEBAS),
                Digitar.laTecla(Tecla.ENTER.getTecla()),
                Digitar.laTecla(Tecla.F12.getTecla()),
                Escribir.elTexto("EDTLIBL").en(CONFIRMACION_AMBIENTE_PRUEBAS),
                Digitar.laTecla(Tecla.ENTER.getTecla()),
                Escribir.elTexto("WIPS210818").en(SQL),
                Digitar.laTecla(Tecla.ENTER.getTecla()),
                Digitar.laTecla(Tecla.F3.getTecla()),
                Escribir.elTexto("ADIOS").en(CONFIRMACION_AMBIENTE_PRUEBAS),
                Digitar.laTecla(Tecla.ENTER.getTecla())
//                Ir.hastaVerTexto("SQL").en(TITULO_SQL_PAGE)
        );

    }

}
