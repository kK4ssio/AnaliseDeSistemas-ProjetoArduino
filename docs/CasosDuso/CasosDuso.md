CasosDuso
# Casos de Uso

## Índice

1. [Introdução](#introdução)
2. [Objetivos](#objetivos)
3. [Escopo](#escopo)
4. [Definição de Casos de Uso](#definição-de-casos-de-uso)
5. [Elementos de um Caso de Uso](#elementos-de-um-caso-de-uso)
    - 5.1 [Ator](#ator)
    - 5.2 [Objetivo](#objetivo)
    - 5.3 [Pré-condições](#pré-condições)
    - 5.4 [Fluxo Principal](#fluxo-principal)
6. [Metodologia](#metodologia)
    - 6.1 [Identificação dos Atores](#identificação-dos-atores)
    - 6.2 [Identificação dos Casos de Uso](#identificação-dos-casos-de-uso)
7. [Ferramentas Utilizadas](#ferramentas-utilizadas)
8. [Validação dos Casos de Uso](#validação-dos-casos-de-uso)
9. [Conclusão](#conclusão)

## Introdução

Nosso objetivo é desenvolver uma aplicação em Java que permita ao usuário se comunicar com uma placa Arduino de maneira mais fácil, utilizando uma interface gráfica em vez de um programa de linha de comando, tornando a aplicação mais amigável e intuitiva, e acessível a todos.


## Objetivos

1. Desenvolver uma aplicação em Java que permita a comunicação da máquina com uma placa Arduino através da comunicação serial.
2. Criar a aplicação Java no NetBeans IDE, com uma interface gráfica.
3. Implementar a comunicação serial para que a máquina possa enviar informações à placa e receber respostas.
4. Realizar testes regularmente para garantir a integridade e otimização do projeto.
5. Documentar todos os processos desde a fase inicial até a entrega.

## Escopo

O projeto visa desenvolver uma aplicação em Java que facilitará a comunicação com uma placa Arduino por meio de uma interface gráfica intuitiva. Isso eliminará a necessidade de usar comandos de linha de comando, tornando o processo mais acessível e amigável para os usuários. Inclui:
- Comunicação serial eficiente.
- Implementação de testes regulares para garantir a integridade do projeto.
- Documentação detalhada de todas as fases do desenvolvimento até a entrega final.


## Definição de Casos de Uso

**Caso de Uso 1: Comunicação com a Placa Arduino**

**Descrição:** Permitir ao usuário selecionar a porta serial, conectar-se à placa Arduino, enviar comandos e receber respostas.
- **Ator:** Usuário
- **Pré-condição:** O software Java está instalado e a interface gráfica está ativa.
- **Fluxo Principal:**
  1. O usuário abre a aplicação.
  2. A aplicação lista as portas de comunicação disponíveis.
  3. O usuário seleciona a porta onde a placa Arduino está conectada.
  4. O usuário conecta-se à placa.
  5. O usuário envia comandos à placa.
  6. A aplicação exibe as respostas recebidas da placa.
- **Fluxo Alternativo:**
  1. O usuário encerra a conexão com a placa.

**Caso de Uso 2: Listagem de Portas de Comunicação**

**Descrição:** A aplicação deve listar todas as portas seriais disponíveis para o usuário.
- **Ator:** Usuário
- **Pré-condição:** O software Java está instalado e a interface gráfica está ativa.
- **Fluxo Principal:**
  1. O usuário abre a aplicação.
  2. A aplicação lista todas as portas seriais disponíveis.


## Elementos de um Caso de Uso

1. **Título do Caso de Uso:** Descreve a funcionalidade que será realizada.
2. **Descrição:** Explica brevemente o que o caso de uso realiza.
3. **Ator:** Quem interage com o sistema (usuário, administrador, etc.).
4. **Pré-condições:** O estado do sistema antes do caso de uso ser iniciado.
5. **Fluxo Principal:** Os passos principais que compõem o caso de uso.
6. **Fluxo Alternativo:** Passos alternativos que podem ocorrer.
7. **Pós condições:** O estado do sistema após a conclusão do caso de uso.

### Ator

O ator principal é o usuário da aplicação, que interage com o sistema para se comunicar com a placa Arduino. Ele deve ser capaz de:
- Selecionar a porta serial correta.
- Conectar e desconectar da placa.
- Enviar e receber dados através da interface gráfica.

### Objetivo

O objetivo deste projeto é desenvolver uma aplicação em Java que permita aos usuários se comunicarem com uma placa Arduino de maneira mais fácil e intuitiva. A aplicação deve utilizar uma interface gráfica em vez de comandos de linha de comando, facilitando a interação do usuário com o dispositivo Arduino por meio da comunicação serial.


### Pré-condições

- O usuário deve ter o Java 8 instalado em seu computador.
- A aplicação deve ser desenvolvida no ambiente de desenvolvimento integrado (IDE) NetBeans 8.
- A placa Arduino deve estar corretamente conectada ao computador.
- O Arduino IDE deve estar instalado para garantir a correta comunicação entre a aplicação Java e a placa Arduino.

### Fluxo Principal

1. **Início da Aplicação:**
   - O usuário abre a aplicação Java.
   - A interface gráfica é carregada.

2. **Listagem das Portas de Comunicação:**
   - A aplicação lista todas as portas seriais disponíveis.

3. **Seleção da Porta de Comunicação:**
   - O usuário seleciona a porta à qual a placa Arduino está conectada.

4. **Conexão à Placa Arduino:**
   - O usuário estabelece a conexão com a placa Arduino através da porta selecionada.

5. **Envio e Recebimento de Dados:**
   - O usuário envia comandos para a placa Arduino.
   - A placa Arduino processa os comandos e retorna uma resposta.
   - A aplicação exibe as respostas recebidas.

6. **Desconexão:**
   - O usuário encerra a conexão com a placa Arduino.

## Metodologia


Adotamos uma metodologia de desenvolvimento iterativa e incremental, dividida em várias etapas:

1. **Planejamento e Análise:**
   - Definição dos requisitos funcionais e não funcionais.
   - Análise das necessidades de comunicação serial com a placa Arduino.

2. **Projeto:**
   - Design detalhado da interface gráfica utilizando o NetBeans IDE.
   - Garantia de uma experiência de usuário intuitiva e eficiente.

3. **Implementação:**
   - Desenvolvimento da aplicação em Java seguindo as melhores práticas de programação.
   - Utilização de bibliotecas para comunicação serial.

4. **Testes:**
   - Realização de testes unitários e de integração para verificar a comunicação serial e a integridade da aplicação.

5. **Documentação:**
   - Documentação detalhada das atividades realizadas, incluindo requisitos, design, implementação e testes.

### Identificação dos Atores

- **Usuário:** Interage com a aplicação para se comunicar com a placa Arduino. Seleciona portas seriais, envia comandos e recebe respostas.

### Identificação dos Casos de Uso


1. **Caso de Uso 1: Comunicação com a Placa Arduino**
   - Descrição: Permitir ao usuário selecionar a porta serial, conectar-se à placa Arduino, enviar comandos e receber respostas.

2. **Caso de Uso 2: Listagem de Portas de Comunicação**
   - Descrição: A aplicação deve listar todas as portas seriais disponíveis para o usuário.

## Ferramentas Utilizadas

- **DRAW.IO**: Para a criação do Diagrama;.
- **Google Docs**: Para a documentação dos casos de uso.;.

## Validação dos Casos de Uso

1. **Teste do Caso de Uso 1: Comunicação com a Placa Arduino**
   - Verificar se a aplicação lista corretamente as portas seriais disponíveis.
   - Confirmar que o usuário pode selecionar uma porta e conectar-se à placa Arduino.
   - Testar o envio de comandos e a recepção de respostas da placa Arduino.

2. **Teste do Caso de Uso 2: Listagem de Portas de Comunicação**
   - Garantir que todas as portas seriais disponíveis são listadas corretamente.
   - Validar que a aplicação não falha ao listar portas.

## Conclusão

O desenvolvimento da aplicação Java proposta facilitará a comunicação com uma placa Arduino, tornando o processo mais acessível e intuitivo para os usuários. A interface gráfica eliminará a complexidade dos comandos de linha de comando, promovendo uma interação mais fluida e eficiente. Com uma comunicação serial direta e eficaz, a aplicação permitirá uma experiência de uso mais amigável, incentivando a inovação e o desenvolvimento contínuo de soluções tecnológicas acessíveis.