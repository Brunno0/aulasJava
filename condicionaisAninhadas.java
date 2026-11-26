

public class Main {
    public static void main(String[] args) {
       boolean cadastroAtivo = true;
       boolean livroDisponivel = false;

        if (cadastroAtivo) {
            if (livroDisponivel) {
              System.out.println("Empréstimo permitido.");
                } else {
              System.out.println("Livro indisponível.");
            }
        } else {
             System.out.println("Atualize o cadastro.");
        }
    }
}