package seleniumdocker.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home extends BasePage {
    public Home(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "logo")
    public WebElement imgLogo;

    @FindBy(id = "email")
    public WebElement txtEmail;

    @FindBy(id = "enterimg")
    public WebElement btnRegister;
}
