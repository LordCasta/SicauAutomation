package co.edu.pascualbravo.sicau.tasks;

import co.edu.pascualbravo.sicau.interactions.ScrollJavascript;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.edu.pascualbravo.sicau.userInterface.PrincipalUI.TXTCATEGORIA;
import static co.edu.pascualbravo.sicau.userInterface.PrincipalUI.TXTNOTAS;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class VerNotasTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(TXTCATEGORIA, isVisible()).forNoMoreThan(150).seconds(),
                Click.on(TXTCATEGORIA),
                WaitUntil.the(TXTNOTAS, isVisible()).forNoMoreThan(120).seconds(),
                Click.on(TXTNOTAS)
        );
    }

    public static VerNotasTask conSesionAbierta(){
        return new VerNotasTask();
    }
}
