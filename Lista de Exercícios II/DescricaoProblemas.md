## PROBLEMA 01
**Implemente uma classe Produto. Um produto tem um nome e um preço. Forneça um construtor
e os getters e setters apropriados. Forneça também um método para reduzir o preço do produto
de acordo com uma taxa de porcentagem. A assinatura do método é a seguinte:**

```java
void reduzPreco(double taxa)
```

**Elabore um programa de testes que cria dois produtos, imprime o nome e o preço, reduz os
preços em 10% e então imprime os nomes e os preços novamente.?**

## PROBLEMA 02
**Crie uma classe chamada Fatura para que uma loja de suprimentos de informática a utilize para
representar uma fatura de um item vendido nela. Uma fatura deve incluir quatro partes das
informações como variáveis de instância: o número (String), a descrição (String), a quantidade
comprada de um item (int) e o preço por item (double). Sua classe deve ter um construtor que
inicializa as quatro variáveis de instância. Forneça métodos getters e setters adequados. Além
disso, forneça um método calculaValorFatura que calcula o valor da fatura e depois retorna
esse valor como double. Se a quantidade não for positiva ela deve ser configurada como zero.
Se o preço por item não for positivo ele também deve ser configurado como zero.
Escreva um programa de testes para testar os métodos implementados.**

## PROBLEMA 03
**Escreva uma classe que encapsule o conceito de Investimento, assumindo que um investimento
tenha os seguintes atributos: o valor investido e a taxa de juros na qual o investimento será
aplicado. Inclua um construtor, os métodos getters e setters adequados, bem como o método
toString(). Também inclua um método que retorne o valor futuro do investimento dependendo
de quantos anos o mantivermos antes de vendê-lo, o que poderá ser calculado com o uso da
seguinte fórmula:**

> *valorFuturo = investimento ∙ (1 + taxaDeJuros)^tempo*

**Assuma que a taxa de juros seja composta anualmente. Escreva uma classe de testes.**

## PROBLEMA 04
**A classe GregorianCalendar descreve um ponto no tempo, como medido pelo calendário
gregoriano, o calendário padrão comumente utilizado em quase todo o mundo. Você constrói um
objeto GregorianCalendar a partir de um ano, mês e dia, como no exemplo a seguir:

```java
GregorianCalendar cal = new GregorianCalendar(); //Data atual
GregorianCalendar natal = new GregorianCalendar(2018, Calendar.DECEMBER, 25);
Utilize as constantes Calendar.JANUARY ... Calendar.DECEMBER para especificar o mês. Os
valores vão de 0 a 11.

O método add pode ser utilizado para adicionar alguns dias a um objeto GregorianCalendar:
cal.add(Calendar.DAY_OF_MONTH, 10); //cal agora é 10 dias depois de hoje
Esse é um método modificador: ele altera o objeto cal.

O método get pode ser utilizado para consultar um objeto GregorianCalendar:
int diaDoMes = cal.get(Calendar.DAY_OF_MONTH);
int mes = natal.get(Calendar.MONTH);
int ano = cal.get(Calendar.YEAR);
int diaDaSemana = cal.get(Calendar.DAY_OF_WEEK);
System.out.println("Data: " + diaDoMes + "/ " + (mes+1) + "/ " + ano);
System.out.println("Dia da Semana: " + diaDaSemana);
O dia da semana varia de 1 (domingo) a 7 (sábado)
```

**Escreva um programa que imprima as seguintes informações (não se esqueça de importar as
classes java.util.Calendar e java.util.GregorianCalendar). Vá na Documentação do
Java conhecer essas classes (lembre-se de que com o Java 8 elas começam a ser
descontinuadas, mas ainda vamos vê-las em muitos sistemas)
▪ A data e o dia da semana daqui a 100 dias a partir da data atual
▪ O dia da semana em que você nasceu
▪ A data daqui a 10 mil dias depois do seu aniversário**
