import java.util.InputMismatchException;
import java.util.Scanner;

public class MainEntrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        boolean valido = false;

        while (!valido) {
            System.out.print("Ingrese un número entero: ");
            try {
                numero = sc.nextInt();
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: eso no es un número. Intente de nuevo.");
                sc.nextLine();
        }

        System.out.println("Número ingresado correctamente: " + numero);
        sc.close();
    }
}
}
