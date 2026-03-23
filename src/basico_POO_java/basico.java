// public class basico {
//     // nome da class tem que ser o restritamente igual ao do arquivo
//     public static void main(String[] args) {
//     // Um metodo(Que é a mesma coisa de função), pode ser string, int, etc                       
//         System.out.println("Hello, word");
//         // print"ln" é para quebrar linha 
//     }
// }

/*
---------------
?TIPOS DE DADOS
---------------
int idade = 25;
double salario = 50000.50;
float salario = 50000.0
string nome = 'vinicius' 
char initial = 'A';
boolean isActivate = true;
*/


/*
-------------------------------------------
?Estruturas de Controle (if, switch, loops)
-------------------------------------------
if, else if, else;
switch;
for, while, do-while
*/


/*
    -----------------
?    Funções/metodos
    -----------------
    public static int addNumbers(int a, int b){
        return a + b;
--------------------------------------------------------

    public class exemplofuncao{
        public static int soma(int a, int b){
            return a + b;
        }
        public static void main(String[] args){
        
            !chama a função soma e armazena o resultado
            int resultado = soma(5, 7);
            
            !Exibe resultado
            System.out.println("A soma de 5 e 7 é: " + resultado);
                                                    ---> concatenação
    }
*/

/*
----------------
?    Arrays
----------------

int[] numbers = {1, 2, 3, 4, 5};
System.out.println(numbers[0]); --> retorna 1
*/

/*
-------------------------
?COMPONENTES PRINCIPAIS
-----------------------

!CLASSES: modelo onde agrupa atributos e metodos que objetos devem ter dentro dele.

!OBJETOS:é uma instância concreta criada a partir de uma classe, com valores específicos para seus atributos.

!ATRIBUTOS: são as caracteristicas que a classe tem

!METODOS:são as ações/o que ela faz

!EXEMPLO: classe: Pessoa ==> Atributos: nome, idade ==> metodos: comer, caminhar, correr... ===> Objetos: objeto pessoa1 vai pegar de classe suas caracteristicas(atributos) que modem joaozinho o que ela faz(metodos) =  pessoa 1 vai ter um nome que vai ser recebido de alguma forma e a pessoa 1 vai comer e correr.

Exemplo pratico:

!Classe Carro - define o modelo para objetos do tipo Carro
public class Carro {
    !Atributos (características)
    private String marca;
    private String modelo;
    private int ano;

    !Construtor - inicializa os atributos do objeto
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    !Métodos (comportamentos)
    public void acelerar() {
        System.out.println("O carro está acelerando.");
    }

    public void frear() {
        System.out.println("O carro está freando.");
    }

    !Método para exibir informações do carro
    public void exibirInfo() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano);
    }
}   


OU CRINDO OBJETOS A PARTIR DA CLASSE

!Classe principal para testar o objeto
public class Main {
    public static void main(String[] args) {
        !Criando um objeto (instância) da classe Carro
        Carro meuCarro = new Carro("Toyota", "Corolla", 2020);

        !Usando métodos do objeto
        meuCarro.exibirInfo();     // Saída: Marca: Toyota, Modelo: Corolla, Ano: 2020
        meuCarro.acelerar();       // Saída: O carro está acelerando.
        meuCarro.frear();          // Saída: O carro está freando.
    }
}   
*/
/*
Princípios Fundamentais

!• Encapsulamento: Os detalhes internos de um objeto são ocultados dos usuários do objeto, que só podem interagir com ele através de métodos públicos;

!• Herança: Permite criar novas classes baseadas em classes existentes, promovendo a reutilização de código;

!• Polimorfismo: Permite que objetos de diferentes classes sejam tratados como objetos de uma classe comum, principalmente através de métodos sobrescritos;

!• Abstração: Foco nas características essenciais de um objeto, ignorando detalhes complexos desnecessários.

*/

/*
---------------
EXEMPLO CLASSES
---------------
public class Pessoa {
    !Atributos 
    String nome;
    int idade;

    !Metódo
    void exibirInformacoes(){
        Systema.out.println("nome" + nome);
        Systema.out.println("idade" + idade);
    }
}
*/


/*
-----------------
EXEMPLO OBJETO
----------------

PUBLIC CLASS MAIN{
    PUBLIC STATIC VOID MAIN(STRING[] ARGS){

    !CRIACAO DE UM OBJETO DA CLASSE PESSOA
    PESSOA PESSOA1 = NEW PESSOA();    
    
    !DEFININDO VALORES PARA OS ATRIBUTOS DO OBJETO
    PESSOA1.NOME = "JOÃO";
    PESSOA1.IDADE = 30; 
    
    !CHAMANDO O METODO DO OBJETO
    PESSOA1.EXIBIRINFORMACOES();
    }
}
*/