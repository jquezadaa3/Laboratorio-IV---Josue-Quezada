import java.util.InputMismatchException;
import java.util.Scanner;

public class MainEdad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad = -1;
        boolean valido = false;

        while (!valido) {
            try {
                System.out.print("Ingrese su edad: ");
                edad = sc.nextInt();

                if (edad < 0) {
                    throw new IllegalArgumentException("La edad no puede ser negativa.");
                }

                valido = true;

            } catch (InputMismatchException e) {
                System.out.println("Error: debe ingresar un número entero.");
                sc.nextLine(); 
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        System.out.println("Edad válida ingresada: " + edad);
        sc.close();
    }
}

