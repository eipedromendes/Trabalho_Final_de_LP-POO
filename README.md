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

<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sistema de Vendas de Acessórios para Celular</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            line-height: 1.6;
            max-width: 800px;
            margin: 0 auto;
            padding: 20px;
        }
        h1, h2, h3 {
            color: #333;
        }
        h2 {
            font-size: 1.5em;
        }
        h3 {
            font-size: 1.2em;
        }
        p {
            margin-bottom: 10px;
        }
    </style>
</head>
<body>
    <h2>Sistema de Vendas de Acessórios para Celular</h2>
    <h3>Descrição do Projeto</h3>
    <p>
        Este projeto é um sistema de vendas de acessórios para celular, desenvolvido como parte da avaliação de Programação Orientada a Objetos (POO). A aplicação permite que os usuários visualizem produtos, adicionem itens ao carrinho, e realizem pagamentos. Foi utilizado um banco de dados MySQL para armazenar as informações dos produtos, clientes e vendas.
    </p>

    <h3>Funcionalidades Implementadas</h3>
    <ul>
        <li><strong>Tela Principal:</strong> Exibe a lista de produtos disponíveis, permitindo a seleção de itens para adicionar ao carrinho.</li>
        <li><strong>Tela de Login:</strong> Interface para autenticação de usuários.</li>
        <li><strong>Tela de Carrinho de Compras:</strong> Permite a visualização dos itens adicionados ao carrinho, com opções para continuar comprando ou prosseguir para o pagamento.</li>
        <li><strong>Tela de Pagamento:</strong> Interface para finalizar a compra, fornecendo as opções de pagamento.</li>
    </ul>

    <h3>Tecnologias Utilizadas</h3>
    <ul>
        <li><strong>Linguagem de Programação:</strong> Java</li>
        <li><strong>Interface Gráfica:</strong> Swing</li>
        <li><strong>Banco de Dados:</strong> MySQL</li>
    </ul>

    <h3>Estrutura do Projeto</h3>
    <p>
        O projeto foi organizado utilizando pacotes para separar o frontend e o backend:
    </p>
    <ul>
        <li><strong>Pacote BackEnd:</strong> Contém as classes principais do sistema, como Produto, Cliente, Venda, Estoque, e outras entidades do domínio.</li>
        <li><strong>Pacote FrontEnd:</strong> Contém as classes responsáveis pela interface gráfica da aplicação, incluindo as telas de login, principal, carrinho e pagamento.</li>
    </ul>

    <h3>Detalhes da Implementação</h3>
    <p>
        <strong>Parte 1: Implementação das Entidades</strong>
        <br>
        Implementação das classes de domínio seguindo as melhores práticas de POO. Encapsulamento adequado de todos os campos das classes, com getters e setters. Construtores vazios (sem argumentos) para cada classe, inicializando os campos com valores padrão apropriados.
    </p>
    <p>
        <strong>Parte 2: Conexão com Banco de Dados</strong>
        <br>
        Configuração da conexão com o banco de dados MySQL. Utilização de operações CRUD (Criar, Consultar, Atualizar e Excluir) para gerenciar os dados de produtos, clientes e vendas no banco de dados.
    </p>
    <p>
        <strong>Parte 3: Operações CRUD</strong>
        <br>
        Implementação das operações CRUD para a classe principal, Produto. Funcionalidade de criação, consulta, atualização e exclusão de registros no banco de dados.
    </p>

    <h3>Pontos de Execução</h3>
    <p>
        O projeto inclui um ponto de execução principal na classe TelaPrincipal, com o método <code>public static void main</code>, que inicia a aplicação.
    </p>

    <h3>Instruções para Execução</h3>
    <ol>
        <li>Certifique-se de que o banco de dados MySQL está configurado e rodando.</li>
        <li>Clone o repositório do projeto.</li>
        <li>Configure as credenciais de acesso ao banco de dados no código-fonte.</li>
        <li>Compile e execute o projeto utilizando um ambiente de desenvolvimento Java (IDE) como IntelliJ IDEA ou Eclipse.</li>
    </ol>

    <h3>Conclusão</h3>
    <p>
        Este projeto demonstra a aplicação de conceitos de Programação Orientada a Objetos e a integração com um banco de dados MySQL para criar um sistema funcional de vendas de acessórios para celular. As funcionalidades implementadas abrangem desde a visualização e seleção de produtos até a finalização de compras através de uma interface gráfica intuitiva.
    </p>
</body>
</html>
