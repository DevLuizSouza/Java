# Projeto Cardápio Fast Food

[![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg)](https://opensource.org/licenses/MIT)
[![Java](https://img.shields.io/badge/Java-8%2B-orange.svg)](https://www.java.com/pt-BR/)
[![GitHub stars](https://img.shields.io/github/stars/seu-usuario/seu-repositorio.svg)](https://github.com/seu-usuario/seu-repositorio/stargazers)

Este projeto é uma implementação simples de um sistema de cardápio de fast food usando o padrão de design "Template Method" em Java.

## Descrição

O sistema de cardápio de fast food possui três tipos de cardápios: Adulto, Infantil e Vegetariano. Cada cardápio tem seus próprios itens e custos específicos. O padrão de design "Template Method" é utilizado para fornecer uma estrutura comum para o processo de montagem e cálculo do custo dos cardápios, enquanto as subclasses concretas implementam os detalhes específicos de cada cardápio.

## Como funciona

O projeto possui as seguintes classes principais:

1. `Menu` (classe abstrata): Define os métodos `montarMenu()` e `calcularCusto()` como métodos de template. As subclasses concretas devem implementar os métodos `adicionarItens()` e `calcularPrecoBase()`.

2. `MenuAdulto` (subclasse): Implementa os itens do cardápio adulto e define o preço base.

3. `MenuInfantil` (subclasse): Implementa os itens do cardápio infantil, incluindo um item adicional (brinquedo surpresa), e define o preço base.

4. `MenuVegetariano` (subclasse): Implementa os itens do cardápio vegetariano, incluindo um item adicional (temperos), e define o preço base.

## Como executar

O projeto inclui uma classe de teste `TesteMenu` que demonstra o uso das classes de cardápio. Para executar os testes, basta rodar a classe de teste.

## Pré-requisitos

- Java JDK 8 ou superior

## Contribuição

Este é um projeto de demonstração e contribuições não são esperadas.

## Licença

Este projeto é de código aberto e licenciado sob a Licença MIT.
