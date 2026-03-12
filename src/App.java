public class App {
    public static void main(String[] args) throws Exception {
        Livro livro1 = new Livro();

        livro1.titulo = "João e o pé de feijão";
        livro1.autor = "Joaozinho";
        livro1.anoPublicacao = 1998;

        livro1.infoLivro();
    }
}
