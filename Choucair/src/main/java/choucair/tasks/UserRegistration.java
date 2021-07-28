package choucair.tasks;

import choucair.interactions.Wait;
import choucair.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class UserRegistration implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Wait.theSeconds(2),
                Click.on(HomePage.EMPLEO),
                Wait.theSeconds(2),
                Scroll.to(HomePage.SCROLL),
                Click.on(HomePage.PORTAL),
                Wait.theSeconds(2),
                Click.on(HomePage.CONTINUAR),
                Wait.theSeconds(2),
                Scroll.to(HomePage.LOGO),
                Click.on(HomePage.REGISTRATE),
                Wait.theSeconds(2),
                Click.on(HomePage.CONREGISTRAR),
                Wait.theSeconds(2),
                Click.on(HomePage.MANUAL),
                Click.on(HomePage.CONDICIONES),
                Wait.theSeconds(2),
                Click.on(HomePage.ACEPTAR),
                Wait.theSeconds(2),
                SendKeys.of("el_correo@hotmail.com").into(HomePage.CORREO),
                SendKeys.of("el_correo@hotmail.com").into(HomePage.CORREOCONF),
                Wait.theSeconds(2),
                Click.on(HomePage.SIGUIENTE),
                Wait.theSeconds(2),
                SendKeys.of("Jonathan").into(HomePage.NOMBRE),
                SendKeys.of("Rios").into(HomePage.APELLIDO),
                Wait.theSeconds(2),
                Click.on(HomePage.SIGUIENTE2),
                Click.on(HomePage.PAIS),
                SendKeys.of("Colombia").into(HomePage.PAIS)
        );
    }
    public static UserRegistration userRegistration(){
        return instrumented(UserRegistration.class);
    }
}
