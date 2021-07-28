package choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {
    public static final Target EMPLEO = Target.the("empleo").locatedBy("//a[@href='https://www.choucairtesting.com/empleos-testing/']");
    public static final Target PORTAL = Target.the("Portal").locatedBy("(//a[@class='elementor-button-link elementor-button elementor-size-lg'])[1]");
    public static final Target SCROLL = Target.the("Scroll").locatedBy("(//img[@class='elementor-animation-grow'])[1]");
    public static final Target CONTINUAR = Target.the("Continuar").locatedBy("//a[@class='elementor-button-link elementor-button elementor-size-sm']");
    public static final Target LOGO = Target.the("logo").locatedBy("(//img[@class=''])[1]");
    public static final Target REGISTRATE = Target.the("Registrate").locatedBy("(//a[@class='btn'])[2]");
    public static final Target CONREGISTRAR = Target.the("Continuar Registro").locatedBy("//button[@class='ant-btn ant-btn-round common-button candidate-location__submit-button large']");
    public static final Target MANUAL = Target.the("manual").locatedBy("(//input[@class='ant-radio-input'])[4]");
    public static final Target CONDICIONES = Target.the("condiciones").locatedBy("(//input[@class='ant-checkbox-input'])");
    public static final Target ACEPTAR = Target.the("aceptar").locatedBy("//button[@class='ant-btn ant-btn-round common-button registration-type__next-step small']");
    public static final Target CORREO = Target.the("").located(By.id("email-info_email"));
    public static final Target CORREOCONF = Target.the("").located(By.id("email-info_emailConfirmation"));
    public static final Target SIGUIENTE = Target.the("aceptar").locatedBy("//button[@class='ant-btn ant-btn-round common-button signup__actions signup__actions--next small']");
}
