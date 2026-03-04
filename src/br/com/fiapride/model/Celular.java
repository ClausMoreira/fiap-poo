package br.com.fiapride.model;

public class Celular {
    // Atributos (características)
    public int capacidadeGB;
    public String cor;
    public String modelo;

    // Método para alterar a cor com validação
    public void setCor(String novaCor) {
        if (novaCor != null && !novaCor.isEmpty()) {
            this.cor = novaCor;
        } else {
            System.out.println("Cor inválida!");
        }
    }

    // Método para alterar a capacidade com validação
    public void setCapacidadeGB(int novaCapacidade) {
        if (novaCapacidade > 0) {
            this.capacidadeGB = novaCapacidade;
        } else {
            System.out.println("Capacidade inválida! Deve ser maior que zero.");
        }
    }

    // Método para alterar o modelo com validação
    public void setModelo(String novoModelo) {
        if (novoModelo != null && !novoModelo.isEmpty()) {
            this.modelo = novoModelo;
        } else {
            System.out.println("Modelo inválido!");
        }
    }
}