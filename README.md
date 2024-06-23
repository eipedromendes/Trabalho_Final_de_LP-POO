<div class="markdown-heading" dir="auto">
    <h2 tabindex="-1" class="heading-element" dir="auto" style="font-size: 1.5em;">
        Sistema de Vendas de Acessórios para Celular
    </h2>
    <a id="user-content--Sistema de Vendas de Acessórios para Celular" class="anchor" aria-label="Permalink: Sistema de Vendas de Acessórios para Celular" href="#-Sistema de Vendas de Acessórios para Celular">
        <svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true">
            <path d="m7.775 3.275 1.25-1.25a3.5 3.5 0 1 1 4.95 4.95l-2.5 2.5a3.5 3.5 0 0 1-4.95 0 .751.751 0 0 1 .018-1.042.751.751 0 0 1 1.042-.018 1.998 1.998 0 0 0 2.83 0l2.5-2.5a2.002 2.002 0 0 0-2.83-2.83l-1.25 1.25a.751.751 0 0 1-1.042-.018.751.751 0 0 1-.018-1.042Zm-4.69 9.64a1.998 1.998 0 0 0 2.83 0l1.25-1.25a.751.751 0 0 1 1.042.018.751.751 0 0 1 .018 1.042l-1.25 1.25a3.5 3.5 0 1 1-4.95-4.95l2.5-2.5a3.5 3.5 0 0 1 4.95 0 .751.751 0 0 1-.018 1.042.751.751 0 0 1-1.042.018 1.998 1.998 0 0 0-2.83 0l-2.5 2.5a1.998 1.998 0 0 0 0 2.83Z"></path>
        </svg>
    </a>
</div>

-----

<h3>Descrição do Projeto</h3>

<p>Este projeto é um sistema de vendas de acessórios para celular, desenvolvido como parte da avaliação de Programação Orientada a Objetos (POO). A aplicação permite que os usuários visualizem produtos, adicionem itens ao carrinho, e realizem pagamentos. Foi utilizado um banco de dados MySQL para armazenar as informações dos produtos, clientes e vendas.</p>

-----

<h3>Funcionalidades Implementadas</h3>

<p><b>Tela Principal</b>: Exibe a lista de produtos disponíveis, permitindo a seleção de itens para adicionar ao carrinho.</p>
<p><b>Tela de Login</b>: Interface para autenticação de usuários.</p>
<p><b>Tela de Carrinho de Compras</b>: Permite a visualização dos itens adicionados ao carrinho, com opções para continuar comprando ou prosseguir para o pagamento.</p>
<p><b>Tela de Pagamento</b>: Interface para finalizar a compra, fornecendo as opções de pagamento.</p>

-----

<h3>Tecnologias Utilizadas</h3>

<p>Linguagem de Programação: Java</p>
<p>Interface Gráfica: Swing</p>
<p>Banco de Dados: MySQL</p>

-----

<h3>Estrutura do Projeto</h3>

<p>O projeto foi organizado utilizando pacotes para separar o frontend e o backend:</p>
<p>Pacote BackEnd: Contém as classes principais do sistema, como Produto, Cliente, Venda, Estoque, e outras entidades do domínio.</p>
<p>Pacote FrontEnd: Contém as classes responsáveis pela interface gráfica da aplicação, incluindo as telas de login, principal, carrinho e pagamento.</p>

-----

<h3>Detalhes da Implementação</h3>

<p><b>Parte 1: Implementação das Entidades</b></p>
<p>Implementação das classes de domínio seguindo as melhores práticas de POO. 
Encapsulamento adequado de todos os campos das classes, com getters e setters. 
Construtores vazios (sem argumentos) para cada classe, inicializando os campos com valores padrão apropriados.</p>

<p><b>Parte 2: Conexão com Banco de Dados</b></p>
<p>Para estabelecer a conexão com o banco de dados MySQL Workbench, foram seguidos passos essenciais. Inicialmente, o banco foi criado e configurado na própria ferramenta, conhecida pela sua eficácia no gerenciamento de bancos MySQL. Para a integração da aplicação, foi crucial utilizar o driver JDBC no Visual Studio Code, possibilitando operações Java com o banco. A estrutura do projeto foi organizada com a pasta "connection" e o arquivo ConnectionFactory, centralizando a lógica de conexão para garantir eficiência e segurança. Com métodos para abrir e fechar conexões, o arquivo assegura uma interação robusta e segura com o banco de dados, mantendo a integridade do sistema e facilitando a manutenção do código.</p>

-----

<h3>Pontos de Execução</h3>

<p>O projeto inclui um ponto de execução principal na classe TelaPrincipal, com o método public static void main, que inicia a aplicação.</p>

-----

<h3>Instruções para Execução</h3>

<p>Clone o repositório do projeto. Configure as credenciais de acesso ao banco de dados no código-fonte. Compile e execute o projeto utilizando um ambiente de desenvolvimento Java (IDE) como IntelliJ IDEA</p>

-----

<h3>Conclusão</h3>

<p>Este projeto demonstra a aplicação de conceitos de Programação Orientada a Objetos e a integração com um banco de dados MySQL para criar um sistema funcional de vendas de acessórios para celular. As funcionalidades implementadas abrangem desde a visualização e seleção de produtos até a finalização de compras através de uma interface gráfica intuitiva.</p>

-----

<h3>Tela de Login:</h3>
<td><a href="https://github.com/eipedromendes" target="_blank"><img src="https://github.com/eipedromendes/Trabalho_Final_de_LP-POO/blob/main/imggif/telaLogin.jpeg?raw=true" width="500px" height="600px"/></a>
</td>
