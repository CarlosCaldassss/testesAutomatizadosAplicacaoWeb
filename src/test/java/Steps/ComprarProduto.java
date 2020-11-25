package Steps;

import BasePages.ComprarProdutoPage;
import BasePages.DSL;
import BasePages.FormularioPage;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class ComprarProduto extends BaseStep{
    @Test
    public void ComprarProduto() {

        page.tempoDeEspera(30);
        page.acessarBrowser("btn-loja");
        page.alternarJanelaBrowser(1);
        page.buscarLivro("testes de software");
        //selecionar o livro que deseja comprar
        page.chamarPath("//*[@id=\"middle\"]/div/div[3]/section/div[4]/article/div/div[1]/a/img");
        //finalizar compra
        page.chamarPath("//*[@id=\"content-wrapper\"]/article/div[1]/div/div[2]/div[1]/div[2]/div[4]/div/div[2]/a");
    }
}


