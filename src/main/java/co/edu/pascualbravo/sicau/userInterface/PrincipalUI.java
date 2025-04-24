package co.edu.pascualbravo.sicau.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class PrincipalUI {

    public static final Target TXTCATEGORIA = Target.the("Link para la pestaña estudiantes")
            .locatedBy("//div[@id='NavSicauLayout']//a[@href='/SICAU/Account/Login?returnUrl=%2FSICAU%2FEstudiante%2FGeneral']");
    public static final Target TXTNOTAS = Target.the("Texto para el menú de notas")
            .locatedBy("//a[@href='/SICAU/Estudiante/General/NotasParcialesDeEstudiante']");


}
