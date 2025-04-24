package co.edu.pascualbravo.sicau.tasks;

import co.edu.pascualbravo.sicau.userInterface.LoginUI;
import io.cucumber.java.bs.I;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.edu.pascualbravo.sicau.userInterface.LoginUI.*;

public class IniciarSesionTask implements Task {

    private String email, pass;

    public IniciarSesionTask(String email, String pass){
        this.email = email;
        this.pass = pass;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.keyValues(email).into(IPTEMAIL),
                Enter.keyValues(pass).into(IPTPASS),
                Click.on(BTNINGRESO)
        );
    }

    public static IniciarSesionTask conElUsuario(String email, String pass){
        return new IniciarSesionTask(email, pass);
    }
}
