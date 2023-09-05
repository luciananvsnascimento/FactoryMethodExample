# Factory Method Pattern (GOF Design Pattern)

## Visão Geral

O padrão Factory Method é um padrão de criação que define uma interface para criar um objeto, mas permite que as subclasses alterem o tipo de objetos que serão criados. Isso fornece flexibilidade na criação de objetos, permitindo que você escolha o tipo de objeto a ser criado em tempo de execução.

Neste projeto, demonstramos o uso do Factory Method Pattern para criar instâncias de objetos `Nome` com diferentes formatos de nome e sobrenome.

## Estrutura do Projeto

- O código-fonte do padrão Factory Method está no diretório `FactoryMethod`.
- O arquivo `Main.java` contém o código principal que demonstra o uso do Factory Method Pattern.

## Como Usar

1. Compile o código-fonte usando um compilador Java.
2. Execute o programa resultante a partir da classe `Main`.
3. Observe como diferentes fábricas (`FabricaDeNomesF1` e `FabricaDeNomesF2`) são usadas para criar instâncias de `Nome` com diferentes formatos.
4. Os nomes criados são exibidos no console.
