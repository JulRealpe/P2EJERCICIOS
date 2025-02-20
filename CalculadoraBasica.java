import java.util.Scanner;

public class CalculadoraBasica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        double numero1, numero2;

        do {
            System.out.println("Seleccione una operación:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Ingrese el primer número: ");
                numero1 = scanner.nextDouble();
                System.out.print("Ingrese el segundo número: ");
                numero2 = scanner.nextDouble();

                switch (opcion) {
                    case 1:
                        System.out.println("Resultado de la suma: " + sumar(numero1, numero2));
                        break;
                    case 2:
                        System.out.println("Resultado de la resta: " + restar(numero1, numero2));
                        break;
                    case 3:
                        System.out.println("Resultado de la multiplicación: " + multiplicar(numero1, numero2));
                        break;
                    case 4:
                        if (numero2 != 0) {
                            System.out.println("Resultado de la división: " + dividir(numero1, numero2));
                        } else {
                            System.out.println("Error: No se puede dividir por cero.");
                        }
                        break;
                }
            } else if (opcion == 5) {
                System.out.println("Saliendo de la calculadora...");
            } else {
                System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 5);

        scanner.close();
    }

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        return a / b;
    }
}
