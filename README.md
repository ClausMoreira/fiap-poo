# FiapRide - Celular

## O que é essa classe?
A classe `Celular` representa um celular no mundo real,
com atributos de capacidade de armazenamento, cor e modelo.

## Atributos
- `capacidadeGB`: armazenamento interno do celular em GB
- `cor`: cor do celular
- `modelo`: modelo do celular (ex: "Galaxy S24")

## Métodos
- `setCor(novaCor)`: altera a cor. Não permite valor vazio.
- `setCapacidadeGB(novaCapacidade)`: altera a capacidade. Não permite valor negativo ou zero.
- `setModelo(novoModelo)`: altera o modelo. Não permite valor vazio.

## Como usar
```java
Celular meuCelular = new Celular();
meuCelular.setCor("Preto");
meuCelular.setCapacidadeGB(128);
meuCelular.setModelo("Galaxy S24");
```