public class Eletronico extends Produto {
    private String marca;

    public Eletronico(String nome, double preco, String marca) {
        super(nome, preco);
        this.marca = marca;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }
    public void exibirInformacoes(){
        System.out.println("nome" + getNome());
        System.out.println("preco" + getPreco());
        System.out.println("marca" + marca);
    }
}
