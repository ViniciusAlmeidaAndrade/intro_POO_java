package desafio_empresa_emcapsulamento;
public class App {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("João", 2000);
        funcionario1.calcularSalario();

        Gerente gerente1 = new Gerente("Maria", 4000, 1500);
        gerente1.calcularSalario();

        Desenvolvedor desenvolvedor1 = new Desenvolvedor("Carlos", 3000, 10, 50);
        desenvolvedor1.calcularSalario();
        
        System.out.println(funcionario1);
        System.out.println(gerente1);
        System.out.println(desenvolvedor1);
    }
}