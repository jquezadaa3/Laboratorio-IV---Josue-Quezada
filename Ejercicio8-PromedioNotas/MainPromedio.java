import java.util.Scanner;

public class MainPromedio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[5];
        double suma = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Ingrese la nota #" + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
            suma += notas[i];
        }

        double promedio = suma / notas.length;
        System.out.printf("El promedio de las 5 notas es: %.2f%n", promedio);

        sc.close();
    }
}
