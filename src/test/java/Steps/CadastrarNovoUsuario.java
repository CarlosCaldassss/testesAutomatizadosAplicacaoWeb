package Steps;

import org.junit.Test;

public class CadastrarNovoUsuario extends BaseStep{
    @Test
    public void cadastrarNovoUsuario() {
        page.iniciarCadastro();
        page.preecherCadastro("AddOrSetCustomer-Email","carlos@gmail.com");
        page.preecherCadastro("AddOrSetCustomer-Password","carlos1234");
        page.preecherCadastro("AddOrSetCustomer-Password-check","carlos1234");
        page.preecherCadastro("AddOrSetCustomer-Name","Carlos");
        page.preecherCadastro("AddOrSetCustomer-Surname","Caldas");
        page.preencherSexoM();
        page.preecherCadastro("AddOrSetCustomer-Cpf","00066587282");
        page.preecherCadastro("AddOrSetCustomer-BirthDate","28051991");
        page.preecherCadastro("AddOrSetCustomer-Contact-Phone","92984770272");
        page.preecherCadastro("AddOrSetAddress-0-AddressLine","Rua Buzios");
        page.usarPathParaCadastro("//*[@id=\"AddOrSetAddress-0-Number\"]","273");
        page.preecherCadastro("AddOrSetAddress-0-Neighbourhood","Distrito II");
        page.preecherCadastro("AddOrSetAddress-0-City","Manaus");
        page.selecionarEstadoAM();
        page.preecherCadastro("AddOrSetAddress-0-PostalCode","69007060");
    }
}
