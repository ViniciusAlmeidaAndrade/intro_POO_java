public class Main {
    public static void main(String[] args){

        Funcionario funcionario = new Funcionario();

        double salarioFinal = funcionario.calcularSalario(2000, 50);

        funcionario.exibirinfo("Vinícius", salarioFinal, "TI");
    }
}
