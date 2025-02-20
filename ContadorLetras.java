import java.util.Scanner;

public class ContadorLetras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una palabra en minúsculas: ");
        String palabra = scanner.nextLine();

        int vocales = 0, consonantes = 0;

        for (char letra : palabra.toCharArray()) {
            if (esVocal(letra)) {
                vocales++;
            } else if (esConsonante(letra)) {
                consonantes++;
            }
        }

        System.out.println("Número de vocales: " + vocales);
        System.out.println("Número de consonantes: " + consonantes);

        scanner.close();
    }

    public static boolean esVocal(char c) {
        return "aeiou".indexOf(c) != -1;
    }
