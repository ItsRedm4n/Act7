import java.util.Arrays;

public class Algoritmos {
    private int valor;
    // Constructor que inicializa el atributo 'valor'
    public Algoritmos(int valor) {
        this.valor = valor;
    }

    // Método para calcular n números primos
    public int[] calcularNumerosPrimos() {
        int[] primos = new int[valor];
        int count = 0;
        int num = 2;  // Iniciamos con el primer número primo
        while (count < valor) {
            if (esPrimo(num)) {
                primos[count] = num;
                count++;
            }
            num++;
        }
        return primos;
    }

    // Método para calcular la Sucesión de Fibonacci
    public int[] calcularFibonacci() {
        int[] fibonacci = new int[valor];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for (int i = 2; i < valor; i++) {
            // Cada número en la sucesión es la suma de los dos anteriores
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        return fibonacci;
    }

    // Método privado para verificar si un número es primo
    private boolean esPrimo(int num) {
        if (num <= 1) {
            return false;  // 1 y números negativos no son primos
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;  // Si es divisible por algún número, no es primo
            }
        }
        return true;  // Si no se encontraron divisores, es primo
    }

    // Método main para probar los algoritmos y mostrar resultados
    public static void main(String[] args) {
        // Crear una instancia de la clase Algoritmos con valor 10
        Algoritmos algoritmos = new Algoritmos(10);
        // Calcular números primos y Fibonacci
        int[] primos = algoritmos.calcularNumerosPrimos();
        int[] fibonacci = algoritmos.calcularFibonacci();
        // Imprimir resultados en el formato deseado
        System.out.println("Números primos:");
        imprimirArreglo(primos);
        System.out.println("\nSucesión de Fibonacci:");
        imprimirArreglo(fibonacci);
    }

    // Método auxiliar para imprimir un arreglo
    private static void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]);
            if (i < arreglo.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
