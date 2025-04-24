package co.edu.pascualbravo.sicau.tasks;

import net.serenitybdd.screenplay.targets.Target;

public class NotasUI {

    public static final Target TXTMATERIA = Target.the("Nombre materia")
            .locatedBy("//table[@id='NotasParcialesDeEstudiante']//label[contains(text(),'{0}')]");

}
