import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

import java.time.Duration;
import java.util.Optional;

public class BaseTest {
    WebDriver driver;
    Wait wait;

    public BaseTest() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/fsuarez/IdeaProjects/seleniumdocker/src/test/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setImplicitWaitTimeout(Duration.ofSeconds(30));
        options.addArguments("start-maximized");
        this.driver = new ChromeDriver(options);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void navigateTo(String url){
        this.driver.navigate().to(url);
    }

    @AfterTest
    public void tearDown(){
        if(Optional.of(this.driver).isPresent()){
            this.driver.quit();
        }
    }
}
