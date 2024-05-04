import java.util.Scanner;
public class MainMultiplicacionPOO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MultiplicacionPOO mult = new MultiplicacionPOO();
        
        System.out.println("Ingresa el primer numero: ");
        mult.setA(sc.nextInt());

        System.out.println("Ingresa el segundo numero: ");
        mult.setB(sc.nextInt());

        System.out.println(mult.multiplicar());
        System.out.println(mult.toString());

        mult.getA();
        mult.getB();
    }
}