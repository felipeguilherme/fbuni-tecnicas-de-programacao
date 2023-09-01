import java.time.LocalDate;

public class Conta {

    String cpfCliente;
    int numeroConta;
    float saldoConta;
    boolean clienteEspecial;

    public Conta(String cpfCliente, int numeroConta, float saldoConta, boolean clienteEspecial) {
        this.cpfCliente = cpfCliente;
        this.numeroConta = numeroConta;
        this.saldoConta = saldoConta;
        this.clienteEspecial = clienteEspecial;
    }

    public float saldoComBonificacao (){

        if (clienteEspecial == true){
            float saldoAposBonificacao = saldoConta * 0.1f;
            return saldoAposBonificacao;
        } else {
            float saldoAposBonificacao = saldoConta * 0.05f;
            return saldoAposBonificacao;
        }
    }

    public float saqueConta(float valorSaque){
        if (valorSaque <= saldoConta) {
            saldoConta -= valorSaque;
        } else {
            System.out.println("Saldo insuficiente para o saque.");
        }
        return saldoConta;
    }

    public float depositoConta(float valorDeposito){
        saldoConta += valorDeposito;
        return saldoConta;

    }

    public void trasnferirValor(float valorTransferencia, Conta contaDestino){

        if (valorTransferencia <= saldoConta) {

            saldoConta -= valorTransferencia;
            contaDestino.depositoConta(valorTransferencia);
            System.out.println("Transferência realizada com sucesso.");

        } else {
            System.out.println("Saldo insuficiente para a transferência.");
        }

    }


    public void mostrar() {

        System.out.println("CPF: " + cpfCliente);
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Saldo: " + saldoConta);
        System.out.println("Valor da bonificação: " + saldoComBonificacao());

    }

}


