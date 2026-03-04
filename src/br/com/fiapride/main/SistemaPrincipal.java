                                    // PASSAGEIROS

/* package br.com.fiapride.main;

//Importar a classe Passageiro para usar aqui e para que o sistema reconheça 
import br.com.fiapride.model.Passageiro;

public class SistemaPrincipal {
    public static void main(String[] args) {
        //Criar um passageiro (objeto 1)
        Passageiro passageiro1 = new Passageiro();
        passageiro1.nome = "Guilherme";
        passageiro1.saldo = 120.0;

        //Criar outro passageiro (objeto 2)
        Passageiro passageiro2 = new Passageiro();
        passageiro2.nome = "Claus";
        passageiro2.saldo = 60.0;

        //Exibir as informações do passageiro no conseole

        // Exibindo os dados no Console
    System.out.println("--- Sistema FiapRide ---");
    System.out.println("Passageiro: " + passageiro1.nome + " | Saldo: R$" + passageiro1.saldo);
    System.out.println("Passageiro: " + passageiro2.nome + " | Saldo: R$" + passageiro2.saldo);
// Teste mental: Se eu mudar o nome do passageiro1, o passageiro2 muda?
        
    }
} */

                                    //CELULAR SAMSUNG
/* package br.com.fiapride.main;
//Importar a classe Celular para usar aqui e para que o sistema reconheça

import br.com.fiapride.model.Celular;

public class SistemaPrincipal {
    public static void main(String[] args) {

//Dentro do main fabicar a primeira instancia (objeto celular1)
Celular meuCelular1 = new Celular();
meuCelular1.capacidadeGB = 512;
meuCelular1.cor = "Azul";

//Fabricar a segunda instancia (objeto celular2)
Celular meuCelular2 = new Celular();
meuCelular2.capacidadeGB = 128;
meuCelular2.cor = "Branco";

//Exibir as informações do celular no console
System.out.println("Meu celular é: " + meuCelular1.cor);
System.out.println("O celular do professor é: " + meuCelular2.cor);
System.out.println("Capacidade do meu celular: " + meuCelular1.capacidadeGB + " GB");
System.out.println("Capacidade do celular do professor: " + meuCelular2.capacidadeGB + " GB");
    }
}
 */



                                    //PASSAGEIRO COM MÉTODOS


/* package br.com.fiapride.main;

 // Importamos a classe Passageiro para que o sistema a reconheça
 import br.com.fiapride.model.Passageiro;

public class SistemaPrincipal {

public static void main(String[] args) {
// INSTANCIAÇÃO
// O comando 'new' aloca memória para um novo objeto.
// Criando o primeiro passageiro (Objeto 1)
Passageiro passageiro1 = new Passageiro("Guilherme", "222.333.444-55");
System.out.println("Regarga passageiro 1");
passageiro1.adicionarSaldo(120.0);
// Criando o segundo passageiro (Objeto 2)
Passageiro passageiro2 = new Passageiro("Claus", "666.777.888-99");
System.out.println("Regarga passageiro 2");
passageiro2.adicionarSaldo(260.0);
System.out.println("--- Sistema FiapRide ---");
System.out.println("Passageiro: " + passageiro1.nome + " | Saldo: R$ " + passageiro1.saldo + " | CPF: " + passageiro1.cpf);

System.out.println("Passageiro: " + passageiro2.nome + " | Saldo: R$ " + passageiro2.saldo + " | CPF: " + passageiro2.cpf);


System.out.println("Pagando viagem do passageiro 1");
passageiro1.pagarViagem(10);
System.out.println("Pagando viagem do passageiro 2");
passageiro2.pagarViagem(40);
    }

} */

                                        //CELULAR COM MÉTODO

package br.com.fiapride.main;

import br.com.fiapride.model.Celular;

public class SistemaPrincipal {
    public static void main(String[] args) {

        Celular meuCelular = new Celular();

        // Teste com valores válidos
        meuCelular.setCor("Preto");
        meuCelular.setCapacidadeGB(128);
        meuCelular.setModelo("Galaxy S24");
        System.out.println("Modelo: " + meuCelular.modelo);
        System.out.println("Cor: " + meuCelular.cor);
        System.out.println("Capacidade: " + meuCelular.capacidadeGB + "GB");

        // Teste com valores inválidos
        meuCelular.setCor("");
        meuCelular.setCapacidadeGB(-10);
        meuCelular.setModelo("");
    }
}
