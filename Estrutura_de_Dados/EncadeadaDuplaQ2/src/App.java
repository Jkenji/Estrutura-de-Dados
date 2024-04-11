import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);

        System.out.print("Digite o valor de n:");
        int n = read.nextInt();

        ListaG listaGrande = new ListaG();
        System.out.println("Matriz:");
        for (int i = 1; i <= n; i++){
            listaGrande.inserirFim(new ListaP());
            for (int j = 1; j <= n; j++){
                listaGrande.tail.data.inserirFim(new Random().nextInt(99)+1);
            }
            listaGrande.tail.data.percorrerInicio();
        }
        listaGrande.somaLinha();
        listaGrande.somaMatriz();

       
        
    }
}
