import java.util.Scanner;

public class MainMultiplicacionPOO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Crear un objeto Scanner para leer la entrada del usuario.
        MultiplicacionPOO mult = new MultiplicacionPOO(); // Crear un objeto MultiplicacionPOO.

        // Solicitar al usuario que ingrese los dos números.
        System.out.println("Ingresa el primer numero: ");
        mult.setA(sc.nextInt()); // Leer el primer número y asignarlo a 'a' mediante el método setA.

        System.out.println("Ingresa el segundo numero: ");
        mult.setB(sc.nextInt()); // Leer el segundo número y asignarlo a 'b' mediante el método setB.

        System.out.println(mult.multiplicar()); // Imprimir el resultado de la multiplicación.
        System.out.println(mult.toString()); // Imprimir la representación en cadena del objeto MultiplicacionPOO.

        mult.getA(); // Este método se llama, pero su valor de retorno no se usa ni se imprime.
        mult.getB(); // Este método se llama, pero su valor de retorno no se usa ni se imprime.
    }
}
