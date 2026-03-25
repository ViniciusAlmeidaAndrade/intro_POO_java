package encapsulamento;
// Encapsulamento no Main

public class Main {
    public static void main(String[] args){
        // Criando objeto da classe Carro
        Carro carro = new Carro("Fusca", 1979);
        
        // Exibindo as infromacoes do carro
        carro.exibirInformacoes();

        // Modificando atributos
        carro.setModelo("Gol");
        carro.setAno(2020);

        carro.exibirInformacoes();
    }
}
