import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double somaAvaliacao = 0;
        double nota = 0;
        double contador = 0;

        while (nota != -1){
            System.out.println("Diga sua nota ou -1 para encerrar:");
            nota = leitura.nextDouble();

            if (nota != -1){
                somaAvaliacao += nota;
                contador++;
            }

        }
        System.out.println("A média das avaliações é: " + somaAvaliacao/contador);
    }
}
