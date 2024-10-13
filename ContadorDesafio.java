import java.util.Scanner;

public class ContadorDesafio {

    public static void contador(int valorInicio, int valorFim) throws ParametrosInvalidosException{
        try {
            if (valorInicio > valorFim) {
                throw new ParametrosInvalidosException();
            }
        } catch (Exception e){
            e.printStackTrace();
        }

        int contegem = valorFim - valorInicio;

        for (int i = 0; i < contegem; i++) {
            System.out.printf("Imprimindo número %d\n",i+1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor de inicio da contagem: ");
        int valorInicio = input.nextInt();
        System.out.println("Digite o valor de término da contagem:");
        int valorFim = input.nextInt();

        contador(valorInicio,valorFim);
//        contador(99,30);
    }
}