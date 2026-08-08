import java.util.InputMismatchException;
import java.util.Scanner;

public class MainDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese el numerador: ");
            double numerador = sc.nextDouble();

            System.out.print("Ingrese el denominador: ");
            double denominador = sc.nextDouble();

            double resultado = dividir(numerador, denominador);
            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error: debe ingresar valores numéricos.");
        } finally {
            sc.close();
        }
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir entre cero.");
        }
        return a / b;
    }
}