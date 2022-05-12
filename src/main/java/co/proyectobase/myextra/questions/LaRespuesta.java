package co.proyectobase.myextra.questions;

import co.proyectobase.myextra.interactions.Leer;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.proyectobase.myextra.userinterface.LoginPage.UBICACION;

public class LaRespuesta implements Question<String> {

    public static LaRespuesta es() {
        return new LaRespuesta();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Leer.elTextoEn(UBICACION);
    }
}
