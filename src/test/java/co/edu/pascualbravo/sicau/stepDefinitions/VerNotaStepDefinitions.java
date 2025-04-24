package co.edu.pascualbravo.sicau.stepDefinitions;

import co.edu.pascualbravo.sicau.questions.ValidarMateria;
import co.edu.pascualbravo.sicau.tasks.IniciarSesionTask;
import co.edu.pascualbravo.sicau.tasks.VerNotasTask;
import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class VerNotaStepDefinitions {

    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }

    @Dado("que me encuentro en la pagina {string}")
    public void queMeEncuentroEnLaPagina(String url) {
        // Write code here that turns the phrase above into concrete actions
        WebDriverManager.chromedriver().setup();
        theActorCalled("robot").wasAbleTo(Open.url(url));
    }
    @Cuando("inicie sesion con correo {string} y contraseña {string}")
    public void inicieSesionConCorreoYContraseña(String mail, String pass) {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight()
                .attemptsTo(
                        IniciarSesionTask.conElUsuario(mail, pass)
                );
    }
    @Cuando("seleccione ver notas")
    public void seleccioneVerNotas() {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight()
                .attemptsTo(
                        VerNotasTask.conSesionAbierta()
                );
    }
    @Entonces("visualizo la ventana con almenos la materia {string}")
    public void visualizoLaVentanaConAlmenosLaMateria(String materia) {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight()
                        .attemptsTo(
                                ValidarMateria.conLaMateria(materia)
                        );

    }

}
