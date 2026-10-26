# Sistema de Controle de Acesso — Seguranca

## Sobre o projeto

O **Seguranca** é um projeto desenvolvido em Java para simular o controle de acesso de um condomínio residencial.

O sistema permite selecionar diferentes tipos de acesso — morador, visitante e prestador de serviço — e validar as credenciais informadas pelo usuário.

O projeto foi criado com o objetivo de praticar programação orientada a objetos e aplicar o padrão de projeto **Strategy**.

## Funcionalidades

- Menu para selecionar o tipo de acesso.
- Autenticação de moradores, visitantes e prestadores de serviço.
- Validação de nome, apartamento e senha.
- Limite de três tentativas de autenticação.
- Bloqueio simulado após três tentativas inválidas.
- Mensagem simulada de notificação à segurança central.

## Tecnologias utilizadas

- Java 21
- Programação Orientada a Objetos (POO)
- Interface Java
- Padrão de projeto Strategy
- Scanner para entrada de dados pelo terminal

## Estrutura do projeto

```text
Seguranca/
├── README.md
└── src/
    ├── Main.java
    ├── EstrategiaAcesso.java
    ├── AcessoMorador.java
    ├── AcessoVisita.java
    └── AcessoServico.java
```

## Como executar

É necessário ter o JDK instalado e configurado.

Abra o terminal dentro da pasta `src` e execute:

```bash
javac *.java
java Main
```

Em seguida, escolha o tipo de acesso no menu e informe as credenciais de teste definidas nas classes correspondentes.

## Padrão de projeto Strategy

O padrão **Strategy** permite definir diferentes estratégias de autenticação por meio de uma interface comum.

Neste projeto:

- `EstrategiaAcesso`: define o contrato de autenticação.
- `AcessoMorador`: implementa a autenticação de morador.
- `AcessoVisita`: implementa a autenticação de visitante.
- `AcessoServico`: implementa a autenticação de prestador de serviço.
- `Main`: permite selecionar e executar a estratégia correspondente.

Essa organização facilita a manutenção e permite adicionar novas estratégias sem concentrar todas as regras de autenticação em uma única classe.

## Limitações

Este projeto é uma simulação educacional. As credenciais são definidas no código, o bloqueio vale apenas durante a execução atual e a notificação à segurança central é exibida somente no terminal. 

O sistema não controla portões físicos e não deve ser utilizado como solução real de segurança.

## Autor
Ronaldo Rial, aprendiz de QA e atualmente porteiro...
Projeto desenvolvido como prática de Java e padrões de projeto, com foco no aprendizado contínuo e na transição para a área de Tecnologia da Informação.
