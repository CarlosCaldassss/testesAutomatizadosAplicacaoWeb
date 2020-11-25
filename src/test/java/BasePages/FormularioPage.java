package BasePages;

import org.openqa.selenium.WebDriver;

public class FormularioPage {
    public DSL dsl;

    public FormularioPage(WebDriver driver ) {
            dsl = new DSL(driver);
    }

    public void formularioPage(WebDriver driver) { dsl = new DSL(driver); }
    public void acessarBrowser(String id_campo) {dsl.acessarPagina(id_campo);}
    public void alternarJanelaBrowser(int id_janela) {dsl.alterarJanela(id_janela);}
    public void buscarLivro(String campoPesquisa){ dsl.usarPesquisa(campoPesquisa); }
    public void chamarPath(String id_Campo) { dsl.usarPath(id_Campo);}
    public void tempoDeEspera(int tempo) {dsl.esperarX(tempo);}

    public void iniciarCadastro() { dsl.acessarCadastro(); }
    public void preecherCadastro(String id_campo, String texto) {dsl.preencherFormulario(id_campo, texto);}
    public void preencherSexoM(){dsl.preencherSexoM();}
    public void usarPathParaCadastro(String id_path, String texto){dsl.preencherCampoComPath(id_path,texto);}
    public void selecionarEstadoAM() {dsl.selecionarEstado();}

}


