package seleniumdocker.tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import seleniumdocker.pages.Home;

public class HomeTests extends BaseTest{

    @Test
    public void Home_EnterValidEmail_RegistrationSucceeds() {
        this.navigateTo("http://demo.automationtesting.in/Index.html");
        Home home = new Home(this.driver);

        this.wait.until(ExpectedConditions.visibilityOf(home.imgLogo));
        home.txtEmail.sendKeys("armandocodetest@test.com");
        home.btnRegister.click();

    }
}
