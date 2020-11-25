package BasePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class DSL {
    private WebDriver driver;
    public DSL(WebDriver driver) {
        this.driver = driver;
    }
    public void acessarPagina(String id_campo) {
        driver.findElement(By.id(id_campo)).click();
    }
    public void alterarJanela(int id_janela)   {driver.switchTo().window((String) driver.getWindowHandles().toArray()[id_janela]); }
    public void usarPesquisa(String campo_pesquisa){
        WebElement campoDeTexto = driver.findElement(By.name("query"));
        campoDeTexto.sendKeys(campo_pesquisa);
        campoDeTexto.submit(); }
    public void usarPath(String id_campo){ driver.findElement(By.xpath(id_campo)).click(); }
    public void esperarX(int tempo) {driver.manage().timeouts().implicitlyWait(tempo, TimeUnit.SECONDS);}
    public void acessarCadastro() {driver.get("https://loja.grupoa.com.br");
        driver.findElement(By.cssSelector(".login-wrapper")).click();
        driver.findElement(By.linkText("Criar conta")).click();
        driver.findElement(By.xpath("//option[text()=\"Profissional\"]")).click();}
    public void preencherFormulario(String id_campo,String texto) {driver.findElement(By.id(id_campo)).sendKeys(texto);}
    public void preencherSexoM() {driver.findElement(By.xpath("//option[text()=\"Masculino\"]")).click();}
    public void preencherCampoComPath(String id_path, String texto){driver.findElement(By.xpath(id_path)).sendKeys(texto);}
    public void selecionarEstado() {
        driver.findElement(By.id("AddOrSetAddress-0-City")).sendKeys("Manaus");
        driver.findElement(By.xpath("//option[text()=\"Amazonas\"]")).click(); }
}
