import java.util.Scanner;

public class InvertirCadena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una cadena de texto: ");
        String cadena = scanner.nextLine();

        String cadenaInvertida = invertirCadena(cadena);

        System.out.println("Cadena invertida: " + cadenaInvertida);

        scanner.close();
    }

    public static String invertirCadena(String texto) {
        StringBuilder invertida = new StringBuilder(texto);
        return invertida.reverse().toString();
    }
}
