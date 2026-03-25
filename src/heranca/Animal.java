package heranca;

public class Animal {
    private String nome;

    // Construtor
    public Animal(String nome){
        this.nome = nome;
    }

    // Metodo getter
    public String getNome(){
        return nome;
    }

    // Metodo para exibir som de animal
    public void emitirSom(){
        System.out.println("O animal faz um som. ");
    }
}
