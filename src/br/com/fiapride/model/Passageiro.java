package br.com.fiapride.model;

//Define a estrutura. Ela não é o passageiro real, apenas um modelo
public class Passageiro {
    //Atributos (características)
    public String nome;
    public String cpf;
    public double saldo;

    public Passageiro(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf; //Novo Atributo
        this.saldo = 0.0; //Saldo Padrão   
        
    }

    public void adicionarSaldo(double valor) {
        if (valor <= 0) {
            System.out.println("O valor de recarga deve ser maior que zero.");
            return;

        }

        this.saldo += valor;
        System.out.println("Recarga realizada. Novo saldo: R$" + this.saldo);

    }

    public void pagarViagem(double custo) {
        if (custo <= 0) {
            System.out.println("O custo deve ser positivo e o saldo suficiente.");
            return;
        }

        if (this.saldo < custo) {
            System.out.println("Saldo insuficiente para realizar a viagem.");
            return;
        }

        this.saldo -= custo;
        System.out.println("Viagem paga. Saldo restante: R$" + this.saldo);
    }

}
