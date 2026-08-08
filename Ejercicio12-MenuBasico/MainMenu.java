import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n===== MENÚ =====");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el primer número: ");
                    double a1 = sc.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    double b1 = sc.nextDouble();
                    System.out.println("Resultado: " + (a1 + b1));
                    break;

                case 2:
                    System.out.print("Ingrese el primer número: ");
                    double a2 = sc.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    double b2 = sc.nextDouble();
                    System.out.println("Resultado: " + (a2 - b2));
                    break;

                case 3:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 3);

        sc.close();
    }
}
