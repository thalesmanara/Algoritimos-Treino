import java.util.concurrent.ThreadLocalRandom;

public class Doces {
    public static void main(String[] args) throws Exception {
        int mesada = 50;
        while (mesada > 0) {
            int valorDoce = valorAleatorio();

            //Previne que a subtração do último doce deixe a mesada negativa
            if (valorDoce > mesada) {
                valorDoce = mesada;
            }
            
            System.out.println("Doce de valor " + valorDoce + " adicionado.");

            mesada = mesada - valorDoce; 

            System.out.println("Mesada restante: " + mesada);
        }
        System.out.println("Gastou toda a mesada.");
}

public static int valorAleatorio(){
    //Gera o valor aleatório para o doce dentro do intervalo 2 e 8
    return ThreadLocalRandom.current().nextInt(2,8);
}
}
