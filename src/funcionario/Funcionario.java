public class Funcionario{
    private String nome;
    private double salario;
    private String departamento;

    double calcularSalario(double salario, double porcentagem){
        double novoSalario = salario + (salario * (porcentagem/100));
        
        return novoSalario; 
    }

    void exibirinfo(String nome, double salarioFinal, String departamento){
        System.out.println("O salario do funcionario " + nome + " do departamento de " + departamento + " foi atualizado para " + salarioFinal);
    }
}