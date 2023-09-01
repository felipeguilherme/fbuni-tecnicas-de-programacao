//import java.time.LocalDate;
//
//public class Main {
//    public static void main(String[] args) {
//
//        LocalDate dataNascimento = LocalDate.of(1992, 5, 8);
//        Pessoa pessoa = new Pessoa("João", dataNascimento, 55.0f, 1.75f);
//
//        pessoa.mostra();
//    }
//}

public class Main {
    public static void main(String[] args) {

        Conta conta1 = new Conta("123456765432", 12345, 5000.0f, true);
        Conta conta2 = new Conta("123432234523", 12346, 1000.0f, true);


//        conta.saqueConta(3000);
//
//        conta.depositoConta(8000);
//
//        conta.mostrar();

        conta1.trasnferirValor(2000f, conta2);

        conta1.mostrar();
        conta2.mostrar();

    }
}
