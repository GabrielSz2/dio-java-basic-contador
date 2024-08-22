# Desafio: Controle de Fluxo em Java
Este repositório contém a solução para um desafio que visa exercitar o conteúdo abordado no módulo de Controle de Fluxo em Java. O desafio consiste na criação de um sistema que recebe dois números inteiros como parâmetros via terminal e realiza a seguinte operação:

## Descrição do Desafio
#### Entrada: O sistema recebe dois números inteiros como parâmetros via terminal.
#### Processo:
Se o primeiro número for menor ou igual ao segundo número, o sistema realiza uma iteração (for) com a quantidade de ocorrências correspondente à diferença entre os dois números.
Durante cada iteração, o sistema imprime no console o texto: "Imprimindo o número X", onde X é o número da ocorrência atual.
Se o primeiro número for maior que o segundo número, o sistema lança uma exceção customizada chamada ParametrosInvalidosException, que exibe a mensagem: "O segundo parâmetro deve ser maior que o primeiro".

#### Exemplo de Execução:
#### Entrada: 12 e 30
#### Saída: Impressão dos números de 1 a 18 no console.
#### Exceção: Se o primeiro número for maior que o segundo, a exceção ParametrosInvalidosException será lançada.
#### Objetivo:
O objetivo deste desafio é praticar o controle de fluxo, especialmente o uso de loops (for) e o tratamento de exceções customizadas em Java.

## Tecnologias Utilizadas
#### Java: Linguagem de programação utilizada para implementar o desafio.
