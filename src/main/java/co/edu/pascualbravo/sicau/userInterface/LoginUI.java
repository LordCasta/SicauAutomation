package co.edu.pascualbravo.sicau.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class LoginUI {

    public static final Target IPTEMAIL = Target.the("Input para email")
            .locatedBy("//input[@name='NombreUsuario']");

    public static final Target IPTPASS = Target.the("Input para contraseña")
            .locatedBy("//input[@name='Contraseña']");

    public static final Target BTNINGRESO = Target.the("Botón para iniciar sesión")
            .locatedBy("//button[@id='BtnIngresarLogin']");
}
