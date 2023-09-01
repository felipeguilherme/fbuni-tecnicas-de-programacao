import java.time.LocalDate;
import java.time.Period;

public class Pessoa {

    private static final float AGUA_POR_PESO = 35;

    String nomePessoa;
    LocalDate dataNascimentoPessoa;
    float pesoPessoa;
    float alturaPessoa;

    public Pessoa(String nomePessoa, LocalDate dataNascimentoPessoa, float pesoPessoa, float alturaPessoa) {
        this.nomePessoa = nomePessoa;
        this.dataNascimentoPessoa = dataNascimentoPessoa;
        this.pesoPessoa = pesoPessoa;
        this.alturaPessoa = alturaPessoa;
    }


    public float calcularIMC() {

        return pesoPessoa / (alturaPessoa * alturaPessoa);
    }

    public float calcularQuantidadeAgua() {

        return pesoPessoa * AGUA_POR_PESO;
    }


    public int calcularIdade() {

        LocalDate hoje = LocalDate.now();
        Period periodo = Period.between(dataNascimentoPessoa, hoje);
        return periodo.getYears();
    }

    public void mostra() {

        System.out.println("Nome: " + nomePessoa);
        System.out.println("Data de Nascimento: " + dataNascimentoPessoa);
        System.out.println("Idade: " + calcularIdade());
        System.out.println("IMC: " + calcularIMC());
        System.out.println("Quantidade de Água: " + calcularQuantidadeAgua() + " litros");

    }

    @Override
    public String toString() {
        return "Nome: " + nomePessoa +
                "\nData de Nascimento: " + dataNascimentoPessoa +
                "\nIdade: " + calcularIdade() +
                "\nIMC: " + calcularIMC() +
                "\nQuantidade de Água: " + calcularQuantidadeAgua() + " litros";
    }
}


