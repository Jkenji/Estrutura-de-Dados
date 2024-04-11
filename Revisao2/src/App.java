import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Pilha pilha = new Pilha();
        Scanner scan = new Scanner(System.in);

        String opcao;
        String url;
        String titulo;

        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Adicionar novo site");
            System.out.println("2. Retornar para o site anterior");
            System.out.println("3. Sair");
            opcao = scan.next();

            if (opcao.equals("1")) {
                System.out.println("Informe a URL do site: ");
                url = scan.next();
                System.out.println("Informe o titulo do site: ");
                titulo = scan.next();
                pilha.push(new Pagina(url, titulo));

            } else if (opcao.equals("2")) {
                pilha.pop();
            } else if (opcao.equals("3")) {
                break;
            }

            pilha.peek();

        }
    }
}
