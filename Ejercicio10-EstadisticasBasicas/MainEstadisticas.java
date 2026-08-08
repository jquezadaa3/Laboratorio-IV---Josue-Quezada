import java.util.Scanner;

public class MainEstadisticas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número #" + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
            suma += numeros[i];
        }

        double promedio = (double) suma / numeros.length;

        int mayor = numeros[0];
        int menor = numeros[0];
        for (int n : numeros) {
            if (n > mayor) mayor = n;
            if (n < menor) menor = n;
        }

        System.out.println("Suma: " + suma);
        System.out.printf("Promedio: %.2f%n", promedio);
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);

        sc.close();
    }
}
