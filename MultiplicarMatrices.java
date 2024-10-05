import java.util.Scanner;

public class MultiplicarMatrices {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int filaA, columnaA, filaB, columnaB;

        // Ciclo que se repite hasta que las dimensiones de las matrices sean válidas
        while (true) {
            // Se pide el orden de las matrices
            System.out.println("Ingrese el número de filas de la matriz A:");
            filaA = sc.nextInt();
            System.out.println("Ingrese el número de columnas de la matriz A:");
            columnaA = sc.nextInt();
            System.out.println("Ingrese el número de filas de la matriz B:");
            filaB = sc.nextInt();
            System.out.println("Ingrese el número de columnas de la matriz B:");
            columnaB = sc.nextInt();

            // Verificar si las matrices son multiplicables
            if (columnaA != filaB) {
                System.out.println("La multiplicación de matrices no es posible. El número de columnas de A debe ser igual al número de filas de B.");
                System.out.println("Ingrese nuevamente las dimensiones.");
            } else {
                break;
            }
        }

        // Inicializar matrices A, B y C después de verificar que la operación entre dichas matrices si es valida en base a sus dimensiones
        int[][] matrizA = new int[filaA][columnaA];
        int[][] matrizB = new int[filaB][columnaB];
        int[][] matrizResultante = new int[filaA][columnaB]; // Matriz resultante

        // Solicitar los valores de la matriz A
        System.out.println("Ingrese los valores de la matriz A:");
        for (int i = 0; i < filaA; i++) {
            for (int j = 0; j < columnaA; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                matrizA[i][j] = sc.nextInt();
            }
        }

        // Solicitar los valores de la matriz B
        System.out.println("Ingrese los valores de la matriz B:");
        for (int i = 0; i < filaB; i++) {
            for (int j = 0; j < columnaB; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                matrizB[i][j] = sc.nextInt();
            }
        }

        // Multiplicación de matrices
        for (int i = 0; i < filaA; i++) {
            for (int j = 0; j < columnaB; j++) {
                matrizResultante[i][j] = 0; // Inicializamos el valor de la celda
                for (int k = 0; k < columnaA; k++) {
                    matrizResultante[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        // Imprimir la matriz resultante C
        System.out.println("Resultado de la multiplicación de matrices:");
        for (int i = 0; i < filaA; i++) {
            for (int j = 0; j < columnaB; j++) {
                System.out.print(matrizResultante[i][j] + " ");
            }
            System.out.println();
        }
        // Cerrar el scanner al final
        sc.close();
    }
}
