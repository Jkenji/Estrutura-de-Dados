public class App {
    public static void main(String[] args) throws Exception {
        Fila fila = new Fila();

        fila.add(new Pedido("pizza", 20));
        fila.add(new Pedido("hamburguer", 15));
        fila.add(new Pedido("sushi", 30));
        fila.add(new Pedido("salada", 10));

        int tempoTotalPreparo = 0;

        while (!fila.isEmpty()) {
            Pedido pedidoAtual = fila.remove();
            System.out.println("Preparando pedido de " + pedidoAtual.itens + " (Tempo estimado de preparo: "
                    + pedidoAtual.tempoPreparo + " minutos)");
            tempoTotalPreparo += pedidoAtual.tempoPreparo;
            try {
                // Simula o tempo de preparo do pedido
                Thread.sleep(pedidoAtual.tempoPreparo * 1000); // Convertendo minutos para milissegundos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(
                "Todos os pedidos foram preparados. Tempo total de preparo: " + tempoTotalPreparo + " minutos.");
    }
}