package heranca;

public class TesteAnimal{
    public static void main(String[] args){       
        // Criando obejeto da class Animal
        Animal animal = new Animal("Generic Animal");
        animal.emitirSom();
        
        // Criando objeto da classe cachorro
        Cachorro cachorro = new Cachorro("Rex");
        cachorro.emitirSom();
    }
}