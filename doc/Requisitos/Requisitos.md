# Levantamento de Requisitos

## Índice

1. [Introdução](#introdução)
2. [Objetivos](#objetivos)
3. [Escopo](#escopo)
4. [Metodologia](#metodologia)
    - 4.1 [Entrevistas](#entrevistas)
    - 4.2 [Observação](#observação)
5. [Requisitos Funcionais](#requisitos-funcionais)
6. [Requisitos Não Funcionais](#requisitos-não-funcionais)
7. [Documentação dos Requisitos](#documentação-dos-requisitos)
8. [Validação dos Requisitos](#validação-dos-requisitos)
9. [Gerenciamento de Mudanças](#gerenciamento-de-mudanças)
10. [Conclusão](#conclusão)

## Introdução

O objetivo é desenvolver uma aplicação em Java que permita ao usuário se comunicar com uma placa Arduino de maneira mais fácil, utilizando uma interface gráfica ao invés de um programa de linha de comando. Isso visa tornar o uso da aplicação mais amigável e intuitivo, deixando tudo mais acessível.

## Objetivos

- Desenvolver uma aplicação em Java que permita a comunicação da máquina com uma placa Arduino através da comunicação serial.
- Permitir ao usuário digitar uma informação e a placa retornar um sinal.
- Criar a aplicação Java no NetBeans IDE com uma interface gráfica.
- Fazer a comunicação serial para alcançar o objetivo principal.
- Realizar testes regularmente para entregar um projeto íntegro e otimizado.
- Documentar os processos desde a fase inicial até a entrega.

## Escopo

Este documento abrange todas as atividades relacionadas ao levantamento de requisitos, incluindo técnicas de coleta, ferramentas utilizadas e processos de validação e gerenciamento de mudanças.

## Metodologia

### Entrevistas

As entrevistas serão conduzidas com os principais stakeholders para coletar informações detalhadas sobre suas necessidades e expectativas. Reunião com o professor, coletando requisitos, atrvés de uma lista de perguntas..  

### Observação

A observação direta dos processos e ambientes de trabalho dos stakeholders será utilizada para identificar necessidades e requisitos que podem não ser expressos diretamente pelos usuários.

## Requisitos Funcionais

- A aplicação deve permitir a comunicação com a placa Arduino.
- Deve listar as portas de comunicação disponíveis.
- Deve ser possível conectar e desconectar da placa.
- Deve possuir uma interface gráfica intuitiva.
- Deve permitir a seleção da porta na qual a placa está conectada.
- Deve ter um campo para enviar informações para a placa e receber respostas.

## Requisitos Não Funcionais

- A aplicação deve ser desenvolvida em Java 8 utilizando o NetBeans 8.
- O sistema deve possuir Microsoft Windows instalado.
- Utilização de GitHub para criação do repositório.

## Documentação dos Requisitos

Todos os requisitos serão documentados de forma clara e organizada em um documento central. Este documento incluirá descrições detalhadas dos requisitos, juntamente com critérios de aceitação e prioridades.

## Validação dos Requisitos

- A comunicação serial deve ser testada para garantir que a placa Arduino responde corretamente às entradas do usuário.
- A interface gráfica deve ser avaliada por testes de usabilidade para garantir que é intuitiva e fácil de usar.
- Os testes unitários e de integração devem ser realizados regularmente para garantir a robustez da aplicação.
- A documentação detalhada deve ser mantida durante todo o processo de desenvolvimento.

## Gerenciamento de Mudanças

- Qualquer alteração nos requisitos funcionais ou não funcionais deve ser documentada e aprovada.
- Implementação de um sistema de controle de versão (GitHub) para monitorar as mudanças no código.
- Realização de reuniões regulares de revisão para discutir as mudanças necessárias e seu impacto no projeto.

## Conclusão

O desenvolvimento da aplicação visa facilitar a comunicação com uma placa Arduino, tornando o processo mais acessível e intuitivo para os usuários. Ao substituir a complexidade dos programas de linha de comando por uma interface gráfica, o projeto busca não apenas simplificar o uso da tecnologia, mas também ampliar seu potencial de aplicação em diversos contextos. A aplicação proporcionará uma experiência de interação mais fluida e eficaz entre computadores e dispositivos Arduino, promovendo a inovação e o desenvolvimento contínuo de soluções tecnológicas acessíveis a todos.
