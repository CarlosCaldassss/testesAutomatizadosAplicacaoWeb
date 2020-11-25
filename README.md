# testesAutomatizadosAplicacaoWeb
O teste visa o cadastro de um novo usuario e a compra de um livro pré-definido
<<<<<<< Updated upstream
# AutomacaoSiteGrupoA
 Teste Automatizado para realizar a busca por um livro especifico e adiciona-lo ao carrinho
# Projeto Automação Teste Funcional



## Objetivo

O projeto consiste na automação de um Teste de Busca por um produto especifico e adiciona-lo ao carrinho de compras.

=======
# Projeto Automação Teste Funcional 

## Objetivo

O projeto contem dois testes, no primeiro cenário iremos automatizar um Teste de Busca por um produto especifico e adiciona-lo ao carrinho de compras.
Enquanto que no segundo cenário iremos adicionar um novo usuário preenchendo o formulário, porém o mesmo conta com um sistema anti-robô então o teste para sem enviar
os dados para o servidor.
>>>>>>> Stashed changes
### Teste de interface web

O teste será aplicado no endereço: https://www.grupoa.com.br

## Teste 1

Pesquisar um livro denominado "testes de software" e adiciona-lo ao carrinho.

### Dados que serão inseridos

Dado que se acessa o campo de pesquisa<p>
E insere o valor "testes de software"<p>
E envia a submissão<p>
E acessa o produto na lista de retorno<p>
E seleciona o botão Comprar<p>
Entao o livro é adicionado ao carrinho<p>


## Teste 2

Realizar um novo Cadastro

### Dados que serão inseridos

Dado que ao acessar o link Loja Virtual <o>
E acessar o link criar conta<p>
E preencher os campos necessários<o>
E Deve-se submeter ao teste anti-robo<o>
Então Teste Finaliza aqui.


## Configurações:

Foi desenvolvido em ```Java```. <p>
Dependencias: ```Junit``` e ```Selenium```.<p>
IDE: ```Intellij IDE```<p>
Nescessário baixar o Chromedriver. Foi usado o navegador Google Chrome Versão 86.0.4240.183 (Versão oficial) 64 bits<p>
Obs. Verifique a versão do seu navegador chrome e baixe o Chromedriver de acordo a sua versão.
Link para download do Chromedriver:http://chromedriver.chromium.org/downloads<p>
Após baixar, recomendo que crie uma pasta com o nome Temp e dentro dela crie outra pasta com nome drivers no diretorio c.(Windows), ou em /home/usuario/drivers (Linux .deb)
<<<<<<< Updated upstream
=======

>>>>>>> Stashed changes
