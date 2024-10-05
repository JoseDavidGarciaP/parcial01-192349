import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        // Creamos el scanner y declaramos las variables
        Scanner scanner = new Scanner(System.in);
        int firstNumber; //a
        int secondNumber; //b
        int divisores;

        //Pedimos a y b por teclado
        System.out.println("Ingrese el primer numero:");
        firstNumber = scanner.nextInt();
        System.out.println("Ingrese el segundo numero:");
        secondNumber = scanner.nextInt();

        // Encontramos los primos entre dicho intervalo
        System.out.println("Los números primos son: ");
        for (int i = firstNumber; i <= secondNumber; i++ ){
            divisores = 0;
            for (int j = 1; j <= i; j++){
                if (i % j == 0){
                    divisores ++;
                }
            }
            if (divisores == 2) {
                System.out.print(i + " ");
            }
        }

        // Cerramos Scanner
        scanner.close();
    }
}