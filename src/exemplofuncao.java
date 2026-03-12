import java.util.Scanner;

public class exemplofuncao{
    public static int soma(int a, int b){
        return a + b;
    }
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        int a = leitor.nextInt();
        System.out.print("Digite o segundo numero: ");
        int b = leitor.nextInt();
        
        int resultado = soma(a, b);
        
        System.out.println("A soma de " + a +" e " + b + " é: " + resultado);
        
        leitor.close();
    }
}