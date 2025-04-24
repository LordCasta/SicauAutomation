package co.edu.pascualbravo.sicau.questions;

import co.edu.pascualbravo.sicau.interactions.ScrollJavascript;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.junit.Assert;

import static co.edu.pascualbravo.sicau.tasks.NotasUI.TXTMATERIA;

public class ValidarMateria implements Task {

    private String materia;

    public ValidarMateria(String materia){
        this.materia = materia;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ScrollJavascript.to(TXTMATERIA.of(materia))
        );

        String lst_validar = TXTMATERIA.of(materia).resolveFor(actor).getText();

        Assert.assertTrue("El texto nombres no coincide", lst_validar.contains(materia));
    }

    public static ValidarMateria conLaMateria(String materia){
        return new ValidarMateria(materia);
    }
}
