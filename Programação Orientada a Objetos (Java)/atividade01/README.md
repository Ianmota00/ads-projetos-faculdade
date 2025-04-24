 Projeto de Cadastro de Pessoas (POO - Java)

Este projeto foi desenvolvido como parte das atividades da disciplina de **Programação Orientada a Objetos** no curso de **Análise e Desenvolvimento de Sistemas**. O objetivo é aplicar os conceitos de encapsulamento, herança, abstração e uso de listas genéricas para cadastrar, localizar e excluir pessoas.

 Descrição

O sistema permite realizar o cadastro de pessoas com seus dados básicos e foi estruturado de forma orientada a objetos. Também há uma classe `Carro`, já implementada, mas que ainda não foi integrada ao menu principal.

 Estrutura de Classes

- Pessoa
  Representa uma pessoa com nome, sexo, telefone e endereço.

- Carro 
  Estrutura de dados de carros com atributos como marca, modelo, combustível e cor (ainda não utilizado no menu).

- CadastroAbstract
  Classe abstrata que define as operações básicas de cadastro: `cadastrar`, `excluir` e `localizar`.

- PessoaCadastro 
  Implementa a lógica de cadastro, busca e exclusão de pessoas usando uma lista interna.

- MenuAbstract 
  Estrutura para possíveis menus interativos (a ser implementado ou estendido).

- Listas (main)  
  Classe principal com testes manuais e criação de listas de `String` e `Carro`.

Funcionalidades Implementadas

- Cadastro de pessoas
- Busca de pessoa pelo nome
- Exclusão de pessoa
- Armazenamento interno com `ArrayList`

Em desenvolvimento

- Integração do menu de interação com o usuário
- Uso da classe Carro nas funcionalidades principais
- Criação de interface de usuário (CLI ou GUI)
- Validações e feedbacks

