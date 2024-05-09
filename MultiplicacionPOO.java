public class MultiplicacionPOO {
    private int a, b, resultado; // Definición de variables de instancia para los números a multiplicar y el resultado.
    public int getA() {
        return a;
    }

    // Método para realizar la multiplicación.
    public int multiplicar() {
        resultado = this.a * this.b; // Realiza la multiplicación y guarda el resultado en la variable de instancia resultado.
        return resultado; // Devuelve el resultado de la multiplicación.
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    // Metodos getters y setters

    // Método toString para representar el objeto MultiplicacionPOO como una cadena de texto.
    @Override
    public String toString() {
        return "MultiplicacionPOO [Primer numero=" + a + ", Segundo numero=" + b + ", Resultado=" + resultado + "]";
    }
}
