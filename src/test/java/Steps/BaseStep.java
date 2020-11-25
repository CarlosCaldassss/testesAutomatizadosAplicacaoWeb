package Steps;

import BasePages.DSL;
import BasePages.FormularioPage;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseStep {
    public WebDriver driver;
    public DSL dsl;
    public FormularioPage page;
    @Before
    public void inicializar() {
        DSL dsl;
        System.setProperty("webdriver.chrome.driver","/home/carlos/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.grupoa.com.br/");
        dsl = new DSL(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
        page = new FormularioPage(driver);
    }
}
